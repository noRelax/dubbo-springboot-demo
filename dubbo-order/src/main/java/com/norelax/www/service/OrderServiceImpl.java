package com.norelax.www.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.norealx.www.base.domain.UserAddress;
import com.norealx.www.base.service.ArticleService;
import com.norealx.www.base.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author wusong
 * @create 2021-05-24 09:33
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;
    @Reference
    ArticleService articleService;

    @Override
    public List<UserAddress> initOrder(String userID) {
        //查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userID);

        System.out.println("当前接收到的userId=> " + userID);
        System.out.println("**********");
        System.out.println("查询到的所有地址为：");
        for (UserAddress userAddress : userAddressList) {
            //打印远程服务地址的信息
            System.out.println(userAddress.getUserAddress());
        }
        return userAddressList;
    }

    @Override
    public Map articleInfo(Long articleId) {
        return articleService.getArticleInfo(articleId);
    }

}
