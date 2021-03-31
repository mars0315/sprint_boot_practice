package testDemo;

public class FactorialTester {

    /**
     * 阶乘计算:5!
     * 5!=5*4!
     * 4!=4*3!
     * 3!=3*2!
     * 2!=2*1!
     * 1!=1*0!
     * 0!=1
     * @param t
     */
    public int factorial(int t){
        if (t==0){
            return 1;
        }else {
            t=t*factorial(t-1);
        }
        return t;
    }

    public int test(int t){
        while (t==0){
            return 1;
        }
        t=t*test(t-1);
        return t;
    }

    public static void main(String[] args) {
        FactorialTester factorialTester=new FactorialTester();
        System.out.println(factorialTester.test(4));
//        System.out.println(factorialTester.factorial(1));
//        System.out.println(factorialTester.factorial(2));
//        System.out.println(factorialTester.factorial(3));
//        System.out.println(factorialTester.factorial(4));
//        System.out.println(factorialTester.factorial(5));
//        System.out.println(factorialTester.factorial(6));
//        System.out.println(factorialTester.factorial(7));
    }
}
