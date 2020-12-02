package com.example.demo;

import java.io.Serializable;

public class DemoVO implements Serializable {

//    private static final long serialversionUID = 129348938L;

    String name;
    String pwd;

    public DemoVO(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }
}
