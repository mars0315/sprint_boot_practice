package com.example.mars.demo;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        doTest();
    }

    /**求一个3*3矩阵对角线元素之和
     * [1,2,3]
     * [4,5,6]
     * [7,8,9]
     */
    public static void doTest() {
        int[][] ints=new int[3][3];
        System.out.println("请分别输入矩阵的9个数：");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int k=0;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                    ints[i][j]=Integer.parseInt(str.substring(k,k+1));
                    System.out.print(ints[i][j]);
                    k++;
                }
            System.out.println();
        }
        int sum1=0;
        int sum2=0;
        int i,j;
        for (i = 0,j=2; i <3&&j>=0 ; i++,j--) {
                sum1+=ints[i][i];
                System.out.println(sum1);
                sum2+=ints[i][j];
                System.out.println(sum2);
        }
        int sum=sum1+sum2;
        System.out.println(sum);
        }
}
