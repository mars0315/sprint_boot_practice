package com.test.testLeetCode;

public class Test20210406ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs2(5));
    }

    public static int climbStairs2(int n){
        if (n<2&&n>=0) {
            return 1;
        }else if (n<0) {
            return -1;
        }
        int first=1,second=1,sum=0;
        for (int i = 2; i <=n ; i++) {
            sum=first+second;
            first=second;
            second=sum;
        }
        return sum;
    }

    public static int climbStairs(int n){
        if (n <2&&n>=0 ) {
            return 1;
        }else {
        return climbStairs(n-1)+climbStairs(n-2);
        }
    }
}
