package testDemo;

public class TestArray {
    public static void main(String[] args) {
        int[] a=doTest(new int[]{1,5,3,6,8,2,9,4,7});
        for (int b:a
             ) {
            System.out.println(b);
        }
    }

    /**
     * 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组
     * @param ints
     */
    public static int[] doTest(int[] ints) {
        int finalTmp;
        int tmp=0;
        int tab=0;
        for (int j = 0; j <ints.length-1 ; j++) {
                //如果这个数比后一个数小，用后一个数去比较，并记录下标，
                //比到最后的那个数和第一个数交换
                if (tmp <= ints[j]) {
                    tmp=ints[j];
                    tab=j;
                }
            }
        finalTmp=ints[0];
        ints[0]=tmp;
        ints[tab]=finalTmp;
        for (int i = 0; i <ints.length-1 ; i++) {
            if (tmp>=ints[i]) {
                tmp=ints[i];
                tab=i;
            }
        }
        finalTmp=ints[ints.length-1];
        ints[ints.length-1]=tmp;
        ints[tab]=finalTmp;
        return ints;
    }
}
