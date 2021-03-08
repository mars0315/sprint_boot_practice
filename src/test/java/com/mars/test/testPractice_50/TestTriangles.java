package testDemo;

import java.util.ArrayList;
import java.util.List;

public class TestTriangles {
    public static void main(String[] args) {
        doTest();
    }

    /**
     * 杨辉三角形
     *           1
     *         1   1
     *       1   2   1
     *     1   3   3   1
     *   1   4   6   4   1
     *
     */
    public static void doTest() {
        int[][] ints=new int[10][10];
        //一共打印10行
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <=i ; j++) {
                if (i >=2&&j!=0&&j!=i) {
                    ints[i][j]=ints[i-1][j-1]+ints[i-1][j];
                }else {
                    ints[i][j]=1;
                }
            }
        }
        for (int[] a:ints
             ) {
            for (int b:a
                 ) {
                if (b == 0) {
                    continue;
                }
                System.out.print(b+",");
            }
                System.out.println();
        }
    }
}
