package com.onlineSupermarket.orderService.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@TableName("UserOrder")
@Entity
@Data
public class UserOrder{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int productSKUId;

    private Date create_time;

    /* 0: unpaid
     * 1: paid
     * 2: canceled
     * */
    private int status;
}
