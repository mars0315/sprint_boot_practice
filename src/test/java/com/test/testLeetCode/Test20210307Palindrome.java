package testDemo;

public class Test20210307Palindrome {
    public static void main(String[] args) {
        boolean bl=testPalindrome(1221);
        System.out.println(bl);
    }

    /**
     * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
     * @param x
     */
    public static boolean testPalindrome(int x) {
        //首先读取数x，将x转为字符串
        String str1=String.valueOf(x);
        //将字符串反转
        StringBuffer sb=new StringBuffer(str1);
        String str2=sb.reverse().toString();
        //否则返回false
        if (!str1.equals(str2)) {
            return false;
        }
        //如果x和反转后的数相等则返回true
        return true;
    }
}
