package com.finance.analysis.eastmoney.service.third;

import com.finance.analysis.eastmoney.entity.CenterGrid;
import com.finance.analysis.eastmoney.entity.ND;

import java.util.List;

public interface CenterGridService {

    /**
     * 获取报告期列表
     *
     * @return
     */
    public List<CenterGrid> getGridList();

    /**
     * 获取报告期列表
     *
     * @return
     */
    public List<CenterGrid> getBgqList();

    /**
     * 获取年度列表
     *
     * @return
     */
    public List<ND> getNdList();
}
