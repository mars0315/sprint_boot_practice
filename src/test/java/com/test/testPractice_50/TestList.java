package com.example.mars.demo;

import java.util.*;

public class TestList {
    public static void main(String[] args) {
        List list=doList("sdfsdfsdadfsffsdzsffddda");
        System.out.println(list);
        List list1=testChars("sdfsdfsdadfsffsdzsffddda");
        System.out.println(list1);
    }

    public static List<Character> testChars(String string) {
        char[] chars=string.toCharArray();
        List<Character> list=new ArrayList<Character>();
        for (int i = 0; i <chars.length-1 ; i++) {
            for (int j = 0; j <chars.length-1 ; j++) {
                if (chars[j] >=chars[j+1]) {
                    char c=chars[j];
                    chars[j]=chars[j+1];
                    chars[j+1]=c;
                }
            }
        }
        for (char c:chars
             ) {
            list.add(c);
        }
        return list;
    }

    public static List<Map.Entry<Character, Integer>> doList(String str) {
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for (char c:str.toCharArray()
             ) {
            if (map.containsKey(c)) {
                map.put(c,map.get(c)+1);

            }else {
                map.put(c,1);
            }
        }
        List<Map.Entry<Character,Integer>> list1= new ArrayList<HashMap.Entry<Character, Integer>>(map.entrySet());
        Collections.sort(list1, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        return list1;
    }
}
