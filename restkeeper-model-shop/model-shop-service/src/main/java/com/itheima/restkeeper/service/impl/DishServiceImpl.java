package com.itheima.restkeeper.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.itheima.restkeeper.constant.SuperConstant;
import com.itheima.restkeeper.mapper.DishMapper;
import com.itheima.restkeeper.pojo.Dish;
import com.itheima.restkeeper.pojo.DishFlavor;
import com.itheima.restkeeper.req.DishVo;
import com.itheima.restkeeper.service.IDishFlavorService;
import com.itheima.restkeeper.service.IDishService;
import com.itheima.restkeeper.utils.EmptyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：菜品管理 服务实现类
 */
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements IDishService {

    @Autowired
    IDishFlavorService dishFlavorService;

    @Autowired
    DishMapper dishMapper;

    @Override
    public Page<Dish> findDishVoPage(DishVo dishVo, int pageNum, int pageSize) {
        return null;
    }

    @Override
    @Transactional
    public Dish createDish(DishVo dishVo) {
        return null;
    }

    /**
     * @Description 菜品拥有的口味
     */
    private List<String> dishHasDishFlavor(Long dishId){
        QueryWrapper<DishFlavor> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(DishFlavor::getDishId,dishId);
        List<DishFlavor> list = dishFlavorService.list(queryWrapper);
        ArrayList<String> listDataKeys = Lists.newArrayList();
        if (!EmptyUtil.isNullOrEmpty(list)){
            list.forEach(n->{
                listDataKeys.add(String.valueOf(n.getDataKey()));
            });
        }
        return listDataKeys;
    }

    @Override
    public Boolean updateDish(DishVo dishVo) {
       return false;
    }

    @Override
    public Boolean deleteDish(String[] checkedIds) {
        return false;
    }

    @Override
    public List<Dish> findDishVoByCategoryId(Long categoryId) {
        //构建查询条件：菜品起售，菜品有效
        LambdaQueryWrapper<Dish> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Dish::getCategoryId,categoryId)
                .eq(Dish::getEnableFlag,SuperConstant.YES)
                .eq(Dish::getDishStatus,SuperConstant.YES);
        //执行list查询
        return list(lambdaQueryWrapper);
    }


    @Override
    public Boolean updateDishNumber(Long step,Long dishId) {
        //修改菜品数量
        Integer row = dishMapper.updateDishNumber(step,dishId);
        return row==1;
    }

    @Override
    public List<Dish> findDishVos() {
        QueryWrapper<Dish> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Dish::getEnableFlag,SuperConstant.YES)
                .eq(Dish::getDishStatus,SuperConstant.YES);
        return list(queryWrapper);
    }


}
