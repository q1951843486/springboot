package com.example.springbooth2.service;

import com.example.springbooth2.entity.Cat;

import java.util.List;

/**
 * @Description
 * @ClassName CatService
 * @Author Administrator
 * @date 2020.07.14 11:04
 */
public interface CatService {
    List<Cat> selectAllList();
}
