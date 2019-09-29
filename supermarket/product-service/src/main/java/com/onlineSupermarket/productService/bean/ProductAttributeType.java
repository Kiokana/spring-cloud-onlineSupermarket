package com.onlineSupermarket.productService.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@TableName("ProductAttributeType")
public class ProductAttributeType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String attributeType;

//    @Temporal(TemporalType.TIMESTAMP)
//    @CreatedDate
//    private Date create_time;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date modify_time;
}
