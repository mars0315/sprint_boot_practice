package testDemo;

public class TestInts {
    public static void main(String[] args) {
        int[] a=doTest(new int[]{1,2,3,4,5,6,7,8,9,10},3);
        for (int b:a
             ) {
            System.out.println(b);
        }
    }

    /**有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
     *
     */
    public static int[] doTest(int[] ints,int a) {
        for (int i = 0; i <a ; i++) {
                int tmp=ints[ints.length-1];
            for (int j = ints.length-2; j >=0 ; j--) {
                ints[j+1]=ints[j];
            }
                ints[0]=tmp;
        }
        return ints;
    }
}
