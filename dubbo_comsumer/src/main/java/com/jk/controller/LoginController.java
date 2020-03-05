package com.jk.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.*;

import com.jk.service.LoginService;
import com.jk.util.RedisUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class LoginController {

    @Reference
    private LoginService loginService;

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("queryLogin")
    public String queryLogin(){

        return "loginPage";
    }
    @RequestMapping("queryRegister")
    public String queryRegister(){

        return "registerPage";
    }
    @RequestMapping("queryRegister2")
    public String queryRegister2(){

        return "registerPage2";
    }


    //跳转到忘记密码页面
    @RequestMapping("forGet")
    public String forGet(){

        return "forGetPage";
    }
    //跳转到修改密码页面
    @RequestMapping("ChangePassword")
    public String modification(){

        return "changePasswordPage";
    }




    @RequestMapping("register")
    @ResponseBody
    public String register(String mobile){
        String str =  loginService.register(mobile);
        return str;
    }

    //登录，根据手机号，密码判断用户是否存在
    @RequestMapping("login")
    @ResponseBody
    public String login(LoginModel login, HttpServletRequest request){
        String str="0";//0失败     1成功
        String sessionId = request.getSession().getId();
        if(login==null){
            return str;
        }
        LoginModel um = loginService.loginUser(login);
        if(um!=null){
            redisUtil.set("user"+sessionId,um);
            redisUtil.expire(sessionId,3);

            str="1";
        }
        return str;
    }
    //注册时获取验证码
    @RequestMapping("addregeter")
    @ResponseBody
    public String addregeter(String mobile) throws Exception {
        String varification=loginService.addvarification(mobile);
        return varification;
    }

//重新获取验证码，从redis获取原先的手机号
   /* @RequestMapping("addregister")
    @ResponseBody
    public void addregeter2(){
        String varification=loginService.addvarification2();
    }*/


    //添加用户
    @RequestMapping("addUser")
    @ResponseBody
    public String addregister(LoginModel login,String varification){
        String str = loginService.addregister(login,varification);
        return str;
    }

    //找回密码
    @RequestMapping("ForGetPassword")
    @ResponseBody
    public String back(String mobile) throws Exception {
        String str = loginService.back(mobile);
        return str;
    }


    //判断验证码是否一致以及修改用户密码
    @RequestMapping("validation")
    @ResponseBody
    public String validation(LoginModel login, String yz){
        String str = loginService.modify(login,yz);
        return str;

    }



}
