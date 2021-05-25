package com.norelax.www.service;

import java.util.List;

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
}
