package com.finance.analysis.eastmoney.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSort;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(value = "用户接口", tags = "用户操作相关接口")
@ApiSort(287)
@Controller
public class UserController {


    @ApiOperationSupport(author = "李康")
    @ApiOperation(value = "登录接口")
    @GetMapping("/login")
    @ResponseBody
    public String login() {
        return "likang";
    }


    @PostMapping("/register")
    @ResponseBody
    public String register() {
        return "注册成功！";
    }
}
