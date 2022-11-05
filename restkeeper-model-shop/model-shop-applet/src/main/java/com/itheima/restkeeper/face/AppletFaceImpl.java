package com.itheima.restkeeper.face;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.itheima.restkeeper.AffixFace;
import com.itheima.restkeeper.AppletFace;
import com.itheima.restkeeper.DataDictFace;
import com.itheima.restkeeper.constant.AppletCacheConstant;
import com.itheima.restkeeper.constant.SuperConstant;
import com.itheima.restkeeper.constant.TradingConstant;
import com.itheima.restkeeper.enums.DishEnum;
import com.itheima.restkeeper.enums.OpenTableEnum;
import com.itheima.restkeeper.enums.OrderEnum;
import com.itheima.restkeeper.enums.OrderItemEnum;
import com.itheima.restkeeper.enums.RotaryTableEnum;
import com.itheima.restkeeper.enums.ShoppingCartEnum;
import com.itheima.restkeeper.enums.TableEnum;
import com.itheima.restkeeper.exception.ProjectException;
import com.itheima.restkeeper.pojo.Brand;
import com.itheima.restkeeper.pojo.Category;
import com.itheima.restkeeper.pojo.Dish;
import com.itheima.restkeeper.pojo.DishFlavor;
import com.itheima.restkeeper.pojo.Order;
import com.itheima.restkeeper.pojo.OrderItem;
import com.itheima.restkeeper.pojo.Store;
import com.itheima.restkeeper.pojo.Table;
import com.itheima.restkeeper.req.AffixVo;
import com.itheima.restkeeper.req.AppletInfoVo;
import com.itheima.restkeeper.req.BrandVo;
import com.itheima.restkeeper.req.CategoryVo;
import com.itheima.restkeeper.req.DataDictVo;
import com.itheima.restkeeper.req.DishFlavorVo;
import com.itheima.restkeeper.req.DishVo;
import com.itheima.restkeeper.req.OrderItemVo;
import com.itheima.restkeeper.req.OrderVo;
import com.itheima.restkeeper.req.StoreVo;
import com.itheima.restkeeper.req.TableVo;
import com.itheima.restkeeper.service.IBrandService;
import com.itheima.restkeeper.service.ICategoryService;
import com.itheima.restkeeper.service.IDishFlavorService;
import com.itheima.restkeeper.service.IDishService;
import com.itheima.restkeeper.service.IOrderItemService;
import com.itheima.restkeeper.service.IOrderService;
import com.itheima.restkeeper.service.IStoreService;
import com.itheima.restkeeper.service.ITableService;
import com.itheima.restkeeper.utils.BeanConv;
import com.itheima.restkeeper.utils.EmptyUtil;
import com.itheima.restkeeper.utils.ExceptionsUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;
import org.redisson.api.RAtomicLong;
import org.redisson.api.RLock;
import org.redisson.api.RMapCache;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @ClassName AppletFaceImpl.java
 * @Description 小程序H5实现
 */
@Slf4j
@DubboService(version = "${dubbo.application.version}", timeout = 5000)
public class AppletFaceImpl implements AppletFace {


    @Override
    public Boolean isOpen(Long tableId) throws ProjectException {
        return null;
    }

    @Override
    public AppletInfoVo findAppletInfoVoByTableId(Long tableId) throws ProjectException {
        return null;
    }

    @Override
    public OrderVo openTable(Long tableId, Integer personNumbers) throws ProjectException {
        return null;
    }

    @Override
    public OrderVo showOrderVoforTable(Long tableId) throws ProjectException {
        return null;
    }


    @Override
    public DishVo findDishVoById(Long dishId) throws ProjectException {
        return null;
    }

    @Override
    public OrderVo opertionShoppingCart(Long dishId, Long orderNo, String dishFlavor, String opertionType) throws ProjectException {
        return null;
    }

    @Override
    public OrderVo placeOrder(Long orderNo) throws ProjectException {
        return null;
    }

    @Override
    public Boolean rotaryTable(Long sourceTableId, Long targetTableId, Long orderNo) throws ProjectException {
        return null;
    }

    @Override
    public Boolean clearShoppingCart(Long orderNo) throws ProjectException {
        return null;
    }
}
