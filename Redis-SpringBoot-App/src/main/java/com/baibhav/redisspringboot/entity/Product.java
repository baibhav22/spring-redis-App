package com.baibhav.redisspringboot.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@AllArgsConstructor
@NoArgsConstructor

@RedisHash("PRODUCT")
public class Product {

    @Id
    private int id;
    private String name;
    private int quantity;
    private Long price;
}
