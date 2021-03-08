package com.example.mars.demo;

public class TestTennis {
    public static void main(String[] args) {
        // doTest();
        doTest2();
    }

    /**
     * 题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。
     * a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
     * 共有6个人，a,b,c,x,y,z
     * a只能和xy比，c只和y比
     * 所以：c和y比，a和x比，b和z比
     */
    public static void doTest() {
        for (int a = 1; a <4 ; a++) {
            for (int b = 1; a <4 ; a++) {
                for (int c = 1; c <4 ; c++) {
                    for (int x = 1; x <4 ; x++) {
                        for (int y = 1; y <4 ; y++) {
                            for (int z = 1; z <4 ; z++) {
                                if (c == y&&a!=b&&a!=c&&b!=c&&x!=y&&x!=z&&y!=z&&(a==x||a==y)) {
                                    if (a == x) {
                                        System.out.println("a和x比");
                                        if (b == y) {
                                        System.out.println("b和y比");
                                        System.out.println("c和z比");
                                        }else {
                                        System.out.println("b和z比");
                                        System.out.println("c和y比");
                                        }
                                    }
                                    else if (a == y) {
                                        System.out.println("a和y比");
                                        if (b == z) {
                                            System.out.println("b和z比");
                                            System.out.println("c和x比");
                                        }else {
                                            System.out.println("b和x比");
                                            System.out.println("c和z比");
                                        }
                                    }
                                    else  {
                                        System.out.println("a和z比");
                                        if (b == x) {
                                            System.out.println("b和x比");
                                            System.out.println("c和y比");
                                        }else {
                                            System.out.println("b和y比");
                                            System.out.println("c和x比");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
     */
    public static void doTest2() {
        char a,b,c;
        for (a = 'x'; a <='z' ; a++) {
            for (b = 'x'; b <='z' ; b++) {
                for (c = 'x'; c <='z' ; c++) {
                    if (a != 'x'&&c!='x'&&c!='z'&&a!=b&&b!=c&&a!=c) {
                        System.out.println("a和"+a+"比赛");
                        System.out.println("b和"+b+"比赛");
                        System.out.println("c和"+c+"比赛");
                    }
                }
            }
        }
    }

}
