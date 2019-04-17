package com.txk.springcloudstart.eurekaserver;

import java.util.Date;

/**
 * Project <springcloudstart>
 * Created by txk on 2019/3/28 15:50.
 */
public class Test extends Date{
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operate(a,b);
        System.out.println(a+","+b);
        new Test().test();
    }
    static void operate(StringBuffer x ,StringBuffer y){
        x.append(y);
        y=x;
    }

    public  void test(){
        String s  = this.getClass().getName()+"  "+super.getClass().getName();
        System.out.println("s = " + s);
    }
}
