package com.mars.test.testPractice_50;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.Matcher;

public class TestStringCount {
    public static void main(String[] args) {
        doTest("ssgdlgjdgldgldlkjl","dgl");
    }

    public static void doTest(String str1,String str2) {
        int count=0;
        System.out.println(str1);
        while (str1.contains(str2)){
            count++;
            str1=str1.substring(0,str1.indexOf(str2))+str1.substring(7+str2.length());
            System.out.println(str1);
        }
        System.out.println(count);
    }
}
