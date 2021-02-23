package com.finance.analysis.eastmoney.entity;

import lombok.Data;

import java.util.List;

@Data
public class CenterGridList {
    private List<CenterGrid> diff;
    private Integer total;
}

