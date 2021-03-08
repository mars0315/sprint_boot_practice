package com.example.mars.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestOrder2 {
    public static void main(String[] args) {
        doTest("5685367892");
    }

    public static void doTest(String str) {
        char[] chars=str.toCharArray();
        List list=new ArrayList();
        for (char a:chars
             ) {
            list.add(a);
        }
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
