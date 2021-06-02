package com.lwh.userclient.controller;

import com.lwh.orderclient.client.OrderClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 代码描述: 用户
 *
 * @author liuwenhao
 * @date 2021/3/3
 */
@RestController
public class UserController {

    @Resource
    private OrderClient orderClient;

    @RequestMapping("/sumbitOrder")
    public String sumbitOrder(){
        System.out.println("用户提交订单");
        String order = orderClient.createOrder();
        System.out.println(order);
        return "success";
    }
}
