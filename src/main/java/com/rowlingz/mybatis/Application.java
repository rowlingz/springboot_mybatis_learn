package com.rowlingz.mybatis;

import com.rowlingz.mybatis.entity.StarRqeustDetail;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@MapperScan("com/rowlingz/mybatis/mapper")
public class Application {
    public static void main(String[] args) {
        new SpringApplication(Application.class).run(args);
    }

    @PostConstruct
    public void init() {
        StarRqeustDetail starRqeustDetail = new StarRqeustDetail();
        starRqeustDetail.setCpId(111L);
        starRqeustDetail.setIndex(2L);
        System.out.println(starRqeustDetail);
    }
}
