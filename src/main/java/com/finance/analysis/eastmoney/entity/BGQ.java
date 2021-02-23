package com.finance.analysis.eastmoney.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 报告期
 * </p>
 *
 * @author bajin
 * @since 2021-2-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BGQ implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @Excel(name = "股票代码", orderNum = "1")
    private String f12;

    @Excel(name = "股票名称", orderNum = "2")
    private String f14;

    @Excel(name = "报告期", orderNum = "3")
    private String date;

    @Excel(name = "净资产收益率", orderNum = "4")
    private String jzcsyl;

    @Excel(name = "营业净利润率", orderNum = "5")
    private String yyjlrl;

    @Excel(name = "净利润", orderNum = "6")
    private String jlr;

    @Excel(name = "营业总收入", orderNum = "7")
    private String yysr;

    @Excel(name = "收入总额", orderNum = "8")
    private String srze;

    @Excel(name = "成本总额", orderNum = "9")
    private String cbze;

    @Excel(name = "营业成本", orderNum = "10")
    private String yycb;

    @Excel(name = "资产总额", orderNum = "11")
    private String zcze;

    @Excel(name = "负债总额", orderNum = "12")
    private String fzze;

    @Excel(name = "财务费用", orderNum = "13")
    private String cwfy;

    @Excel(name = "销售费用", orderNum = "14")
    private String xsfy;

    @Excel(name = "管理费用", orderNum = "15")
    private String glfy;

    @Excel(name = "总资产周转率", orderNum = "16")
    private String zzczzl;

    @Excel(name = "资产负债率", orderNum = "17")
    private String zcfzl;

    @Excel(name = "总资产净利率", orderNum = "18")
    private String zzcjll;

    @Excel(name = "市盈率", orderNum = "19")
    private String f9;
}