package com.jk.service;

import com.jk.model.DmdPowerModel;

import java.util.List;

public interface UserService {

    List<DmdPowerModel> findDmdPower();

    String xiugai(String account, String password);

    void findNews();
}
