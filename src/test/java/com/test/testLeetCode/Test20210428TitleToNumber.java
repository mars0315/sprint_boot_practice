package com.test.testLeetCode;

public class Test20210428TitleToNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("FXSHRXW"));
    }

    public static int titleToNumber(String columnTitle) {
        StringBuffer sb=new StringBuffer(columnTitle);
        if (sb.reverse().equals("")) {
            return 0;
        }
        int num=0;
        char[] chars=sb.toString().toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if (i==0) {
                num=num+chars[i]-64;
            }else {
                int b=new Double(Math.pow(26,i)).intValue();
                num=num+(chars[i]-'A'+1)*b;}
        }
        return num;
    }
}
