package com.example.mars.demo;

public class TestDaffodil {
    public static void main(String[] args) {
        countNarcissisticNumber();
    }

    public static void countNarcissisticNumber(){
        int a,b,c;
        int count=0;
        for (int i = 100; i <1000 ; i++) {
          a=i/100;
          b=i%100/10;
          c=i%100%10;
          if(a*100+b*10+c == Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)){
              System.out.println(i);
              count++;
          }
        }
        System.out.println(count);
    }
}
