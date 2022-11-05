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
 * @Description：发送记录表
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="SmsSendRecord对象", description="发送记录表")
public class SmsSendRecordVo extends BasicVo {

    private static final long serialVersionUID = 1L;

    @Builder
    public SmsSendRecordVo(Long id, String channelName, String channelLabel, Long templateId, String templateNo, String templateCode, String templateType, String signCode, String signName, String mobile, String sendContent, String sendStatus, String sendMsg, String acceptStatus, String acceptMsg, String serialNo, String templateParams){
        super(id);
        this.channelName=channelName;
        this.channelLabel=channelLabel;
        this.templateId=templateId;
        this.templateNo=templateNo;
        this.templateCode=templateCode;
        this.templateType=templateType;
        this.signCode=signCode;
        this.signName=signName;
        this.mobile=mobile;
        this.sendContent=sendContent;
        this.sendStatus=sendStatus;
        this.sendMsg=sendMsg;
        this.acceptStatus=acceptStatus;
        this.acceptMsg=acceptMsg;
        this.serialNo=serialNo;
        this.templateParams=templateParams;
    }

    @ApiModelProperty(value = "通道名称")
    private String channelName;

    @ApiModelProperty(value = "通道唯一标识")
    private String channelLabel;

    @ApiModelProperty(value = "模板表主键ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long templateId;

    @ApiModelProperty(value = "应用模板编号：多通道编号相同则认为是一个模板多个通道公用")
    private String templateNo;

    @ApiModelProperty(value = "三方应用模板code")
    private String templateCode;

    @ApiModelProperty(value = "短信类型： 0、通知 1、营销")
    private String templateType;

    @ApiModelProperty(value = "三方签名code:发送短信可能用到")
    private String signCode;

    @ApiModelProperty(value = "签名名称")
    private String signName;

    @ApiModelProperty(value = "手机号码")
    private String mobile;

    @ApiModelProperty(value = "发生内容")
    private String sendContent;

    @ApiModelProperty(value = "发送状态")
    private String sendStatus;

    @ApiModelProperty(value = "发送返回信息")
    private String sendMsg;

    @ApiModelProperty(value = "是否受理成功")
    private String acceptStatus;

    @ApiModelProperty(value = "受理返回信息")
    private String acceptMsg;

    @ApiModelProperty(value = "发送流水")
    private String serialNo;

    @ApiModelProperty(value = "模板参数")
    private String templateParams;

    @ApiModelProperty(value = "选中节点")
    private String[] checkedIds;

}
