package com.example.mars.demo;

public class TestPalindromic {
    public static void main(String[] args) {
        doTest(13431);
    }

    public static void doTest(int a) {
        if (String.valueOf(a).length()==5) {
            System.out.println("is a 5th number");
        }
        char[] chars=String.valueOf(a).toCharArray();
        if (chars[0] == chars[chars.length-1]&&chars[1]==chars[chars.length-2]) {
            System.out.println("is a palindromic");
        }
    }
}
