package com.example.mars.demo;

public class TestNumbers4 {
    public static void main(String[] args) {
        doTest(200);
    }

    /**
     * 一个偶数总能表示为两个素数之和
     * 偶数n拆成质数a+b
     */
    public static void doTest(int n) {
        int i,b;
        for (i = n-1; i >=n/2 ; i--) {
            if (isPrime(i)==true) {
                b = n - i;
                if (isPrime(b) ==true&&i>2&&b>2) {
                    System.out.println("i="+i+";b="+b);
                }
            }
        }
    }

    public static boolean isPrime(int a) {
        boolean flag=false;
        for (int j = 2; j <= a - 1; j++) {
            if (a % j == 0) {
                flag = false;
                break;
            } else {
                flag = true;
                continue;
            }
        }
        return flag;
    }
}
