package com.norelax.www.service;

import com.oracle.tools.packager.mac.MacAppBundler;

import java.util.List;
import java.util.Map;

/**
 * @author wusong
 * @create 2021-05-24 09:32
 **/
public interface OrderService {
    /**
     * 初始化订单
     *
     * @param userID
     */
    List initOrder(String userID);

    /**
     * 获取稿件详情
     *
     * @param articleId 稿件id
     * @return
     */
    Map articleInfo(Long articleId);
}
