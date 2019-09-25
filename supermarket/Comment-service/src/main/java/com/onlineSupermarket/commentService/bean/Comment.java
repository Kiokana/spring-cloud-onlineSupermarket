package com.onlineSupermarket.commentService.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int customerId;

    private int productSKUId;

    private int comment;

    /*1 - 5*/
    private int star;

    @Temporal(TemporalType.TIMESTAMP)
    private Date create_time;
}
