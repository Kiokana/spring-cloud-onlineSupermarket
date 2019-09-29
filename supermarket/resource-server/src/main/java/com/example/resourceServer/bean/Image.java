package com.example.resourceServer.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Image {
    @Id
    private long id;

    private String imgUrl;
}
