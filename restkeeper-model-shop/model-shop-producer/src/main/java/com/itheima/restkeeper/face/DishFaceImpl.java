package com.itheima.restkeeper.face;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.restkeeper.AffixFace;
import com.itheima.restkeeper.DishFace;
import com.itheima.restkeeper.enums.DishEnum;
import com.itheima.restkeeper.exception.ProjectException;
import com.itheima.restkeeper.pojo.Dish;
import com.itheima.restkeeper.req.DishVo;
import com.itheima.restkeeper.service.IDishFlavorService;
import com.itheima.restkeeper.service.IDishService;
import com.itheima.restkeeper.utils.BeanConv;
import com.itheima.restkeeper.utils.EmptyUtil;
import com.itheima.restkeeper.utils.ExceptionsUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName DishFaceImpl.java
 * @Description 菜品接口实现
 */
@Slf4j
@DubboService(version = "${dubbo.application.version}",timeout = 5000,
        methods ={
                @Method(name = "findDishVoPage",retries = 2),
                @Method(name = "createDish",retries = 0),
                @Method(name = "updateDish",retries = 0),
                @Method(name = "deleteDish",retries = 0)
        })
public class DishFaceImpl implements DishFace {

    @Autowired
    IDishService dishService;

    @Autowired
    IDishFlavorService dishFlavorService;

    @Autowired
    RedissonClient redissonClient;

    @DubboReference(version = "${dubbo.application.version}",check = false)
    AffixFace affixFace;

    @Override
    public Page<DishVo> findDishVoPage(DishVo dishVo,
                                       int pageNum,
                                       int pageSize)throws ProjectException {
        return null;
    }

    /**
     *
     */
    @Override
    @Transactional
    public DishVo createDish(DishVo dishVo) throws ProjectException{
        return null;
    }

    @Override
    public Boolean updateDish(DishVo dishVo) throws ProjectException {
        return false;
    }

    @Override
    public Boolean deleteDish(String[] checkedIds)throws ProjectException {
        return false;
    }

    @Override
    public DishVo findDishByDishId(Long dishId)throws ProjectException {
        try {
            //按菜品ID查找菜品
            Dish dish = dishService.getById(dishId);
            if (!EmptyUtil.isNullOrEmpty(dish)){
                return BeanConv.toBean(dish,DishVo.class);
            }
            return null;
        } catch (Exception e) {
            log.error("查找菜品所有菜品异常：{}", ExceptionsUtil.getStackTraceAsString(e));
            throw new ProjectException(DishEnum.SELECT_DISH_FAIL);
        }
    }

}
