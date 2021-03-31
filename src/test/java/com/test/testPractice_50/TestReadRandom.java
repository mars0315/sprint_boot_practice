package com.example.mars.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class TestReadRandom {
    public static void main(String[] args) {
        doTest();
    }

    public static void doTest() {
        List list=new ArrayList<>();
        Random random=new Random();
        int[] ints=new int[7];
        for (int j = 0; j <ints.length ; j++) {
            ints[j]=random.nextInt(50)+1;
            int a=ints[j];
            if (list.contains(a)) {
                j--;
                continue;
            }
            list.add(a);
            System.out.println(a);

            for (int i = 1; i <=a ; i++) {
                System.out.print("*");
                // System.out.println();
            }
            System.out.println();
        }
    }
}
