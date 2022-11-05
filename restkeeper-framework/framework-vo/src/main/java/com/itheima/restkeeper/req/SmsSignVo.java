package com.itheima.restkeeper.req;

import com.itheima.restkeeper.basic.BasicVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description：
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="SmsSign对象", description="")
public class SmsSignVo extends BasicVo {

    private static final long serialVersionUID = 1L;

    @Builder
    public SmsSignVo(Long id, String channelLabel, String signName, String signCode, String signType, String documentType, String international, String signPurpose, String proofImage, String proofType, String remark, String acceptStatus, String acceptMsg, String auditStatus, String auditMsg){
        super(id);
        this.channelLabel=channelLabel;
        this.signName=signName;
        this.signCode=signCode;
        this.signType=signType;
        this.documentType=documentType;
        this.international=international;
        this.signPurpose=signPurpose;
        this.proofImage=proofImage;
        this.proofType=proofType;
        this.remark=remark;
        this.acceptStatus=acceptStatus;
        this.acceptMsg=acceptMsg;
        this.auditStatus=auditStatus;
        this.auditMsg=auditMsg;
        this.signNo=signNo;
    }

    @ApiModelProperty(value = "通道唯一标识")
    private String channelLabel;

    @ApiModelProperty(value = "签名名称")
    private String signName;

    @ApiModelProperty(value = "三方签名code:发送短信可能用到")
    private String signCode;

    @ApiModelProperty(value = "签名类型")
    private String signType;

    @ApiModelProperty(value = "证明类型")
    private String documentType;

    @ApiModelProperty(value = "是否国际/港澳台短信")
    private String international;

    @ApiModelProperty(value = "签名用途：	0：自用。	1：他用。")
    private String signPurpose;

    @ApiModelProperty(value = "签名对应的资质证明图片需先进行 base64 编码格式转换")
    private String proofImage;

    @ApiModelProperty(value = "签名证明文件类型")
    private String proofType;

    @ApiModelProperty(value = "短信申请说明")
    private String remark;

    @ApiModelProperty(value = "是否受理成功")
    private String acceptStatus;

    @ApiModelProperty(value = "受理返回信息")
    private String acceptMsg;

    @ApiModelProperty(value = "审核状态")
    private String auditStatus;

    @ApiModelProperty(value = "审核信息")
    private String auditMsg;

    @ApiModelProperty(value = "三方签名code:发送短信可能用到")
    private String signNo;

    @ApiModelProperty(value = "选中节点")
    private String[] checkedIds;

    @ApiModelProperty(value = "证明文件组",dataType = "ProofVo")
    private LinkedList<ProofVo> proofVos;

    @ApiModelProperty(value = "附件信息",dataType = "AffixVo")
    private LinkedList<AffixVo> affixVos;

}
