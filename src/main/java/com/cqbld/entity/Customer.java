package com.cqbld.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @title: Customer
 * @projectName sdtb
 * @description: TODO
 * @date 2021/1/1417:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String id;
    private String additionalInfo;
    private String address;
    private String address2;
    private String city;
    private String country;
    private String email;
    private String phone;
    private String searchText;
    private String state;
    private String tenantId;
    private String title;
    private String zip;
}
