package com.example.mars.demo;

import java.util.*;

public class CharTest {
    public static void main(String[] args) {
        String str1="afsgdgsgfds";
        orderStringAsc(str1);
        orderStringDesc(str1);
        countChars2(str1);
        countChars(str1);
        orderMapAsc(str1);
        orderMapDesc(str1);
    }

    //字符串排序正序
    public static String orderStringAsc(String string) {
        char[] chars=string.toCharArray();
        if (chars == null) {
            System.out.println("chars is empty");
            return null;
        }
        for (int i = 0; i < chars.length-1; i++) {
            for (int j = 0; j < chars.length-1; j++) {
                if (chars[j]>chars[j+1]) {
                    char ch=chars[j+1];
                    chars[j+1]=chars[j];
                    chars[j]=ch;
                }
            }
        }
        String str="";
        for (int i = 0; i <chars.length ; i++) {
//                System.out.println(chars[i]);
            str=str+chars[i];
        }
        System.out.println(str);
        return str;
    }

    //字符串排序倒序
    public static String orderStringDesc(String string) {
        char[] chars=string.toCharArray();
        if (chars.length == 0) {
            System.out.println("chars is empty");
            return null;
        }
        for (int i = 0; i < chars.length-1; i++) {
            for (int j = 0; j < chars.length-1; j++) {
                if (chars[j]<chars[j+1]) {
                    char ch=chars[j+1];
                    chars[j+1]=chars[j];
                    chars[j]=ch;
                }
            }
        }
        String str="";
        for (int i = 0; i <chars.length ; i++) {
//                System.out.println(chars[i]);
            str=str+chars[i];
        }
        System.out.println(str);
        return str;
    }


    //求字符数
    public static HashMap countChars(String string) {
        char[] chars = string.toCharArray();
        if (chars.length == 0) {
            System.out.println("no chars input");
            return null;
        }
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
        for (int i = 0; i < chars.length - 1; i++) {
            if (hashMap.containsKey(chars[i])) {
                hashMap.put(chars[i], hashMap.get(chars[i]) + 1);
            }
            else {
                hashMap.put(chars[i], 1);
            }
        }
        System.out.println("hashmap="+hashMap);
        return hashMap;
    }

    //求已排序后的字符数
    public static HashMap countChars2(String string) {
        String str=orderStringAsc(string);
        char[] chars2 = str.toCharArray();
        if (chars2.length == 0) {
            System.out.println("no chars input");
            return null;
        }
        HashMap<Character,Integer> hashMap2 = new HashMap<Character,Integer>();
        for (int i = 0; i < chars2.length - 1; i++) {
            //第一个数传入key和value
            if (i == 0) {
                hashMap2.put(chars2[i], 1);
            }
            //第二个数和第一个比较，如果key相同，则value+1
            if (chars2[i + 1] == chars2[i]) {
                hashMap2.put(chars2[i], hashMap2.get(chars2[i]) + 1);
            }
            //如果key不相同，则传入新的key和value
            else {
                hashMap2.put(chars2[i + 1], 1);
            }
        }
        System.out.println("hashmap2="+hashMap2);
        return hashMap2;
    }


    //根据map倒序排序
    public static List orderMapDesc(String str){
        HashMap hm=countChars(str);
        List<Map.Entry<Character,Integer>> list=new ArrayList<Map.Entry<Character, Integer>>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
//            Collections.reverse(list);
        System.out.println("list="+list);
        for (Map.Entry<Character,Integer> entry:list
        ) {
            System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
        }
        return list;
    }

    //根据map正序排序
    public static List orderMapAsc(String str){
        HashMap hm=countChars(str);
        List<Map.Entry<Character,Integer>> list=new ArrayList<Map.Entry<Character, Integer>>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
//            Collections.reverse(list);
        System.out.println("list="+list);
        for (Map.Entry<Character,Integer> entry:list
        ) {
            System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
        }
        return list;
    }
    
}
