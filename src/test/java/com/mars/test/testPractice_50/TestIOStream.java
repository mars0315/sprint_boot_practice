package com.example.mars.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestIOStream {
    public static void main(String[] args) {
        doTest();
    }

    /**
     * 有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩，
     * 况原有的数据和计算出的平均分数存放在磁盘文件"stud"中。
     *
     */
    public static void doTest() {
        List<List<String>> lists=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String[] strings=new String[]{"学生号","姓名","语文","数学","英语"};
        for (int i = 0; i <5 ; i++) {
        List<String> list=new ArrayList<>();
            System.out.println("请输入第"+(i+1)+"个学生的学生号、姓名、语文、数学、英语成绩");
            for (int j = 0; j <strings.length ; j++) {
                System.out.println("请输入第"+(i+1)+"个学生的:"+strings[j]);
                String str=scanner.nextLine();
                list.add(str);
            }
            lists.add(list);
        }
        //计算出语文的平均成绩
        double sum1=doTest2(lists,2);
        System.out.println("语文平均成绩为："+sum1);
        //计算出数学的平均成绩
        double sum2=doTest2(lists,3);
        System.out.println("数学平均成绩为："+sum2);
        //计算出英语的平均成绩
        double sum3=doTest2(lists,4);
        System.out.println("英语平均成绩为："+sum3);
        //利用个人总分计算出总分的平均成绩
        double sum4=doTest3(lists,2,4);
        System.out.println("全部平均成绩为："+sum4);
        List<String> list=new ArrayList<>();
        list.add("0");
        list.add("全班");
        list.add(sum1+"");
        list.add(sum2+"");
        list.add(sum3+"");
        lists.add(list);
        doTest4("d:\\1.txt",lists);
    }

    public static double doTest2(List<List<String >> lists1,int a) {
        double sum=0.0;
        for (int i = 0; i <lists1.size() ; i++) {
            sum+=Integer.parseInt(lists1.get(i).get(a));
        }
        System.out.println("sum="+sum);
        sum=sum/5.0;
        return sum;
    }

    public static double doTest3(List<List<String >> lists1,int a,int b) {
        double sum=0.0;
        for (int i = 0; i <lists1.size() ; i++) {
            for (int j = a; j <=b ; j++) {
                sum+=Integer.parseInt(lists1.get(i).get(j));
            }
        }
        sum=sum/5.0;
        return sum;
    }

    public static void doTest4(String path,List<List<String >> lists1) {
        FileWriter file= null;
        try {
            file = new FileWriter(path);
            BufferedWriter bw=new BufferedWriter(file);
            for (int i = 0; i <lists1.size() ; i++) {
                for (int j = 0; j <lists1.get(i).size() ; j++) {
                    bw.write(lists1.get(i).get(j));
                    bw.write(" ");
                }
                bw.newLine();
            }
            bw.flush();
            bw.close();
            System.out.println("数据已写入完成！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
