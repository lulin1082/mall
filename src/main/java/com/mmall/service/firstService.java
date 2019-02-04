package com.mmall.service;

public class firstService {
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
