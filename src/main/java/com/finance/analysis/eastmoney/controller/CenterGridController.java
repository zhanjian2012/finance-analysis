package com.finance.analysis.eastmoney.controller;

import com.finance.analysis.eastmoney.entity.CenterGrid;
import com.finance.analysis.eastmoney.service.third.CenterGridService;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSort;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(value = "首页表格接口", tags = "首页表格相关接口")
@ApiSort(1)
@RestController("/eastMoney")
public class CenterGridController {

    @Resource
    private CenterGridService centerGridService;

    @ApiOperationSupport(author = "吉安")
    @ApiOperation(value = "获取表格数据")
    @GetMapping("/getGridList")
    public @ResponseBody
    List<CenterGrid> login() {
        return centerGridService.getGridList();
    }

}
