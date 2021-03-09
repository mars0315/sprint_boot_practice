package testDemo;

import java.util.Scanner;

public class TestAdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入所要加的数字：");
        String str=scanner.nextLine();
        String[] c1= str.split(",");
        int[] c2=null;
        for (String c3:c1
             ) {
            Integer.parseInt(c3);
        }
        int c=testAdd(3,4,5,6,7,8,9);
        System.out.println(c);
    }

    public static int testAdd(int... a) {
        int count=0;
        for (int a1:a
             ) {
            count=count+a1;
        }
        return (count);
    }
}
