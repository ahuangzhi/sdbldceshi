package com.cqbld.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cqbld.entity.Customer;

import java.util.List;

@DS(value = "postGrepSql1")
public interface CustomerDao{

    List<Customer> getCustomerLists();
}
