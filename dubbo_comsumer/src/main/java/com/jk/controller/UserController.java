package com.jk.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.*;
import com.jk.service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
@ComponentScan(basePackages = {"com.jk.*"})
public class UserController {
    @Reference
    private UserService userService;


    //后台主页页面
    @RequestMapping("findshow")
    public String findshow(){
        return "show";
    }
    //跳转添加商品
    @RequestMapping("findadd")
    public String findadd(){
        return "add";
    }


    //eachars
    @RequestMapping("finduser")
    @ResponseBody
    public Map countCar(IndentModel indentModel){
        HashMap<String, Object> resout = new HashMap<>();
        List<IndentModel>list = userService.countCar(indentModel);
        ArrayList<Object> value = new ArrayList<>();
        ArrayList<Object> name = new ArrayList<>();

        for (int i=0;i<list.size();i++){
            name.add( list.get( i ).getNum() );
            value.add( list.get( i ).getTime());
        }

        resout.put( "names",name );
        resout.put( "values",value );
        return resout;
    }

    //eachars
    @RequestMapping("finduserr")
    @ResponseBody
    public Map finduserr(IndentModel indentModel){
        HashMap<String, Object> resout = new HashMap<>();
        List<IndentModel>list = userService.countCar(indentModel);
        ArrayList<Object> value = new ArrayList<>();
        ArrayList<Object> name = new ArrayList<>();

        for (int i=0;i<list.size();i++){
            name.add( list.get( i ).getMoney() );
            value.add( list.get( i ).getTime());
        }

        resout.put( "names",name );
        resout.put( "values",value );
        return resout;
    }

    //树
    @RequestMapping("findPower")
    @ResponseBody
    public List<PowerModel>findPower(){
        return userService.findPower();
    }

    //添加商品
    @RequestMapping("addDing")
    @ResponseBody
    public void addDing(CommodityBean commodityBean){

          userService.addDing(commodityBean);
    }
}
