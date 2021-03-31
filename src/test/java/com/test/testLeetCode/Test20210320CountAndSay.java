package com.test.testLeetCode;

public class Test20210320CountAndSay {
    public static void main(String[] args) {
        countAndSay(6);
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String str=countAndSay(n-1);
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i <str.length() ; i++) {
            int a=1;
            while (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                a++;
                i++;
            }
            sb.append(a);
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }


}
