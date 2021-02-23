package com.finance.analysis.core.runner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.finance.analysis.core.constants.UrlConstant;
import com.finance.analysis.eastmoney.entity.CenterGrid;
import com.finance.analysis.eastmoney.entity.CenterGridResult;
import com.finance.analysis.eastmoney.service.third.CenterGridServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * 系统启动时，判断数据是否一致，不一致，则重新拉取，并更新数据库
 * 并考虑定时执行
 */
@Slf4j
@Component
public class LoadPrizeInfoRunner implements CommandLineRunner {

    @Resource
    private CenterGridServiceImpl centerGridService;
    @Resource
    private RestTemplate restTemplate;


    @Override
    public void run(String... args) {
        QueryWrapper<CenterGrid> queryWrapper = new QueryWrapper<>();
        int count = centerGridService.count(queryWrapper);

        String totalUrl = String.format(UrlConstant.EAST_MONEY_LIST_URL, 1);
        ResponseEntity<CenterGridResult> totalEntity = restTemplate.getForEntity(totalUrl, CenterGridResult.class);
        if (Objects.isNull(totalEntity) || Objects.isNull(totalEntity.getBody()) || Objects.isNull(totalEntity.getBody().getData())) {
            return;
        }
        Integer total = totalEntity.getBody().getData().getTotal();
        if(total > count) {
            String listUrl = String.format(UrlConstant.EAST_MONEY_LIST_URL, total);
            ResponseEntity<CenterGridResult> entity = restTemplate.getForEntity(listUrl, CenterGridResult.class);
            if (Objects.isNull(entity) || Objects.isNull(entity.getBody()) || Objects.isNull(entity.getBody().getData())) {
                return;
            }
            List<CenterGrid> diff = entity.getBody().getData().getDiff();
            if (!CollectionUtils.isEmpty(diff)) {
                centerGridService.saveOrUpdateBatch(diff);
            }
        }
    }


}
