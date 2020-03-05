package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;

import com.alibaba.fastjson.JSONObject;
import com.jk.mapper.LoginMapper;


import com.jk.model.CheckSumBuilder;
import com.jk.model.HttpClientUtil;
import com.jk.model.LoginModel;
import com.jk.model.SendModel;
import com.jk.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.HashMap;
import java.util.UUID;

@Service(timeout=10000)//用在服务提供者中，在类或者接口中声明。
@Component
public class LoginServiceImpl implements LoginService {
    @Resource
    private RedisTemplate<String,Object> redisTemplate;
    @Autowired
    private LoginMapper loginMapper;
    @Resource
    private RedisUtil redisUtil;


    public String register(String mobile) {
        Integer i =  loginMapper.register(mobile);
        String str="2";
        if(i>0){
            str="1";
        }else {
            str="0";
        }
        return str;
    }
    //新增用户
    public String addregister(LoginModel login, String varification) {
        String str="0";
        //取出手机号
        String mobile = (String) redisUtil.get("mobileShowJi");

        String mobile1 = (String) redisUtil.get("mobile");
        //判断手机号验证码是否一致
        if (mobile1!=null&&mobile1.equals(varification)){
            str="1";
            login.setMobile(mobile);
            loginMapper.addregister(login);
            return str;
        }
        return str;
    }

    //根据手机号，密码查询用户,根据返回值判断是否登陆成功    0失败    1成功
    public LoginModel loginUser(LoginModel login){
        if(login.getMobile()!=null){

            return  loginMapper.loginUser(login);
        }
            return null;
    }


    //根据手机号判断该手机号是否注册过
    public String addvarification(String mobile) throws Exception {
        Integer i = loginMapper.queryMobile(mobile);
        String str="0";
        if(i!=null&&i>0){
            str="1";
            return str;
        }
        String url = "https://api.netease.im/sms/sendcode.action";
        //设置普通参数
        HashMap<String, Object> params = new HashMap<>();
        params.put("mobile", mobile);

        String AppKey = "6bd6ae8a79a85b9383df272b96c233d9";
        String Nonce = UUID.randomUUID().toString().replaceAll("-", "");
        String CurTime = String.valueOf(Calendar.getInstance().getTimeInMillis() / 1000);
        String appSecret = "c00e09169334";
        String CheckSum = CheckSumBuilder.getCheckSum(appSecret, Nonce, CurTime);
        //设置头部参数
        HashMap<String, Object> headers = new HashMap<>();
        headers.put("AppKey", AppKey);
        headers.put("Nonce", Nonce);
        headers.put("CurTime", CurTime);
        headers.put("CheckSum", CheckSum);
        String jsonStr = HttpClientUtil.post(url, params, headers);

        SendModel sendModel = new JSONObject().parseObject(jsonStr, SendModel.class);
        if (sendModel != null) {
            //将手机号存进redis中
            redisUtil.set("mobileShowJi", mobile);
            //将验证码存到redis里
            redisUtil.set("mobile", sendModel.getObj());
            //设置redis过期时间
            Long miao = redisUtil.getExpire("1");
            redisUtil.expire("mobile", miao);
            return mobile;

        }

        return null;

    }


    //找回密码
    @Override
    public String back(String mobile) throws Exception {
        String str="1";
        Integer i = loginMapper.queryMobile(mobile);
        if(i!=null&&i==0){
            return str;
        }
        String url = "https://api.netease.im/sms/sendcode.action";
        //设置普通参数
        HashMap<String, Object> params = new HashMap<>();
        params.put("mobile", mobile);

        String AppKey = "6bd6ae8a79a85b9383df272b96c233d9";
        String Nonce = UUID.randomUUID().toString().replaceAll("-", "");
        String CurTime = String.valueOf(Calendar.getInstance().getTimeInMillis() / 1000);
        String appSecret = "c00e09169334";
        String CheckSum = CheckSumBuilder.getCheckSum(appSecret, Nonce, CurTime);
        //设置头部参数
        HashMap<String, Object> headers = new HashMap<>();
        headers.put("AppKey", AppKey);
        headers.put("Nonce", Nonce);
        headers.put("CurTime", CurTime);
        headers.put("CheckSum", CheckSum);
        String jsonStr = HttpClientUtil.post(url, params, headers);

        SendModel sendModel = new JSONObject().parseObject(jsonStr, SendModel.class);
        if (sendModel != null) {
            //将手机号存进redis中
            redisUtil.set("PhoneNumber", mobile);
            //将验证码存到redis里
            redisUtil.set("mobileYZ", sendModel.getObj());
            /*//设置redis过期时间
            Long miao = redisUtil.getExpire("1");
            redisUtil.expire("mobileYZ", miao);*/

            return sendModel.getObj();
        }
        return str;
    }


    public String modify(LoginModel loginModel, String yz) {
        String str = (String) redisUtil.get("mobileYZ");
        String num="0";
        if (yz.equals(str)){
            num="1";
            String mobile = (String) redisUtil.get("PhoneNumber");
            loginMapper.modify(mobile,loginModel);
            return num;
        }
        return num;
    }



}
