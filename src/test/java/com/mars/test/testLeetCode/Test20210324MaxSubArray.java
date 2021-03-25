package com.mars.test.testLeetCode;

public class Test20210324MaxSubArray {
    public static void main(String[] args) {
        int mm= maxSubArray2(new int[]{-2,1,-3,4,-1,2,1,-5,4} );
        System.out.println(mm);
    }

    public static int maxSubArray2(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }


    public static int maxSubArray(int[] nums) {
        //给定一个数组，第一层循环是数组中数的多少，第二层循环是数组的位置
        //所有数相加放道max中，如果后面有相加超过max的，则替换
        int max=nums[0];
         for (int i = 0; i<= nums.length ; i++) {
            for (int j = 0; j <= nums.length - i; j++) {
            int sum = 0;
                //求和
                for (int k = 0; k < i; k++) {
                    sum = sum + nums[k + j];
                }
                max = Math.max(max,sum);
            }
            i++;
        }
        return max;
    }
}
