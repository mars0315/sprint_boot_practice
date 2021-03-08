package com.example.mars.demo;

import java.util.Scanner;

public class TestFactorization {
    public static void main(String[] args) {
        // Integer integer=Integer.parseInt(doScanner());
        // doFactorization(integer);
        // Integer integer=doScanner2();
        // doFactorization(integer);
        doFactorization(Integer.parseInt(doScanner()));
    }


    public static String doScanner() {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input the factorization:");
        if (sc.hasNextLine()) {
            String st=sc.nextLine();
            sc.close();
            return st;
        }
        sc.close();
        return null;
    }

    public static Integer doScanner2() {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input the factorization:");
        if (sc.hasNextInt()) {
            Integer st=sc.nextInt();
            sc.close();
            return st;
        }
        sc.close();
        return null;
    }

    public static void doFactorization(int aInt) {
        for (int i = 2; i <=aInt ; i++) {
            if (aInt%i == 0) {
                System.out.println(i);
                doFactorization(aInt/i);
                break;
            }
        }
    }
}
