package com.mmall.service;

import com.mmall.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

@Service
public class firstService {

    @Autowired
    TestDao dao;

    private  int a ;
    private int b;

    public int getA() {

        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void print(){
        System.out.println(this.getA()+this.getB());
    }


}
