package com.test.testLeetCode;

public class Test20210416IsPalindrome {
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        // String str="op";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        int a=0;
        int b=s.length()-1;
        s=s.toUpperCase();
        while (a<b){
            char aa=s.charAt(a);
            char bb=s.charAt(b);
            while ((s.charAt(a)<'A'||s.charAt(a)>'Z')&&(s.charAt(a)<'0'||s.charAt(a)>'9')) {
                a++;
            }
            while ((s.charAt(b)<'A'||s.charAt(b)>'Z')&&(s.charAt(b)<'0'||s.charAt(b)>'9')) {
                b--;
            }
            if (s.charAt(a)!=s.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
