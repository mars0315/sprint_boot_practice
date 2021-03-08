package testDemo;

public class TestString2 {
    public static void main(String[] args) {
        doTest(123456789);
    }

    /**
     * 取一个整数a从右边起的4-7位
     */
    public static void doTest(int a) {
        String str=a+"";
        System.out.println(str.length());
        str=str.substring(str.length()-7,str.length()-3);
        StringBuffer stringBuffer=new StringBuffer(str);
        String str2=stringBuffer.reverse().toString();
        System.out.println(str2);

    }
}
