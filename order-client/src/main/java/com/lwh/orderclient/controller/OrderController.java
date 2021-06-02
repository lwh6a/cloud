package com.lwh.orderclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 代码描述: 订单
 *
 * @author liuwenhao
 * @date 2021/3/3
 */
@RestController
public class OrderController {

    @RequestMapping("/createOrder")
    public String createOrder(){
        System.out.println("创建订单");
        return "success";
    }

    @RequestMapping("/testThreadPool")
    public String testThreadPool(){
        System.out.println("testThreadPool");
        return "success";
    }
}
