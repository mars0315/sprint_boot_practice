package com.mars.test.testLeetCode;

import java.util.Arrays;

public class Test20210309StringPrefix {
    public static void main(String[] args) {
        String str=longestCommonPrefix(new String[]{"ab","abbwg","abbcwe","abbcwq"});
        System.out.println(str);
    }

    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * 如果不存在公共前缀，返回空字符串 ""。
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        int index = 0;
        String str = "";
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() == 0 || strs[0].length() == 0) {
                    return "";
                }
                if(index<getShorterIndex(strs)) {
                    char a = strs[0].charAt(index);
                    char b = strs[i].charAt(index);
                    if (a == b) {
                        if (i == strs.length - 1) {
                            index++;
                            i = 0;
                        }
                        continue;
                    }
                }
                    break;
        }
                return strs[0].substring(0, index);
    }

    public static int getShorterIndex(String[] strs) {
        int[] ints=new int[strs.length];
        for (int i = 0; i < strs.length ; i++) {
            ints[i]=strs[i].length();
        }
        Arrays.sort(ints);

        if (strs.length>=1) {
            return ints[0];
        }else {
            return 0;
        }
    }
}
