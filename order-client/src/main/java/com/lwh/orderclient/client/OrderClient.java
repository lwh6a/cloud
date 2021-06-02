package com.lwh.orderclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 代码描述: 订单客户端
 *
 * @author liuwenhao
 * @date 2021/3/3
 */
@FeignClient(value = "lwh-order")
public interface OrderClient {

    @RequestMapping("/createOrder")
    String createOrder();
}
