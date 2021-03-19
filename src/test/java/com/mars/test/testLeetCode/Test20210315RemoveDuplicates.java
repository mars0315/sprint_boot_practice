package com.mars.test.testLeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 */
public class Test20210315RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("一个有几个数"+removeDuplicates1(new int[]{1,1,2}));
    }

    public static int removeDuplicates1(int[] nums) {
        List<Integer> list=new ArrayList();
        for (int i = 0; i <nums.length ; i++) {
            if (list.contains(nums[i])) {
                continue;
            }else {
                list.add(nums[i]);
            }
        }

        for (int a:list
             ) {
            System.out.println(a);
        }
        return list.size();
    }

}
