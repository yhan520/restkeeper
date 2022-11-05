package com.itheima.restkeeper.handler;

import com.itheima.restkeeper.exception.ProjectException;
import com.itheima.restkeeper.req.TradingVo;

/**
 * @ClassName CashPayHandler.java
 * @Description 现金支付方式：商户收钱直接操作
 */
public interface CashPayHandler {

    /***
     * @description 现金支付方式：商户收钱直接操作接口
     * @param tradingVo 交易单
     * @return  交易单
     */
    TradingVo createCachTrading(TradingVo tradingVo) throws ProjectException;

    /***
     * @description 现金退款
     * @param tradingVo 交易单
     * @return  交易单
     */
    TradingVo refundCachTrading(TradingVo tradingVo);
}
