package com.example.springbooth2.dao.two;


import com.example.springbooth2.entity.Cat;

import java.util.List;

/**
 * @Description
 * @ClassName CatTwoMapper
 * @Author Administrator
 * @date 2020.07.14 11:01
 */
public interface CatTwoMapper {
    List<Cat> selectAll();
}
