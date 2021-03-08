package com.example.mars.demo;

import java.util.Scanner;

public class TestRabbits {
    public static void main(String[] args) {
        test123();
    }

    public static void test123() {
        int co = Integer.parseInt(testScanner());
        // System.out.println(co);
        System.out.println("totle rabbits are:" + rabbitsCount(co));

    }

    public static String testScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input the number to guess the rabbits:");
        String str = "";
        if (scanner.hasNextLine()) {
            str = scanner.nextLine();
        }
        // System.out.println(str);
        return str;

    }

    //计算兔子的总数
    public static Integer rabbitsCount(int count) {
        if (count == 1 || count == 2) {
        } else {
            count = rabbitsCount(count - 1) + rabbitsCount(count - 2);
            return count;
        }
        return 1;
    }

}
