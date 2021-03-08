package com.example.mars.demo;

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        doTestScore();
    }

    public static void doTestScore() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the score:");
        String flag = null;
        if (sc.hasNextInt()) {
            int aInt = sc.nextInt();
            sc.close();
            flag = (aInt >= 90 && aInt <= 100) ? "a" : ((aInt < 60 && aInt >= 0) ? "c" : ((aInt >= 60 && aInt <= 89) ? "b" : "d"));
        }
        switch (flag) {
            case "a":
                System.out.println("the score is A");
                break;
            case "b":
                System.out.println("the score is B");
                break;
            case "c":
                System.out.println("the score is C");
                break;
            default:
                System.out.println("wrong score");

        }
    }
}
