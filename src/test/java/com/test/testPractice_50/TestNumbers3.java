package com.example.mars.demo;

public class TestNumbers3 {
    public static void main(String[] args) {
        doTest();
        // int a=10000081;
        // String str=a+"";
        // int b=str.indexOf("8");
        // System.out.println(b);
    }

    public static void doTest() {
        int count=0;
        boolean flag=false;
        int num=0;
        for (int i = 10234561; i <100000000 ; i++) {
            if (i%2!=0) {
                if ((i+"").indexOf("8")==-1&&(i+"").indexOf("9")==-1) {
                    String str=i+"";
                    char[] chars=str.toCharArray();
                    for (int j = 0; j <chars.length-1 ; j++) {
                        for (int k = j+1; k <chars.length ; k++) {
                            if (chars[j] !=chars[k] ) {
                                    num++;
                            }
                        }
                        if (num == chars.length-j-1) {
                            flag=true;
                            num=0;
                        }else {
                            flag=false;
                            num=0;
                            break;
                        }
                    }
                    if (flag == true) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

}
