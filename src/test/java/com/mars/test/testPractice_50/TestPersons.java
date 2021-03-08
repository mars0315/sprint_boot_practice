package com.example.mars.demo;

public class TestPersons {
    public static void main(String[] args) {
        int a=doTest(6,8);
        System.out.println(a);
    }

    /**
     * 有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。问第三个人，
     * 又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个人多大？
     *
     */
    public static int doTest(int a,int b) {
        if (a == 1) {
            return b;
        }
        return doTest(a-1,b)+2;

    }
}
