package com.example.mars.demo;

public class Test20210305Int {
    public static void main(String[] args) {
        int b=reverse(-33647);
        System.out.println(b);
    }

    public static int reverse(int x) {
        boolean flag=false;
        String str=x+"";
        if (str.contains("-")) {
            str=str.substring(1);
            flag=true;
        }
        StringBuffer sb=new StringBuffer(str);
        String str2=sb.reverse().toString();
        try {
            if (flag ==true) {
                return -Integer.parseInt(str2);
            }
            return Integer.parseInt(str2);
        }catch (Exception e){
            // e.printStackTrace();
            return 0;
        }

    }
}
