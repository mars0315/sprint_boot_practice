package com.test.testLeetCode;

public class Test20210330AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1111","1111"));
    }

    public static String addBinary(String a, String b) {
        //字符串返回和，短的字符串为循环，循环一次，
        //正常情况，1和0，该位变成1，返回字符串
        //如果2个都是1，该位变成0，i递进1位，如果都还是1再递进
        //如果字符串长度不同，以短的为标准
        if (a == null&&a=="") {
            return b;
        }
        if (b == null&&b=="") {
            return a;
        }
        String subString="";
        if (a.length()>=b.length()) {
            int sub=a.length()-b.length();
            for (int i = 0; i <sub ; i++) {
                subString+="0";
            }
            b=subString+b;
        }else {
            int sub=b.length()-a.length();
            for (int i = 0; i <sub ; i++) {
                subString+="0";
            }
            a=subString+a;
        }
        StringBuffer str=new StringBuffer();
        boolean flag=false;
        for (int i = a.length()-1; i >=0 ; i--) {
            int c=Integer.parseInt(a.charAt(i)+"")+Integer.parseInt(b.charAt(i)+"");
            if (flag == true) {
                c=c+1;
            }
            if ((c<2)) {
                str.append(c%2);
                flag=false;
            }else if (c > 2) {
                str.append(1);
                flag=true;
            }else {
                str.append(0);
                flag=true;
            }
            if (i ==0&&flag==true) {
                str.append(1);
            }
        }
        return str.reverse().toString();
    }
}
