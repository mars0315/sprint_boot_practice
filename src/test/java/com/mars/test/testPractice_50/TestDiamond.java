package testDemo;

public class TestDiamond {
    public static void main(String[] args) {
        doTest(21);
    }

    public static void doTest(int a) {
        for (int i = 1; i <=(a+1)/2 ; i++) {
            for (int j = 1; j <=(a+1)/2-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
        for (int i = 1; i <(a+1)/2 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=a-2*i ; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
