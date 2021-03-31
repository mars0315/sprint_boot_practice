package com.test.testLeetCode;

public class Test20210319SearchInsert {
    public static void main(String[] args) {
        searchInsert(new int[]{1,3,5,6},2);
    }

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     *
     * 你可以假设数组中无重复元素。
     * @param nums,target
     */
    public static int searchInsert(int[] nums,int target) {
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] < target) {
                continue;
            }else{
                return i;
            }
        }
        return nums.length+1;
    }


}
