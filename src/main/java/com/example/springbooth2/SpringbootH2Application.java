package com.example.springbooth2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.example.springbooth2.dao")
public class SpringbootH2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootH2Application.class, args);
    }

}
