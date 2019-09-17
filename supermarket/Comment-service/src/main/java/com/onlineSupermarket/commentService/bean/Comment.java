package com.onlineSupermarket.commentService.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int uid;
    private String email;
    private String password;
    private String firstName;
    private String SecondName;
    private int gender;
}
