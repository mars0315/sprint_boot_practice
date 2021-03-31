package testDemo;

import java.util.*;

public class TestNumbers {
    public static void main(String[] args) {
        doTest3();
    }

    public static void doTest() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入N个数，以“，”分隔：");
        String  str=scanner.nextLine();
        String[] strs=str.split(",");
        List list=new ArrayList();
        for (String st:strs
             ) {
            list.add(Integer.parseInt(st));
        }
//        list.sort(new Comparator() {
////            @Override
////            public int compare(Object o1, Object o2) {
////                return (Integer) o1;
////            }
////        });
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void doTest2() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入3个数：");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=0;
        if (a>=b) {
            d=a;
            a=b;
            b=d;
        }
        if (a>=c) {
            d=a;
            a=c;
            c=d;
        }
        if (b>=c) {
            d=b;
            b=c;
            c=d;
        }
        System.out.println(a+","+b+","+c);
    }

    public static void doTest3() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入3个数：");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if (a>b) {
            if (b > c) {
                System.out.println(c +"+"+ b +"+"+ a);
            } else if (a > c) {
                System.out.println(b +"+"+ c +"+"+ a);
            } else {
                System.out.println(b +"+"+a +"+"+c);
            }
        }else {
            if (b < c) {
                System.out.println(a +"+"+ b +"+"+ c);
            } else if (a > c) {
                System.out.println(c +"+"+ a +"+"+ b);
            } else {
                System.out.printf("%d<%d<%d",a,c,b);
            }
        }
    }
}
