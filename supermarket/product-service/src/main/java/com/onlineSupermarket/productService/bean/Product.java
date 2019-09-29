package com.onlineSupermarket.productService.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@TableName("Product")
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String product_name;

    @TableField("brandId")
    private int brandId;

    private int status;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date created_time;

    private Date modified_time;

    // private String product_details_url;
}
