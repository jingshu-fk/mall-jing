package com.mall.dis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hc
 */
@SpringBootApplication
@MapperScan("com.mall.dis.mapper")
public class MallDis01Application {

    public static void main(String[] args) {
        SpringApplication.run(MallDis01Application.class, args);
    }

}
