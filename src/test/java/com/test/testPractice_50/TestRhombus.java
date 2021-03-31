package testDemo;

public class TestRhombus {
    public static void main(String[] args) {
        doTest(3);
    }


    /**
     * 打印出菱形
     * 思路：输入一个行数5
     * 第一行打印1颗*；第二行3颗*，第三行5颗*，第四行7颗*，第五行9颗*，第六行7颗*，第7行5颗*，第8行3颗*，第9行1颗*
     * 行数和颗数都是2n-1
     * 参数是*和空格
     * 行数一个循环，颗数一个循环
     * 第一行打印在第5上，第二行打印在5-1，5，5+1上，第三行打印在5-2，5-1，5，5+1，5+2上
     */
    public static void doTest(int a) {
       String str="a";
       String str2="b";
       String str3="\r";
//        for (int i = 1; i <=a; i++) {
//            for (int j = a-i; j>0; j--) {
//                System.out.print(str2);
//            }
//            for (int j = 1; j <=2*i-1 ;j++ ) {
//                System.out.print(str);
//            }
//            System.out.println(str3);
//        }

        for (int i = 1; i <a; i++) {
            for (int j = 1; j <=2*i-1 ;j++ ) {
                System.out.print(str);
            }
            for (int j = a-2*i+1; j>0; j--) {
                System.out.print(str2);
            }
            System.out.println(str3);
        }

//        for (int i = 1; i <a ; i++) {
//            for (int j = a-i; j <a ; j++) {
//                System.out.print(str2);
//            }
//            for (int j = 1; j <2*(a-i) ; j++) {
//                System.out.print(str);
//            }
//            System.out.print(str3);
//        }
    }
}
