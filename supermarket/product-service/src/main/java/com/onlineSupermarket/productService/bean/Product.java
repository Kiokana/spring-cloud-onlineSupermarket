package com.onlineSupermarket.productService.bean;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String product_name;

    private int brandId;

    private int status;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date created_time;

    private Date modified_time;
}
