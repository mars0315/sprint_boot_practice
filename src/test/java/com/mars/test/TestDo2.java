package testDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入区间内较小的数：");
        int a=scanner.nextInt();
        System.out.println("请输入区间内较大的数：");
        int b=scanner.nextInt();
        List list=testPrimer(a,b);
        System.out.println(list.toString());
    }

    //求100-200之间的质数，从100开始，如果可以被2-99的数整除，则不是
    public static List testPrimer(int a,int b) {
        List list=new ArrayList();
        for (int i =a; i <=b; i++) {
            boolean flag=true;
            for (int j = 2; j <i-1; j++) {
                if (i%j == 0) {
                    flag=false;
                    break;
                }
            }
            if (flag == true) {
                list.add(i);
            }
        }
        return list;
    }
}
