package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.DinModel;
import com.jk.service.ComService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("commerce")
@ComponentScan(basePackages ={"com.jk.*"})
public class ComController {

    @Reference
    private ComService comService;
    @RequestMapping("dinDan")
    @ResponseBody
    public List<DinModel> dindang(){
        List<DinModel> list = comService.dindan();
        System.out.println("11111111111功！！！"+list);
        return  list;
    }
    /*@RequestMapping("bohui")
    @ResponseBody
    public  void  bohui(Integer ids){
        comService.bohui(ids);
    }*/

    @RequestMapping("xq")
    public  String  xq(){ return   "/dindanxiangqin"; }
    @RequestMapping("fa")
    public  String fa(){ return   "/tuihuo"; }
    @RequestMapping("tuik")
    public  String tuik(){ return   "/tuikuan"; }
    @RequestMapping("buj")
    public  String buj(){ return   "/bujiao"; }
}
