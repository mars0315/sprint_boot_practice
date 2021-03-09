package testDemo;

public class TestNumbers {
    public static void main(String[] args) {
        doTest();
    }

    /**
     * 809??=800??+9??+1,其中??代表的两位数,8??的结果为两位数，9??的结果为3位数。求??代表的两位数，及809??后的结果
     */
    public static void doTest() {
        for (int i = 10; i <100 ; i++) {
            if (809*i == 800*i+9*i&&8*i>10&&8*i<100&&9*i>99) {
                System.out.println(i);
                System.out.println(809*i);
            }
        }
    }
}
