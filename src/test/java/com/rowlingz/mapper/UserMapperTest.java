package com.rowlingz.mapper;

import com.rowlingz.mybatis.Application;
import com.rowlingz.mybatis.entity.ProductionTagFeedbackCalcu;
import com.rowlingz.mybatis.mapper.ProductionTagFeedbackCalcuMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = Application.class)
public class UserMapperTest {

    @Autowired
    ProductionTagFeedbackCalcuMapper mapper;

    @Test
    public void list() {
        List<ProductionTagFeedbackCalcu> result = mapper.list();
        for (ProductionTagFeedbackCalcu value : result) {
            System.out.println(value);
        }
    }

}
