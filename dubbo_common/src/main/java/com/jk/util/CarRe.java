package com.jk.util;

import java.io.Serializable;

public class CarRe implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private Integer value;





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
