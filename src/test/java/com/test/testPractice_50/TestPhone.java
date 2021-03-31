package com.example.mars.demo;

public class TestPhone {
    public static void main(String[] args) {
        int a=doTest(1234);
        System.out.println(a);
        // int a=1234;
        // System.out.println(a/1000);
    }

    /**某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：
     * 每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
     *
     */
    public static int doTest(int num) {
        if (num/1000<=0) {
            return 0;
        }
        int sum=0;
        int a,b,c,d;
        a=num/1000;
        b=num/100%10;
        c=num%100/10;
        d=num%10%10%10;
        //每位数字都加上5求和
        a=a+5;
        b=b+5;
        c=c+5;
        d=d+5;
        //除以10求余数
        a=a%10;
        b=b%10;
        c=c%10;
        d=d%10;
        //第1位和第4位交换;第2位和第3位交换
        sum=d*1000+c*100+b*10+a;
        return sum;

    }
}
