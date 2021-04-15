package com.test.testLeetCode;

public class Test20210413MaxProfit {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,6,3,5}));
    }

    public static int maxProfit(int[] prices) {
        int max=0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <prices.length ; i++) {
            if (prices[i]<=min) {
                min=prices[i];
            }else if (prices[i]-min>=max) {
                max=prices[i]-min;
            }
        }
        return max;
    }
}
