package com.itheima.restkeeper.adapter.impl;

import com.itheima.restkeeper.adapter.NativePayAdapter;
import com.itheima.restkeeper.exception.ProjectException;
import com.itheima.restkeeper.req.OrderVo;
import com.itheima.restkeeper.req.RefundRecordVo;
import com.itheima.restkeeper.req.TradingVo;
import com.itheima.restkeeper.service.ITradingService;
import com.itheima.restkeeper.utils.RegisterBeanHandler;
import com.itheima.restkeeper.utils.ShowApiService;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName NativePayAdapterImpl.java
 * @Description Native支付方式适配实现：商户生成二维码，用户扫描支付
 */
@Slf4j
@Component
public class NativePayAdapterImpl implements NativePayAdapter {

    @Autowired
    ITradingService tradingService;

    @Autowired
    ShowApiService showApiService;

    @Autowired
    RegisterBeanHandler registerBeanHandler;

    @Autowired
    RedissonClient redissonClient;

    private static Map<String,String> nativePayHandlers =new HashMap<>();


    @Override
    public String queryQrCodeUrl(OrderVo orderVo) throws ProjectException {
        return null;
    }

    @Override
    public TradingVo createDownLineTrading(TradingVo tradingVo) throws ProjectException {
        return null;
    }

    @Override
    public TradingVo queryDownLineTrading(TradingVo tradingVo) throws ProjectException {
        return null;
    }

    @Override
    public TradingVo refundDownLineTrading(TradingVo tradingVo) throws ProjectException {
        return null;
    }

    @Override
    public void queryRefundDownLineTrading(RefundRecordVo refundRecordVo) throws ProjectException {

    }
}
