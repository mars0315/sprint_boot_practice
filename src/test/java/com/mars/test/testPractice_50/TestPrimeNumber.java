package com.example.mars.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPrimeNumber {
    public static void main(String[] args) {
        // createScanner();
        System.out.println(primeAssert());
    }

    public static String createScanner(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input the number:");
        String str="";
        if (scanner.hasNextLine()) {
            str=scanner.nextLine();
            System.out.println(str);
        }
        scanner.close();
        return str;
    }

    //求质数
    public static List primeAssert(){
        List<Integer> list=new ArrayList<Integer>();
        //第一层循环保证每个数循环一次
        for (int i = 101; i <=200 ; i++) {
        //第二层循环判断是不是质数
            //给出标签默认是质数
            boolean isPrime=true;
            // 如果能被除了1和自身整除，那么不是质数，打上标签退出
            for (int j = 2; j <i ; j++) {
                if (i%j ==0) {
                isPrime=false;
                break;
                }
            }
            // 否则加入到list中并输出
            if (isPrime==true){
                list.add(i);
            }
        }
        return list;
    }
}
