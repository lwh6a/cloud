package com.lwh.nacosclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 代码描述: 订单
 *
 * @author liuwenhao
 * @date 2021/3/23
 */
@RestController
public class OrderController {



    @RequestMapping("/getInfo")
    public String getInfo(){
        System.out.println("nacos_order_getInfo-----------------");
        return "success";
    }
}
