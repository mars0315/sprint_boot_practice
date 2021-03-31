package com.example.mars.demo;

import java.util.Scanner;

public class TestStar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input the row:");
        int a=scanner.nextInt();
        doTest(a);
    }

    public static void doTest(int a) {
        for (int i = 1; i <=a ; i++) {
            for (int j = a-i; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = a-1; i >0 ; i--) {
            for (int j = i; j <a ; j++) {
                System.out.print(" ");
            }
            for (int j = 2*i-1; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
