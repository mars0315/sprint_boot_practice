package com.example.mars.demo;

public class TestRecursion {
    public static void main(String[] args) {
        int a=doTest(5);
        System.out.println(a);
        int b=doTest(4);
        System.out.println(b);
        int c=doTest(3);
        System.out.println(c);
        int d=doTest(2);
        System.out.println(d);
        int e=doTest(1);
        System.out.println(e);
    }

    public static int doTest(int a) {
        if (a>1) {
            return a*doTest(a-1);
        }
        return 1;
    }
}
