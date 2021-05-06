package com.test.testLeetCode;

import org.springframework.util.SocketUtils;


public class Test20210429TrailingZeroes{
    public static void main(String[] args) {
        System.out.println(trailingZeroes3(30));
    }

    public static int trailingZeroes(int n) {
        int count=0;
        while (n>0){
            int a=n;
            while (a>=5){
                if (a%5 ==0) {
                    count++;
                    a=a/5;
                }else {
                    break;
                }
            }
            n--;
        }
        return count;
    }

    public static int trailingZeroes2(int n) {
        int count=0;
        while (n>0){
            int a=n;
            while (a>=5&&a%5 ==0){
                    count++;
                    a=a/5;
            }
            n--;
        }
        return count;
    }

    public static int trailingZeroes3(int n) {
        int count=0;
        for (int i = 5; i <=n ; i+=5) {
            int a=i;
            while (a%5 ==0){
                count++;
                a=a/5;
            }
        }
        return count;
    }
}