package com.jk.mapper;

import com.jk.model.DinModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DinModelMapper {
    int insert(DinModel record);

    int insertSelective(DinModel record);

    List<DinModel> dindan();
}