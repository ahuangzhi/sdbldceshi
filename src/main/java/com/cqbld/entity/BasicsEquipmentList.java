package com.cqbld.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @title: BasicsEquipmentList
 * @projectName sdtb
 * @description: TODO
 * @date 2021/1/1417:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicsEquipmentList {
    private Integer id;
    private String name;
    private Integer delete;
    private Integer type;
}
