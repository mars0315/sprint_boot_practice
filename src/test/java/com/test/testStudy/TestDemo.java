package com.test.testStudy;

public class TestDemo {
    public static void main(String [] args){
        String s = removeSameStr("aaabbbccc");
        System.err.println(s);
    }
    public static String removeSameStr(String str){
        if(str == ""){
            return "";
        }
        StringBuffer sb = new StringBuffer();
        int i = 0;
        int length = str.length();
        while(i < length){
            char c = str.charAt(i);
            sb.append(c);
            i++;
            while(i < length && c == str.charAt(i)){
                i++;
            }
        }
        return sb.toString();

    }

}
