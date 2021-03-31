package com.example.mars.demo;

public class TestFunction {
    public static void main(String[] args) {
        System.out.println(doFunction(5));
        System.out.println(doFunction(6));
    }

    /**
     * 编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n(利用指针函数)
     */
    public static double doFunction(int a) {
        if (a%2==0) {
           return doTest(a);
        }
        return doTest2(a);
    }

    public static double doTest(int a) {
        double sum=0;
        for (int i = 2; i <=a ; i+=2) {
            sum+=1.0/i;
        }
        return sum;
    }

    public static double doTest2(int a) {
        double sum=0;
        for (int i = 1; i <=a ; i+=2) {
            sum+=1.0/i;
        }
        return sum;
    }
}
