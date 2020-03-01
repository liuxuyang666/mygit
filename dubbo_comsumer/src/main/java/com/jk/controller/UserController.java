package com.jk.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.DmdPowerModel;
import com.jk.model.NewsBean;
import com.jk.service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("user")
@ComponentScan(basePackages = {"com.jk.*"})
public class UserController {
    @Reference
    private UserService userService;
//查看商品分类
    @RequestMapping("querycommclss")
    public @ResponseBody
    void querycommclss(){

    }
//商家端左侧列表
    @RequestMapping("findDmdPower")
    @ResponseBody
    public List<DmdPowerModel> findDmdPower(){

        List<DmdPowerModel>list = userService.findDmdPower();
        return list;
    }

//跳转到个人中心页面
    @RequestMapping("toPersonal")
    public String toPersonal(){

//        return "personal";
        return "g_1个人信息.html";
    }

    //存取session 测试
    @RequestMapping("session")
    public String session(HttpSession session){
   //                           数据库字段  数据
        session.setAttribute("value",111);
        return "test";
    }


    //跳转修改密码页面
    @RequestMapping("toUpdatePw")
    public String toUpdatePw(){

        return "g_2修改密码";
    }


//   返回个人中心
    @RequestMapping("personal")
    public void personal(){
        System.out.println(2121121+"|++++++++++++++++++++++++++++++++++++++++++++");
//        return "h_个人中心";
    }


    //修改密码
    @RequestMapping("xiugai")
    @ResponseBody
    public String xiugai(String account,String password ){

        System.out.println(account);
        return userService.xiugai(account,password);

    }

    //跳转消息中心
    @RequestMapping("toMessage")
    public String toMessage(){
        return "g_消息中心";
    }

    //查看消息
    @RequestMapping("findNews")
    @ResponseBody
    public NewsBean findNews(){
        userService.findNews();

        return null;
    }

    //跳转代客下单
    @RequestMapping("toDKXD")
    public String toDKXD(){
        return "f_代客下单";
    }
}
