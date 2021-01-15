package com.cqbld.controller;

import com.cqbld.config.RedisUtill;
import com.cqbld.entity.BasicsEquipmentList;
import com.cqbld.entity.Customer;
import com.cqbld.serviceImpl.BasicsEquipmentListServiceImpl;
import com.cqbld.serviceImpl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @Autowired
    private CustomerServiceImpl auditLogService;

    @Autowired
    private BasicsEquipmentListServiceImpl basicsEquipmentListService;

    @RequestMapping("/")
    public String hello(){
        return "hello";
    }

    @GetMapping("/redis")
    public String getRedis(){
        Object gfMoney = redisUtil.get("gfMoney");
        return gfMoney.toString();
    }

    @GetMapping("/getCustomerLists")
    public List<Customer> getCustomerLists(){
        return auditLogService.getCustomerLists();
    }

    @GetMapping("/getBasicsEquipmentLists")
    public List<BasicsEquipmentList> getBasicsEquipmentLists(){
        return basicsEquipmentListService.getBasicsEquipmentLists();
    }
}
