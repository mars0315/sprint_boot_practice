package testDemo;

public class TestNumber {
    public static void main(String[] args) {
//        doTest();
//        doTest2();
        System.out.println(Math.sqrt(324));
        System.out.println(Math.sqrt(256));
    }

    public static void doTest() {
        for (int i = 1; i <10000 ; i++) {
            double value1=Math.sqrt(i+100);
            double value2=Math.sqrt(i+168);
            if (value1*value1==i&&value2*value2 == i) {
                System.out.println(i);
            }
        }
    }

    public static void doTest2() {
        for (int i = 0; i <1000 ; i++) {
            for (int j = 0; j <1000 ; j++) {
                for (int k = 0; k <1000 ; k++) {
                    if (k*k==i+100&&j*j==i+168) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
