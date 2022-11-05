package com.itheima.restkeeper.handler.alipay;

import com.itheima.restkeeper.exception.ProjectException;
import com.itheima.restkeeper.handler.NativePayHandler;
import com.itheima.restkeeper.req.RefundRecordVo;
import com.itheima.restkeeper.req.TradingVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ClassName AliNativePayHandler.java
 * @Description 支付宝Native支付方式：商户生成二维码，用户扫描支付
 */
@Slf4j
@Component
public class AliNativePayHandler implements NativePayHandler {

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
