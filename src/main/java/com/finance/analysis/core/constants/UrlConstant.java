package com.finance.analysis.core.constants;

/**
 * url常量
 * @author zhanjian
 * @date 2021年2月22日13:46:44
 */
public final class UrlConstant {

    public static String GRID_LIST = "http://quote.eastmoney.com/center/gridlist.html#hs_a_board";

    /**
     * 东方财富列表url地址，使用时需替换%s占位符
     */
    public static String EAST_MONEY_LIST_URL = "http://90.push2.eastmoney.com/api/qt/clist/get?pn=1&pz=%s&po=1&np=1&ut=bd1d9ddb04089700cf9c27f6f7426281&fltt=2&invt=2&fid=f3&fs=m:0+t:6,m:0+t:13,m:0+t:80,m:1+t:2,m:1+t:23&fields=f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f12,f13,f14,f15,f16,f17,f18,f20,f21,f23,f24,f25,f22,f11,f62,f128,f136,f115,f152";

    /**
     * 东方财富详情url地址，使用时需替换%s占位符
     */
    public static String EAST_MONEY_DETAIL_URL = "http://f10.eastmoney.com/NewFinanceAnalysis/DubangAnalysisAjax?code=%s%s";
}
