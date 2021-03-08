package com.example.mars.demo;

import java.util.Scanner;

public class TestDate2 {
    public static void main(String[] args) {
        doTest();
    }

    /**
     * 一Monday；二Tuesday；三Wednesday；四Thursday；五Friday；六Saturday；七Sunday
     */
    public static void doTest() {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input the first letter");
        String str=sc.nextLine();
        switch (str){
            case "m":
                System.out.println("是星期一");
                break;
            case "w":
                System.out.println("是星期三");
                break;
            case "f":
                System.out.println("是星期五");
                break;
            case "t":
                System.out.println("可能是星期二也可能是星期四，请输入第二个字母");
                String str2=sc.nextLine();
                switch (str2){
                    case "u":
                        System.out.println("是星期二");
                        break;
                    case "h":
                        System.out.println("是星期四");
                        break;
                    default:
                        System.out.println("输入错误");
                }
                break;
            case "s":
                System.out.println("可能是星期六也可能是星期日，请输入第二个字母");
                String str3=sc.nextLine();
                switch (str3){
                    case "a":
                        System.out.println("是星期六");
                        break;
                    case "u":
                        System.out.println("是星期日");
                        break;
                    default:
                        System.out.println("输入错误");
                }
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
