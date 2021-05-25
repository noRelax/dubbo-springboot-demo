package com.norealx.www.base.service;

import java.util.Map;

/**
 * @author wusong
 * @create 2021-05-25 14:53
 **/
public interface ArticleService {
    /**
     * 稿件详情
     *
     * @param articleId 稿件id
     * @return
     */
    Map getArticleInfo(Long articleId);
}
