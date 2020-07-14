package com.example.springbooth2.entity;

import lombok.Data;

/**
 * @Description
 * @ClassName Cat
 * @Author Administrator
 * @date 2020.07.14 11:00
 */
@Data
public class Cat {
    private Long id;
    private String name;
    private Integer age;
    private String color;
    private Double score;
}
