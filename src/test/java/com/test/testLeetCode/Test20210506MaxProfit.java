package com.test.testLeetCode;

public class Test20210506MaxProfit {
    public static void main(String[] args) {
        System.out.println(maxProfit2(new int[]{7,6,4,3,1}));
    }

    public static int maxProfit(int[] prices) {
        int min=0;
        int max=0;
        for (int i = 0; i <prices.length-1 ; i++) {
            if (prices[i]>prices[i+1]) {
                min=prices[i+1];
            }else {
                min=prices[i];
                max+=prices[i+1]-min;
                min=prices[i+1];
            }

        }
        return max;
    }

    public static int maxProfit2(int[] prices) {
        int min=0;
        int max=0;
        for (int i = 0; i <prices.length-1 ; i++) {
            if (prices[i]<prices[i+1]) {
                min=prices[i];
                max+=prices[i+1]-min;
            }
        }
        return max;
    }
}
