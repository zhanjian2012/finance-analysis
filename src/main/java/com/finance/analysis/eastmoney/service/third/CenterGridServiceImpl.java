package com.finance.analysis.eastmoney.service.third;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finance.analysis.core.constants.UrlConstant;
import com.finance.analysis.eastmoney.entity.CenterGrid;
import com.finance.analysis.eastmoney.entity.CenterGridResult;
import com.finance.analysis.eastmoney.entity.ND;
import com.finance.analysis.eastmoney.mapper.CenterGridMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * 财富首页-表格服务
 */
@Slf4j
@Service
public class CenterGridServiceImpl extends ServiceImpl<CenterGridMapper, CenterGrid> {

    @Resource
    private CenterGridMapper gridMapper;

    @Resource
    private RestTemplate restTemplate;

    public List<CenterGrid> getGridList() {
        String totalUrl = String.format(UrlConstant.EAST_MONEY_LIST_URL, 1);
        ResponseEntity<CenterGridResult> totalEntity = restTemplate.getForEntity(totalUrl, CenterGridResult.class);
        if (Objects.isNull(totalEntity) || Objects.isNull(totalEntity.getBody()) || Objects.isNull(totalEntity.getBody().getData())) {
            return null;
        }
        Integer total = totalEntity.getBody().getData().getTotal();
        if (Objects.isNull(total) || total == 0) {
            return null;
        }
        String listUrl = String.format(UrlConstant.EAST_MONEY_LIST_URL, total);
        ResponseEntity<CenterGridResult> entity = restTemplate.getForEntity(listUrl, CenterGridResult.class);
        if (Objects.isNull(entity) || Objects.isNull(entity.getBody()) || Objects.isNull(entity.getBody().getData())) {
            return null;
        }
        List<CenterGrid> diff = entity.getBody().getData().getDiff();
        if (!CollectionUtils.isEmpty(diff)) {
            super.saveOrUpdateBatch(diff);
        }
        return diff.subList(0, 10);
    }

    public List<CenterGrid> getBgqList() {
        return null;
    }

    public List<ND> getNdList() {
        return null;
    }
}
