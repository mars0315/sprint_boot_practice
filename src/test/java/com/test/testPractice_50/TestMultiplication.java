package com.example.mars.demo;

public class TestMultiplication {
    public static void main(String[] args) {
        int aFinal=(int)doMultiplicate(2,4);
        System.out.println(aFinal);
    }

    public static double doMultiplicate(double a,int b) {
        //公式=2+22+222+2222=（2，4），进行拆分
        //（2，1）=2*10（1-1）
        //（2，2）=2*10（2-2）+2*10（2-1）
        //（2，3）=2*10（3-3）+2*10（3-2）+2*10（3-1）
        //（a,b），b是循环次数，a是循环内的算式
        int num=0;
        int count=0;
        for (int i = 1; i <=b ; i++) {
            double c=Math.pow(10,i-1);
            num+=a*c;
            count=count+num;
        }
        return count;
    }

}
