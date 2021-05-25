package com.norelax.www.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.norealx.www.base.service.ArticleService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wusong
 * @create 2021-05-25 14:57
 **/
@Service
public class ArticleServiceImpl implements ArticleService {
    @Override
    public Map getArticleInfo(Long articleId) {
        Map<String, Object> map = new HashMap<>();
        map.put("article_id", articleId);
        map.put("list_title", "“数一数二”之上市公司一季报②丨绿色发展大省 浙江的碳中和赛道有多宽？");
        return map;
    }
}
