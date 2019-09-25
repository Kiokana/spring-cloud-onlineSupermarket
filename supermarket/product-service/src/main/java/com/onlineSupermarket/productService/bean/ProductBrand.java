package com.onlineSupermarket.productService.bean;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ProductBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String brandName;

    @Column(nullable = false)
    private String brandLogo;

    @Column(nullable = false)
    private String brandDescription;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date create_time;

    private Date modify_time;
}
