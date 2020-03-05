package com.jk.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.UserModelMapper;
import com.jk.model.CommodityBean;
import com.jk.model.IndentModel;
import com.jk.model.PowerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserModelMapper userModelMapper;




    @Override
    public List<IndentModel> countCar(IndentModel indentModel) {
        HashMap<Object, Object> resout = new HashMap<>();
        resout.put( "indentModel",indentModel );
        List<IndentModel> list = userModelMapper.countCar();


        return list;
    }

    @Override
    public List<PowerModel> findPower() {
        Integer id = 0;
        return findNodes(id);
    }

    @Override
    public void addDing(CommodityBean commodityBean) {
         userModelMapper.addDing(commodityBean);
    }

    private List<PowerModel> findNodes(Integer id) {
        List<PowerModel>list = userModelMapper.findNodes(id);
        for (PowerModel power:list){
            List<PowerModel>findNodes = findNodes(power.getId());
            if (findNodes != null && findNodes.size()>0){
                power.setNodes(findNodes);
            }else {
                power.setSelectable(true);
            }
        }
        return list;
    }
}
