package com.example.springbooth2.service.impl;


import com.example.springbooth2.dao.one.CatMapper;
import com.example.springbooth2.entity.Cat;
import com.example.springbooth2.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @ClassName CatServiceImpl
 * @Author Administrator
 * @date 2020.07.14 11:04
 */
@Service
public class CatServiceImpl implements CatService {
    @Autowired
    private CatMapper catMapper;

    @Override
    public List<Cat> selectAllList() {
        return catMapper.selectAll();
    }
}
