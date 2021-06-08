package com.rowlingz.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/rowlingz/mybatis/mapper")
public class Application {
    public static void main(String[] args) {
        new SpringApplication(Application.class).run(args);
    }
}
