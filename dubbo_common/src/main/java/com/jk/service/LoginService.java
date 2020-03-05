package com.jk.service;

import com.jk.model.LoginModel;

public interface LoginService {


    String register(String mobile);

    LoginModel loginUser(LoginModel login);

    String addvarification(String mobile) throws Exception;

    String addregister(LoginModel user, String varification);

    String back(String mobile) throws Exception;

    String modify(LoginModel loginModel, String yz);
}
