package com.example.mars.demo;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        doTestBall();

    }


    public static double doTestBall() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请问想要了解弹起多少次的值？");
        double a=scanner.nextDouble();
        double count=0;
        int journey=100;
        for (int i = 1; i <=a ; i++) {
        double fall=0;
        double back=0;
        double c=Math.pow(2,i-1);
            fall=journey/c;
            back=journey/c/2;
            count=count+fall+back;
            if (i == 10) {
                System.out.println("第"+i+"次反弹高度为："+back+"米");
            }
        }
        System.out.println("总路程一共弹了："+count+"米");
        return count;
    }

}

