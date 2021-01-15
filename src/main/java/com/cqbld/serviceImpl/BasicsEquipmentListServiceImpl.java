package com.cqbld.serviceImpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqbld.dao.BasicsEquipmentListDao;
import com.cqbld.entity.BasicsEquipmentList;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @title: BasicsEquipmentListServiceImpl
 * @projectName sdtb
 * @description: TODO
 * @date 2021/1/159:48
 */
@Service
@Transactional
//@DS(value = "mysql1")
public class BasicsEquipmentListServiceImpl{

    @Resource
    private BasicsEquipmentListDao basicsEquipmentListDao;

    /**
     *
     * @param
     * @return
     */

    public List<BasicsEquipmentList> getBasicsEquipmentLists(){
        return  basicsEquipmentListDao.getBasicsEquipmentLists();
    }

}
