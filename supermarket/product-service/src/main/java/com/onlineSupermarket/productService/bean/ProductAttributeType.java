package com.onlineSupermarket.productService.bean;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ProductAttributeType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String attributeType;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date create_time;

    @Temporal(TemporalType.TIMESTAMP)
    private Date modify_time;
}
