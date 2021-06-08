package com.rowlingz.mybatis.mapper;

import com.rowlingz.mybatis.entity.ProductionTagFeedbackCalcu;

import java.util.List;

public interface ProductionTagFeedbackCalcuMapper {
    int insert(ProductionTagFeedbackCalcu record);

    int insertSelective(ProductionTagFeedbackCalcu record);

    List<ProductionTagFeedbackCalcu> list();
}