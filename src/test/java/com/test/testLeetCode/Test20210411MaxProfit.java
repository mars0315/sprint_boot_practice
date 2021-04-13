package com.test.testLeetCode;

public class Test20210411MaxProfit {
    public static void main(String[] args) {
//        System.out.println(maxProfit(new int[]{1,2}));
    System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
}

    public int maxProfit2(int[] prices) {
        int max=0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <prices.length ; i++) {
            if (prices[i]<min) {
                min=prices[i];
            }else if (prices[i]-min>max) {
                max=prices[i]-min;
            }
        }
        return max;
    }


    public static int maxProfit(int[] prices) {
        //从左往右，第一个数依次和后面的数比较，大于则替换max，小于则继续
        int max=0;
        for (int i = 0; i <prices.length ; i++) {
            for (int j =i+1; j<prices.length ; j++) {
                int com=-(prices[i]-prices[j]);
                if (com>max) {
                    max=com;
                }
            }
        }
        return max;
    }
}