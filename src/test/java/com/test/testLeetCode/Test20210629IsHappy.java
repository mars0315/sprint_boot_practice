package com.test.testLeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test20210629IsHappy {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        //当数<4&&！=1
        //拆分整数
        //每个数相乘后相加
        if (n == 0) {
            return false;
        }
        Set<Integer> cycleMembers =
                new HashSet<>(Arrays.asList(4, 16, 37, 58, 89, 145, 42, 20));

        while (n!=1){
            int sum=0;
            int a=0;
            while (n!=0){
                a=n%10;
                sum+=a*a;
                n=n/10;
            }
            n=sum;
            if (cycleMembers.contains(n)) {
                return false;
            }
        }
        return true;
    }
}
