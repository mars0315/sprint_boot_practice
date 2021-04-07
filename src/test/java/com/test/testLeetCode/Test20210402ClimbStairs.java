package com.test.testLeetCode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test20210402ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));

    }

    public static int climbStairs(int n){
        if (n <2) {
            return 1;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
}
