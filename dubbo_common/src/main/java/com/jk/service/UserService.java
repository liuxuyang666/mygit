package com.jk.service;

import com.jk.model.CommodityBean;
import com.jk.model.IndentModel;
import com.jk.model.PowerModel;

import java.util.List;

public interface UserService {



    List<IndentModel> countCar(IndentModel indentModel);

    List<PowerModel> findPower();

    void addDing(CommodityBean commodityBean);
}
