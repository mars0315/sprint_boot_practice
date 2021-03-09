package testDemo;

public class MeiHuaShu {
    public static void main(String[] args) {
        testNumber();
    }
    public static void testNumber(){
        int a,b,c;
        int count=0;
        for (int i = 100; i <1000 ; i++) {
            a=i/100;
            b=i/10%10;
            c=i%100%10;
//            System.out.println(a+"+"+b+"+"+c);
            if (a*a*a+b*b*b+c*c*c == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
