package com.jk.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.DinModelMapper;
import com.jk.model.DinModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service(interfaceClass = ComService.class)
@Component
public class ComServiceImpl implements ComService{

    @Autowired
    private DinModelMapper dinModelMapper;

    @Override
    public List<DinModel> dindan() {
        return dinModelMapper.dindan();
    }

}
