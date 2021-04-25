package com.test.testStudy;

public class TestConvertToTitle {
    public static void main(String[] args) {
        String str=convertToTitle(116);
        System.out.println(str);
    }

    public static String convertToTitle(int a){
        if (a <=0) {
            return "";
        }
        StringBuffer sb=new StringBuffer();
        while (a>0){
            a--;
            sb.append((char)(a%26+65));
            a=a/26;
        }
        return sb.reverse().toString();
    }
}
