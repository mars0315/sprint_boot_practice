package com.example.mars.demo;

public class CountTest {

    //有3本书5元、3元和0、5元，小明有100元，求有几种买法正好花光100元且买的书刚好100本
    public static void main(String[] args) {
        double a=5;
        double b=3;
        double c=0.5;
        int count=0;
        for (int i = 0; i < 100/a; i++) {
            for (int j = 0; j < 100/b; j++) {
                for (int k = 0; k < 100/c; k++) {
                    if (i+j+k==100&&a*i+b*j+c*k==100) {
                        System.out.println("i="+i+"j="+j+"k="+k);
                        count++;
                    }
                }
            }
        }
        System.out.println("count="+count);
    }
}
