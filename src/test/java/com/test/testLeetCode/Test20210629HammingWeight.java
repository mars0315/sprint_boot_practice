package com.test.testLeetCode;

public class Test20210629HammingWeight {
    public static void main(String[] args) {
        System.out.println(hammingWeight(0b11111111111111111111111111111101));
    }

    public static int hammingWeight(int n) {
        int sum=0;
        //整型拆成2进制
        String str=Integer.toBinaryString(n);
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == '1') {
                sum++;
            }
        }
        return sum;
    }
}
