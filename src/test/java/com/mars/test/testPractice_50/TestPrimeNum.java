package com.example.mars.demo;

public class TestPrimeNum {
    public static void main(String[] args) {
        doTest(500,200);
    }

    /**
     * 求素数
     * @param a
     * @param b
     */
    public static void doTest(int a,int b) {
        if (a>b) {
            int tmp=b;
            b=a;
            a=tmp;
        }
        int count=0;
        for (int i = a; i <=b ; i++) {
            boolean flag=true;
            for (int j = 2; j <=i-1 ; j++) {
                if (i%j == 0) {
                    flag=false;
                    break;
                }
            }
            if (flag == true&&i>2) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count+"个数是素数");
    }
}
