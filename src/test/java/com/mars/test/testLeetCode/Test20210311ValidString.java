package com.mars.test.testLeetCode;


import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Test20210311ValidString {
    public static void main(String[] args) {
        isValidString("{[]()()[()]}");
    }

    /**
     * 判断有效括号
     * 条件1-小括号跟反小括号
     * 条件2-中括号跟反中括号
     * 条件3-大括号跟反大括号
     * 条件4-{[]()()[()]}
     * 思路：给所有括号编号{--1  }--2 [--3  ]--4  (--5  )--6
     * 从第1个字符开始判断，如果value=1，则判断第2个字符value=2，如果第2个value!=2，则从第3个字符开始判断
     * 如果第3个字符value=3，那么判断第4个value=4，如果第4个value=4，则把3和4剪切掉，在从头判断
     * 当最后s=""则返回true，否则返回false
     * @param s
     */
    public static boolean isValidString(String s) {
        int a=s.length();
        int b=0;
        boolean bl=false;
        while (b<a){
            if (s.contains("()")) {
                s=s.replace("()","");
            }
            if (s.contains("[]")) {
                s=s.replace("[]","");
            }
            if (s.contains("{}")) {
                s=s.replace("{}","");
            }
            if (s.equals("")) {
                bl=true;
                break;
            }
            b++;
        }
        return bl;
    }

    public static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

}
