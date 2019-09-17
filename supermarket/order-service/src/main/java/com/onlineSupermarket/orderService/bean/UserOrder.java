package com.onlineSupermarket.orderService.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserOrder{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int uid;
    private String email;
    private String password;
    private String firstName;
    private String SecondName;
    private int gender;
}