package com.test.testLeetCode;

public class Test20210514ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(0b11111111111111111111111111111101));
    }

    public static int reverseBits(int n) {
            return Integer.reverse(n);
    }
}
