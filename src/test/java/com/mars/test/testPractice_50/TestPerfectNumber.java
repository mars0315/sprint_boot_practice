package com.example.mars.demo;

public class TestPerfectNumber {
    public static void main(String[] args) {
        doTestPN();
    }


    public static int doTestPN() {
        int num=0;
        for (int i = 1; i <1000 ; i++) {
        int count=0;
            for (int j = 1; j <i ; j++) {
                if (i%j ==0) {
                    // i=i/j;
                    count=count+j;
                }
            }
            if (count == i) {
                num++;
                System.out.println(count);
            }
        }
        return num;
    }
}
