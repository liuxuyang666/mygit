package com.jk.model;

import java.io.Serializable;

public class IndentModel implements Serializable {
    private static final long serialVersionUID = 1L;


    private Integer id;
    private String time;
    private Integer num;
    private Integer money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "IndentModel{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", num=" + num +
                ", money=" + money +
                '}';
    }
}
