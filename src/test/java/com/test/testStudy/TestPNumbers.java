package com.test.testStudy;

public class TestPNumbers {
    public static void main(String[] args) {
        doPNumbers();
    }



    public static void doPNumbers(){
        boolean flag=false;
        for (int i = 100; i <200 ; i++) {
            for (int j = 2; j <i ; j++) {
                if (i%j != 0) {
                    flag=true;
                }else{
                    flag=false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(i);
            }
        }
    }
}
