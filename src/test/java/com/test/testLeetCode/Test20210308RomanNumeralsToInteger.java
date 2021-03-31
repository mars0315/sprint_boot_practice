package com.example.mars.demo;

import java.util.HashMap;
import java.util.Map;

public class Test20210308RomanNumeralsToInteger {
    public static void main(String[] args) {
        int a=RomanTransferToInteger("MCMXCIV");
        System.out.println(a);
    }

    /**
     * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
     * 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
     * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
     * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
     * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900
     * @param str
     */
    public static int RomanTransferToInteger(String str) {
        int sum=0;
        //读取每个字符
        char[] chars=str.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            //如果是I且I的下一位是V或者X，一起处理
            if (i==chars.length-1) {
                sum += doCount(String.valueOf(chars[i]));
                return sum;
            }
            if ((chars[i] =='I'&&chars[i+1]=='V')||(chars[i] =='I'&&chars[i+1]=='X')) {
                sum+=doCount(String.valueOf(chars[i])+String.valueOf(chars[i+1]));
                i++;
                //如果是X且X的下一位是L或者C，一起处理
            }else if ((chars[i] =='X'&&chars[i+1]=='L')||(chars[i] =='X'&&chars[i+1]=='C')) {
                sum+=doCount(String.valueOf(chars[i])+String.valueOf(chars[i+1]));
                i++;
                //如果是C且C的下一位是D或者M，一起处理
            }else if ((chars[i] =='C'&&chars[i+1]=='D')||(chars[i] =='C'&&chars[i+1]=='M')) {
                sum+=doCount(String.valueOf(chars[i])+String.valueOf(chars[i+1]));
                i++;
            }else {
                sum += doCount(String.valueOf(chars[i]));
            }
        }
            //返回sum
        return sum;
    }

    public static int doCount(String str) {
        Map<String,Integer> maps=new HashMap<>();
        maps.put("I",1);
        maps.put("V",5);
        maps.put("X",10);
        maps.put("L",50);
        maps.put("C",100);
        maps.put("D",500);
        maps.put("M",1000);
        maps.put("IV",4);
        maps.put("IX",9);
        maps.put("XL",40);
        maps.put("XC",90);
        maps.put("CD",400);
        maps.put("CM",900);
        return maps.get(str);
    }
}
