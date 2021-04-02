package com.test.testLeetCode;

public class Test20210401MySqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt2(2147395600));
    }

    public static int mySqrt1(int x){
        if (x <0 ) {
            return 0;
        }
        Long i=46339L;
        while (i*i<=x){
            i++;
        }
        return new Long(i-1).intValue();
    }

    public static int mySqrt(int x){
        double de=Math.sqrt(x);
        int a=new Double(de).intValue();
        return a;
    }

    public static int mySqrt2(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

}
