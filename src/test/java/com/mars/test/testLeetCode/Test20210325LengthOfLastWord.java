package com.mars.test.testLeetCode;

public class Test20210325LengthOfLastWord {

    public static void main(String[] args) {
        int a=lengthOfLastWord("");
        System.out.println(a);
    }

    public static int lengthOfLastWord(String s) {
        String[] ss=s.split(" ");
        int length=ss.length;
        if (length >0) {
            return ss[length-1].length();
        }
        return 0;
    }

}
