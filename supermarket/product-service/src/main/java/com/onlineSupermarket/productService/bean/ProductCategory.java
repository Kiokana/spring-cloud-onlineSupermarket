package com.onlineSupermarket.productService.bean;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int parentId;

    private String name;

    /* 1: used; 2: canceled*/
    private int status;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date create_time;

    private Date modify_time;

}
