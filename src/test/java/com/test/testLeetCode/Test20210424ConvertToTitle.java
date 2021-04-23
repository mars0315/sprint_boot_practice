package com.test.testLeetCode;

public class Test20210424ConvertToTitle {
    public static void main(String[] args) {
        int a=1403;
        String str=convertToTitle(a);
        System.out.println(str);
    }
    public static String convertToTitle(int columnNumber) {
        StringBuffer sb=new StringBuffer();
        if (columnNumber<=0) {
            return "";
        }
        while (columnNumber>0){
            columnNumber--;
            sb.append((char)(columnNumber%26+65));
            columnNumber=columnNumber/26;
        }
        return sb.reverse().toString();
    }

    public static String convertToTitle2(int columnNumber) {
        if (columnNumber <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            sb.append((char) (columnNumber % 26 + 'A'));
            columnNumber =columnNumber / 26;
        }
        return sb.reverse().toString();
    }

}
