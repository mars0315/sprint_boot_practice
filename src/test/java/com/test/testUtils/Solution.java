package com.example.mars.demo;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] a=twoSum(new int[]{1,4,7,9,10,13,14,15},21);
        for (int b:a
        ) {
            System.out.println(b);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i <nums.length ; i++) {
            int b=target-nums[i];
            if (list.contains(b)) {
                return new int[]{list.indexOf(b),i};
            }
            list.add(nums[i]);
        }
        return null;
    }
}
