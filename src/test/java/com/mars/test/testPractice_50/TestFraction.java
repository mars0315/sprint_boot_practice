package com.example.mars.demo;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class TestFraction {
    public static void main(String[] args) {
        // double c=3.0/2.0;
        // System.out.println(c);
        doTest();
    }

    /**
     * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
     *
     */
    public static void doTest() {
        double a=1;
        double b=2;
        double c=0;
        for (int i = 0; i <20 ; i++) {
        c+=b/a;
        System.out.println(b+"/"+a);
        double tmp=b;
        b=a+b;
        a=tmp;
        }
        // DecimalFormat decimalFormat=new DecimalFormat("#.000");
        // String str=decimalFormat.format(c);
        // BigDecimal bigDecimal=new BigDecimal(c);
        // c=bigDecimal.setScale(2,4).doubleValue();
        // String str=String.format("%.2f",c);
        // System.out.println(c);
        System.out.printf("%.4f",c);
    }
}
