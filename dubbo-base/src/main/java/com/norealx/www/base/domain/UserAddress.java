package com.norealx.www.base.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wusong
 * @create 2021-05-24 09:24
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAddress implements Serializable {
    private Integer id;
    private String userAddress; //用户地址
    private String userId; //用户id
    private String consignee; //收货人
    private String phoneNum; //电话号码
    private String isDefault; //是否为默认地址    Y-是     N-否
}
