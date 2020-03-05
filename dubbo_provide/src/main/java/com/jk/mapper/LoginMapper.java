package com.jk.mapper;

import com.jk.model.LoginModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {
    Integer register(String mobile);

    void addregister(LoginModel user);

    //查询用户的sql语句
    LoginModel loginUser(@Param("user") LoginModel user);
    //根据手机号修改对应的用户信息
    void modify(@Param("mobile") String mobile, @Param("user") LoginModel userModel);
    //查看该手机号是否已经注册过
    Integer queryMobile(String mobile);
    //根据邮箱判断有没有该用户
    Integer queryemail(String emailVal);
    //根据邮箱，密码来查询该用户
    LoginModel emailloginUser(@Param("user") LoginModel user);
}
