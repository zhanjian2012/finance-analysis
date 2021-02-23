package com.finance.analysis.eastmoney.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("center_grid")
@ApiModel(description = "表格数据详情对象")
public class CenterGrid implements Serializable {

    private String f1;

    @ApiModelProperty(name="123", example = "股票代码")
    private String f2;
    private String f3;
    private String f4;
    private String f5;
    private String f6;
    private String f7;
    private String f8;
    private String f9;
    private String f10;

    @TableId
    private String f12;
    private String f13;
    private String f14;
    private String f15;
    private String f16;
    private String f17;
    private String f18;
    private String f20;
    private String f21;
    private String f23;
    private String f24;
    private String f25;
    private String f22;
    private String f11;
    private String f62;
    private String f128;
    private String f136;
    private String f115;
    private String f152;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createDate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateDate;

}
