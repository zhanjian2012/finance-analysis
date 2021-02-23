package com.finance.analysis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.finance.analysis.eastmoney.mapper")
public class FinanceAnalysisApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceAnalysisApplication.class, args);
	}

}
