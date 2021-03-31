package com.test.testLeetCode;

public class Test20210318RemoveElement {
    public static void main(String[] args) {
//        int b=removeElement(new int[]{1,1,2,3,4},1);
//        System.out.println("b="+b);
        int b=strStr("aaaaa","");
        System.out.println(b);
    }
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        //1,1,2,3,5  1
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i]=nums[j];
                i++;
            }
        }
        for (int j = i; j <nums.length ; j++) {
            nums[j]=val;
        }
        for (int a:nums
             ) {
            System.out.println(a);
        }
        return i;
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);

    }
}
