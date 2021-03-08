package testDemo;

import java.util.Scanner;

public class TestDays {
    public static void main(String[] args) {
        doTest();
    }

    public static void doTest() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年月日：");
        String date=scanner.nextLine();
        String a=date.substring(0,4);
        System.out.println(a);
        String b=date.substring(4,6);
        System.out.println(b);
        String c=date.substring(6,8);
        System.out.println(c);
        int days=0;
        int sum;
        switch (Integer.parseInt(b)){
            case 1:days=0;break;
            case 2:days=31;break;
            case 3:days=59;break;
            case 4:days=90;break;
            case 5:days=120;break;
            case 6:days=151;break;
            case 7:days=181;break;
            case 8:days=212;break;
            case 9:days=243;break;
            case 10:days=273;break;
            case 11:days=304;break;
            case 12:days=334;break;
            default:break;
        }
        if (Integer.parseInt(a)%4 == 0&&Integer.parseInt(b)>2) {
            sum=days+Integer.parseInt(c)+1;
            System.out.println("sum="+days+"+"+c+"+"+1);
        }else {
            sum=days+Integer.parseInt(c);
            System.out.println("sum="+days+"+"+c);
        }
        System.out.println(sum);
    }
}
