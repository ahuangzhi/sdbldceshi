package com.cqbld.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cqbld.entity.BasicsEquipmentList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Administrator
 * @title: BasicsEquipmentListDao
 * @projectName sdtb
 * @description: TODO
 * @date 2021/1/1417:29
 */
//@DS(value = "mysql1")
public interface BasicsEquipmentListDao extends BaseMapper{

    List<BasicsEquipmentList> getBasicsEquipmentLists();
}
