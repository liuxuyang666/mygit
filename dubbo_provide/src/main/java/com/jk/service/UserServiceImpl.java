package com.jk.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.UserModelMapper;
import com.jk.model.DmdPowerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserModelMapper userModelMapper;

    //修改密码
//    @Override
//    public void updatePw(String account, String password) {
//        userModelMapper.updatePw(account,password);
//    }
    @Override
    public List<DmdPowerModel> findDmdPower() {
        Integer id = 0;
        return findNodes(id);
    }

    @Override
    public String xiugai(String account, String password) {
        userModelMapper.xiugai(account,password);
        return "asd";
    }

    @Override
    public void findNews() {
        System.out.println("1521");
    }


    private List<DmdPowerModel> findNodes(Integer id) {

        List<DmdPowerModel> list = userModelMapper.findNodess(id);
        for (DmdPowerModel power:list) {
            List<DmdPowerModel>findNodes = findNodes( power.getId());
            if (findNodes != null && findNodes.size()>0){
                power.setNodes(findNodes);
            }else {
                power.setSelectable( true );
            }
        }
        return list;
    }
}
