package com.test.testLeetCode;

public class Test20210329PlusOne {

    public static void main(String[] args) {
        int[] ints=plusOne1(new int[]{1,2,9});
        for (int a:ints
             ) {
            System.out.println(a);
        }
    }

    public static int[] plusOne1(int[] digits) {
        for (int i = digits.length-1; i >=0 ; i--) {
            digits[i]+=1;
            digits[i]=digits[i]%10;
            if (digits[i] == 0) {
                continue;
            }
            if (i ==0) {
                digits=new int[digits.length+1];
                digits[0]=1;
                return digits;
            }
            break;
        }
        return digits;
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i] == 9) {
                digits[i]=0;
                if (i ==0) {
                    digits=new int[digits.length+1];
                    digits[0]=1;
                    return digits;
                }
                continue;
            }else {
                digits[i]+=1;
                break;
            }
        }
        return digits;
    }

    public static int[] plusOn1e(int[] digits) {
        if (digits.length == 0) {
            return new int[0];
        }
        Long a=0L;
        for (int i = digits.length-1; i >=0 ; i--) {
            Long b=new Double(Math.pow(10,(digits.length-1-i))).longValue();
            a+=digits[i]*b;
        }
        a=a+1;
        String strs=a+"";
        int[] ints=new int[strs.length()];
        for (int i = 0; i <strs.length() ; i++) {
            ints[i]=Integer.parseInt(strs.charAt(i)+"");
        }
        return ints;
    }
}
