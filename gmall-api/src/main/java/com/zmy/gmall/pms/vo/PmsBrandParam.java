package com.zmy.gmall.pms.vo;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 品牌传递参数
 */
@Data
public class PmsBrandParam {
    @ApiModelProperty(value = "品牌名称",required = true)

    private String name;
    @ApiModelProperty(value = "品牌首字母")
    private String firstLetter;
    @ApiModelProperty(value = "排序字段")

    private Integer sort;
    @ApiModelProperty(value = "是否为厂家制造商")

    private Integer factoryStatus;
    @ApiModelProperty(value = "是否进行显示")

    private Integer showStatus;
    @ApiModelProperty(value = "品牌logo",required = true)

    private String logo;
    @ApiModelProperty(value = "品牌大图")
    private String bigPic;
    @ApiModelProperty(value = "品牌故事")
    private String brandStory;


}
