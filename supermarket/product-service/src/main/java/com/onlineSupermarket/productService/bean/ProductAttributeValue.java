package com.onlineSupermarket.productService.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@TableName("ProductAttributeValue")
public class ProductAttributeValue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String attributeValue;
}
