package com.test.testLeetCode;

import java.util.Arrays;

public class Test20210407Merge {
    public static void main(String[] args) {
        merge2(new int[]{1,2,3,0,0,0},3,new int[]{1,2,5},3);
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i <m+n ; i++) {
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
        System.out.println(nums1);
    }
}
