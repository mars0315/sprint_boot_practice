package com.example.mars.demo;

import java.util.Scanner;

public class TestMultiplications {
    public static void main(String[] args) {
        doTest2();
    }

    public static int doTest() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please set the number:");
        int a=scanner.nextInt();
        System.out.println("please set another number:");
        int b=scanner.nextInt();

        return a*b;
        
    }

    public static void doTest2() {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=9 ; j++) {
                System.out.print("\t"+i*j);
            }
        }

    }
}
