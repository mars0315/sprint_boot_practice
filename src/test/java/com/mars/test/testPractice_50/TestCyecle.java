package testDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCyecle {
    public static void main(String[] args) {
//        doTest(new int[]{1,2,3,4,5,6,7,8,9,10});
        doTest1(11);
//        doTest2();
        doTest3(11);
    }

    /**有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位
     * 1，2，3，4，5，6，7，8，9，10
     * 第一轮3，6，9出局，剩下7人，1，2，4，5，7，8，10
     * 第二轮4，8出局，剩下5人，1，2，5，7，10
     * 第三轮5出局，剩下1，2，7，10
     * 第四轮7出局，剩下1，2，10
     * 第五轮10出局，剩下1，2
     * @param
     */
    public static void doTest(int[] ints) {
        while (true){
            List list = new ArrayList();
        for (int i = 0; i < ints.length; i++) {
            if ((i+1) % 3 != 0) {
                list.add(ints[i]);
            }
        }
        int[] ints1=new int[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            ints1[i]=(Integer) list.get(i);
        }
        ints=ints1;
            if (ints.length == 2) {
                System.out.println(ints[1]);
                break;
            }
        }
    }

    /**有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位
     * 1，2，3，4，5，6，7，8，9，10
     * 第一轮3，6，9出局，剩下7人，1，2，4，5，7，8，10
     * 第二轮2，7出局，剩下5人，1，4，5，8，10
     * 第三轮1，8出局，剩下4，5，10
     * 第四轮5出局，剩下4，10
     * 第五轮10出局，剩下4
     * @param
     */
    public static void doTest1(int a) {
        int[] ints=new int[a];
        for (int i = 0; i <a ; i++) {
            ints[i]=i+1;
        }
        while (true){
            List list = new ArrayList();
            for (int i = 3; i < ints.length; i++) {
                    list.add(ints[i]);
            }
            for (int i = 0; i <2 ; i++) {
                list.add(ints[i]);
            }
            int[] ints1=new int[list.size()];
            for (int i = 0; i <list.size() ; i++) {
                ints1[i]=(Integer)list.get(i);
            }
            ints=ints1;
            if (ints.length == 2) {
                System.out.println(ints[1]);
                break;
            }
        }
    }

    public static void doTest2() {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入排成一圈的人数：");
        int n = s.nextInt();
        boolean[] arr = new boolean[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        } //数组赋值都是true

        int leftCount = n;
        int countNum = 0;
        int index = 0;
        while (leftCount > 1) {
            if (arr[index] == true) {
                countNum++;
                if (countNum == 3) {
                    countNum = 0;
                    arr[index] = false;
                    leftCount--;
                }
            }
            index++;
            if (index == n) {
                index = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == true) {
                System.out.println("原排在第" + (i + 1) + "位的人留下了。");
            }
        }
    }

    public static void doTest3(int a) {
        boolean[] booleans=new boolean[a];
        int c=a;
        int b=0;
        int d=0;
        while (c>1) {
            //输入10个数，到3了去掉，到3了去掉，到3了去掉，等于a了强制等于0，另一个数判3，
            d++;
            if (booleans[d-1]!= true) {
                b++;
                if (b == 3) {
                    booleans[d-1]=true;
                    c--;
                    b=0;
                }
            }
                if (d == a) {
                    d=0;

                }

        }
        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i] == false) {
                System.out.println(i+1);
            }
        }
    }
}
