package com.rowlingz.mybatis.mapper;

import com.rowlingz.mybatis.entity.StarRqeustDetail;

public interface StarRqeustDetailMapper {
    int insert(StarRqeustDetail record);

    int insertSelective(StarRqeustDetail record);
}