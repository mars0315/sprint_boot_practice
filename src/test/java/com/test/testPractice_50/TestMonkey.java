package testDemo;

public class TestMonkey {
    public static void main(String[] args) {
        for (int x = 10; x <10000 ; x++) {
            if (doTest(x,0) == 111) {
                System.out.println(x);
            }
        }
//        int i, m, j = 0, k, count;
//        for (i = 4; i < 10000; i += 4)   {
//            count = 0;
//            m = i;
//            for (k = 0; k < 5; k++)        {
//
//                j = i / 4 * 5 + 1;
//                i = j;
//                if (j % 4 == 0)            count++;
//                else break;
//            }
//            i = m;
//            if (count == 4) {
//                System.out.println("原有桃子 " + j + " 个");
//                break;
//            }
//        }
    }

    public static int doTest(int a,int b) {
        if ((a-1)%5==0) {
            b++;
            int sum=(a-1)/5*4;
            if (b == 5) {
                return 111;
            }
            return doTest(sum,b);
        }
        return 0;
    }

}
