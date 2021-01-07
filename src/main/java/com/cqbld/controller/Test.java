package com.cqbld.controller;

import com.cqbld.config.RedisUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author  huangzhi
 * @Description
 * @Date 21:46 2021/1/7
 * @Param
 * @return
 **/
@RestController
public class Test {

    @Autowired
    private RedisUtill redisUtil;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/redis")
    public String getRedis(){
        Object gfMoney = redisUtil.get("gfMoney");
        return gfMoney.toString();
    }
}
