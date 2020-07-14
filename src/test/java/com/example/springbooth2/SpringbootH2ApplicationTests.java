package com.example.springbooth2;

import com.example.springbooth2.entity.Cat;
import com.example.springbooth2.service.CatService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootH2ApplicationTests {

    @Autowired
    private CatService catService;
    @Test
    void contextLoads() {

        List<Cat> list =catService.selectAllList();
        list.stream().forEach(l-> System.out.println(l));


    }

}
