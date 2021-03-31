package com.example.mars.demo;

import java.util.Scanner;

public class TestNumbers5 {
    public static void main(String[] args) {
        doTest();
    }

    /**给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
     * 判断string的长度来确定是几位数
     * for循环逆序打印或者装入list后逆序输出
     */
    public static void doTest() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input the number:");
        String str=scanner.nextLine();
        System.out.println("是一个"+str.length()+"位数");
        StringBuffer sb=new StringBuffer(str).reverse();
        System.out.println(sb);
    }
}
