package com.cqbld.serviceImpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.cqbld.dao.BasicsEquipmentListDao;
import com.cqbld.dao.CustomerDao;
import com.cqbld.entity.BasicsEquipmentList;
import com.cqbld.entity.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
@DS(value = "postGrepSql1")
public class CustomerServiceImpl {

    @Resource
    private CustomerDao customerDao;

    /**
     *
     * @param
     * @return
     */
    @DS(value = "postGrepSql1")
    public List<Customer> getCustomerLists(){
        return customerDao.getCustomerLists();
    }

}
