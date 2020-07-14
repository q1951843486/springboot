package com.example.springbooth2.dao.one;


import com.example.springbooth2.entity.Cat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description
 * @ClassName CatTwoMapper
 * @Author Administrator
 * @date 2020.07.14 11:01
 */
@Mapper
public interface CatMapper {

    @Select("select * from cat")
    List<Cat> selectAll();
}
