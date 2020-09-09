package com.gupaoedu.exapmle.order.orderservice.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author : lipu
 * @since : 2020-09-09 20:18
 */
@RestController
public class OrderController {

    @Resource
    RestTemplateBuilder restTemplateBuilder;

    /**
     * 订单
     */
    @PostMapping("/order")
    public String order(){

        System.out.println("开始下单");

        //扣减库存
        RestTemplate restTemplate = restTemplateBuilder.build();
        String url = "http://localhost:8081/repo/{1}";
        restTemplate.put(url,null,10001);
        return "SUCCESS";
    }
}
