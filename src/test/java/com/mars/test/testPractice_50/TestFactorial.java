package com.example.mars.demo;

public class TestFactorial {
    public static void main(String[] args) {
        Long b=doTest(15);
        System.out.println(b);
        Long c=doTest3(15);
        System.out.println(c);
        doTest4(15);
    }

    public static void doTest4(int num) {
        long temp = 0L;
        long sum = 0L;
        for(int i = 1; i <= num; i++){
            temp = recursion(i);
            sum += temp;
        }
        System.out.println("计算到" + num + "的阶乘和是 " + sum);
    }

    //计算某个数 num 的阶乘
    private static long recursion(int num) {
        // TODO Auto-generated method stub
        if(num > 1){
            return num * recursion(num - 1);
        }
        return 1;
    }


    /**
     * 求1+2!+3!+...+20!的和。
     */
    public static Long doTest3(int a) {
        Long sum2=0L;
        //第一层循环有多少个数
        for (int i = 0; i <a ; i++) {
            //第二层循环每个数求和
            Long sum=1L;
            for (int j = a-i; j>0 ; j--) {
                sum=sum*j;
            }
            sum2=sum2+sum;
        }
        return sum2;
    }




    public static Long doTest(int a) {
        Long sum=0L;
        for (int i = 1; i <=a ; i++) {
            sum+=doTest2(i);
        }
        return sum;
    }
    /**
     * 递归
     * @param a
     * @return
     */
    public static Long doTest2(int a) {
        if (a == 1) {
            return 1L;
        }else {
            return a * doTest2(a - 1);
        }
    }
}
