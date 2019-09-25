package com.onlineSupermarket.productService.bean;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
public class productSKU {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /* Primary key of product */
    private int productId;

    /*Product specification; Json format */
    private String productSpec;

    private int productInventory;

    private double producePrice;

    private int status;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date create_time;

    @Temporal(TemporalType.TIMESTAMP)
    private Date modify_time;

}
