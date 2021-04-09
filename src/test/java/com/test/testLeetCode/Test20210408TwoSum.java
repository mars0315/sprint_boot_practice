package com.test.testLeetCode;

import java.util.HashMap;

public class Test20210408TwoSum {
    public static void main(String[] args) {
        int[] ints=twoSum(new int[]{2,3,4},6);
        for (int a:ints
             ) {
            System.out.println(a);
        }
    }

    public static int[] twoSum(int[] numbers,int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (hashMap.containsKey(target - numbers[i])) {
                return new int[]{hashMap.get(target-numbers[i])+1, i + 1};
            } else {
                hashMap.put(numbers[i], i);
            }
        }
        return new int[]{0, 0};
    }
}
