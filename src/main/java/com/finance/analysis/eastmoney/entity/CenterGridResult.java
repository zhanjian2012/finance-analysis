package com.finance.analysis.eastmoney.entity;

import lombok.Data;

@Data
public class CenterGridResult {
    private CenterGridList data;
    private Integer rc;
    private Integer rt;
    private Long svr;
    private Integer lt;
    private Integer full;
}

