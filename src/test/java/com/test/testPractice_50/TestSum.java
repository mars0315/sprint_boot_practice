package com.example.mars.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestSum {
    public static void main(String[] args) {
        // testSum(16);
        // testSum2(new int[]{1,4,7,9,10,11,13,14,15},22);
        int[] a=testSum3(new int[]{1,4,7,9,10,11,13,14,15},22);
        for (int b:a
             ) {
            System.out.println(b);
        }
    }

    public static int[] testSum3(int[] ints,int a) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i <ints.length ; i++) {
            int b=a-ints[i];
            if (list.contains(b)) {
                return new int[]{b,ints[i]};
            }
            list.add(ints[i]);
        }
        return null;
    }

    public static int[] testSum2(int[] nums, int target) {
        if (nums != null) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int temp = target - nums[i];
                if (hashMap.containsKey(temp)) {
                    return new int[]{hashMap.get(temp), i};
                } else {
                    hashMap.put(nums[i], i);
                }
            }
        }
            return null;
    }



    public static void testSum(int a) {
        int[] ints=new int[]{1,4,7,9,10,11,13,14,15};
        for (int i = 0; i <ints.length ; i++) {
            for (int j = i+1; j <ints.length ; j++) {
                if (ints[i]+ints[j] == a) {
                    System.out.println(ints[i]+"+"+ints[j]);
                }
            }
        }
    }
}
