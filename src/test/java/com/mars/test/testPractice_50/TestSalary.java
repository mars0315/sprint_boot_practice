package com.example.mars.demo;

import java.util.Scanner;

public class TestSalary {
    public static void main(String[] args) {
        doSalary();
    }

    public static void doSalary() {
    //企业发放的奖金根据利润提成。
    double salary=0;
    double basic=100000;
    Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您的利润：");
    double Li=scanner.nextDouble();
    // 利润(I)低于或等于10万元时，奖金可提10%；
        if (Li <= basic) {
            salary=salary+Li*0.1;
        }
    // 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
        else if (Li >basic&&Li<=2*basic) {
            salary=salary+basic*0.1+(Li-basic)*0.075;
        }
    // 20万到40万之间时，高于20万元的部分，可提成5%；
        else if (Li > 2*basic&&Li<=4*basic ) {
            salary=salary+basic*0.1+basic*0.075+(Li-2*basic)*0.05;
        }
    // 40万到60万之间时高于40万元的部分，可提成3%；
        else if (Li >4*basic&&Li<=6*basic) {
            salary=salary+basic*0.1+basic*0.075+2*basic*0.05+(Li-4*basic)*0.03;
        }
    // 60万到100万之间时，高于60万元的部分，可提成1.5%，
        else if (Li>6*basic&&Li<=10*basic) {
            salary=salary+basic*0.1+basic*0.075+2*basic*0.05+2*basic*0.03+(Li-6*basic)*0.015;
        }
    // 高于100万元时，超过100万元的部分按1%提成，
        else if (Li>10*basic) {
            salary=salary+basic*0.1+basic*0.0752+2*basic*0.05+2*basic*0.03+4*basic*0.015+(Li-10*basic)*0.01;
        }else {
            System.out.println("请输入正确的金额，谢谢！");
        }
    // 从键盘输入当月利润I，求应发放奖金总数？
        System.out.println("您的奖金是："+salary+"元");

    }
}
