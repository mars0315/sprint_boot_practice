package com.test.testLeetCode;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class Test20210419SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4}));
    }

    public static int singleNumber(int[] nums) {
        if (nums.length ==0) {
            return 0;
        }
        Arrays.sort(nums);
        int i=0;
        while (i+2<nums.length){
            if (nums[i] ==nums[i+1]) {
                i=i+2;
            }else {
                return nums[i];
            }
        }
        return nums[i];
    }
}
