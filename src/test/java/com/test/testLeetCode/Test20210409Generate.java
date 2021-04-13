package com.test.testLeetCode;

import java.util.ArrayList;
import java.util.List;

public class Test20210409Generate {
    public static void main(String[] args) {
        List<Integer> list=generate2(0);
        for (int a :list
        ){
            System.out.println(a);
        }
//        List<List<Integer>> lists=generate(5);
//        for (List<Integer> list:lists
//        ) {
//            for (int a:list
//            ) {
//                System.out.println(a);
//            }
//        }
    }

    //
    public static List<Integer> generate2(int numRows) {
        int n=numRows+1;
        int[][] ints=new int[n][n];
        List<List<Integer>> lists=new ArrayList<List<Integer>>();
        for (int i = 0; i <n ; i++) {
            ints[i][0]=ints[i][i]=1;
            for (int j = 1; j <=n-1; j++) {
                if (i>=2) {
                    ints[i][j] = ints[i - 1][j - 1] + ints[i - 1][j];
                }
            }
            List<Integer> list=new ArrayList<Integer>();
            for (int j = 0; j <n ; j++) {
                if (ints[i][j] != 0) {
                    list.add(ints[i][j]);
                }
            }
            lists.add(list);
        }
        return lists.get(n-1);
    }

    //
    public static List<List<Integer>> generate(int numRows) {
        int n=numRows;
        int[][] ints=new int[n][n];
        List<List<Integer>> lists=new ArrayList<List<Integer>>();
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <=n-1; j++) {
                ints[i][0]=ints[i][i]=1;
                if (i>=2) {
                    ints[i][j] = ints[i - 1][j - 1] + ints[i - 1][j];
                }
            }
            List<Integer> list=new ArrayList<Integer>();
            for (int j = 0; j <n ; j++) {
                if (ints[i][j] != 0) {
                    list.add(ints[i][j]);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
