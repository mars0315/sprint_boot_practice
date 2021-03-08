package testDemo;

public class TestArray {
    public static void main(String[] args) {
        doTest2();
    }

    /**
     * 将一个数组逆序输出
     */
    public static void doTest() {
        int[] aInt=new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int i = aInt.length-1; i>=0  ; i--) {
            System.out.println(aInt[i]);
        }
    }

    public static void doTest2() {
        int[] aInt=new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] bInt=new int[aInt.length];
        int i,j;
        for (i = 0,j=bInt.length-1; i <aInt.length&&j>=0 ; i++,j--) {
            bInt[j]=aInt[i];
        }
        for (int a:bInt
             ) {
            System.out.println(a);
        }
    }
}
