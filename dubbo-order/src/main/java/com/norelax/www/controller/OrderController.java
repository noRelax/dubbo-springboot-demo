package com.norelax.www.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.norealx.www.base.domain.UserAddress;
import com.norelax.www.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class OrderController {
    @Autowired
    public OrderService orderService;

    @GetMapping("/initOrder")
    @ResponseBody
    public List<UserAddress> initOrder(@RequestParam("uid") String userId) {
        return orderService.initOrder(userId);
    }

    @GetMapping("/article_info")
    @ResponseBody
    public Map articleInfo(@RequestParam("id") Long id) {
        return orderService.articleInfo(id);
    }
}