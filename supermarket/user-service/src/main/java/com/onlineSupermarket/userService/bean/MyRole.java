package com.onlineSupermarket.userService.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@TableName("MyRole")
public class MyRole {
    @Id
    private int id;

    private String rolename;
}
