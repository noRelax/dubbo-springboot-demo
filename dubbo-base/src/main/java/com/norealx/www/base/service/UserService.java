package com.norealx.www.base.service;

import com.norealx.www.base.domain.UserAddress;

import java.util.List;

//用户服务
public interface UserService {
    /**
     * 按照用户id返回所有的收货地址
     *
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);
}