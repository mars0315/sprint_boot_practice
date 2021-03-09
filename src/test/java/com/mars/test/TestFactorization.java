package testDemo;

import java.util.ArrayList;
import java.util.List;

public class TestFactorization {

    public static List<Integer> list=new ArrayList<Integer>();

    public static void main(String[] args) {
        System.out.println(testF(150));
    }

        public static List<Integer> testF(int bInt){
            //例：10进入循环,循环为2-这个数-1
            //如果10%i==0,这个数=10/i
            for (int i = 2; i <=bInt ; i++) {
                if (bInt%i == 0) {
                    list.add(i);
                    testF(bInt/i);
                    break;
                }
            }
            return list;
    }

}
