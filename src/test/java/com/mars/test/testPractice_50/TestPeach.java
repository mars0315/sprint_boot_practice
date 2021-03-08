package com.example.mars.demo;

public class TestPeach {
    public static void main(String[] args) {
        doTest();
        doTest2();
    }

    /**
     * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 第二天早上又将剩下的桃子吃掉一半，又多吃了
     * 一个。以后每天早上都吃了前一天剩下 的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
     * 第一天摘了X个桃子
     * 吃了一半多一个X/2-1
     * 第二天吃了(X/2-1)/2-1
     * 第三天吃了(（X/2-1)/2-1)-1
     * 第10天X=1
     * 反向思考：
     * 第10天是第一天是1个桃子
     * 第9天是第二天是（y+1）*2
     */
    public static void doTest() {
        int sum=1;
        for (int i = 2; i <=10 ; i++) {
            sum=(sum+1)*2;
            if (i == 10) {
                System.out.println(sum);
            }
        }
    }

    public static void doTest2() {
        int total = 1;
        //day = 1的时候，算出来的total其实是第9天有的桃子
        //day = 9的时候，算出来的total就是第1天的桃子
        for(int day = 1; day < 10; day++){
            total = 2 * (total + 1);
        }
        System.out.println("一开始共有 " + total + " 桃子");
    }

}
