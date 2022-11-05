package com.itheima.restkeeper.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.itheima.restkeeper.basic.BasicVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description：
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="RefundRecordVo对象", description="")
public class RefundRecordVo extends BasicVo {

    private static final long serialVersionUID = 1L;

    @Builder
    public RefundRecordVo(Long id,Long tradingOrderNo,Long productOrderNo,String refundNo,Long enterpriseId,Long storeId,String tradingChannel,String refundStatus,String refundCode,String refundMsg,String memo){
        super(id);
        this.tradingOrderNo=tradingOrderNo;
        this.productOrderNo=productOrderNo;
        this.refundNo=refundNo;
        this.enterpriseId=enterpriseId;
        this.storeId=storeId;
        this.tradingChannel=tradingChannel;
        this.refundStatus=refundStatus;
        this.refundCode=refundCode;
        this.refundMsg=refundMsg;
        this.memo=memo;
    }

    @ApiModelProperty(value = "交易系统订单号【对于三方来说：商户订单】")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long tradingOrderNo;

    @ApiModelProperty(value = "业务系统订单号")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long productOrderNo;

    @ApiModelProperty(value = "本次退款订单号")
    private String refundNo;

    @ApiModelProperty(value = "商户号")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long enterpriseId;

    @ApiModelProperty(value = "门店主键id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long storeId;

    @ApiModelProperty(value = "退款渠道【支付宝、微信、现金】")
    private String tradingChannel;

    @ApiModelProperty(value = "退款状态【成功：SUCCESS,进行中：SENDING】")
    private String refundStatus;

    @ApiModelProperty(value = "返回编码")
    private String refundCode;

    @ApiModelProperty(value = "返回信息")
    private String refundMsg;

    @ApiModelProperty(value = "备注【订单门店，桌台信息】")
    private String memo;

}
