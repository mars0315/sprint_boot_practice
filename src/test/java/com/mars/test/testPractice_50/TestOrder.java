package com.mars.test.testPractice_50;

//import org.jetbrains.annotations.NotNull;

import java.util.*;

public class TestOrder {
    public static void main(String[] args) {
        List list=doOrder();
        System.out.println(list);
    }

    public static List doOrder() {
        //统计个数
        int count=0;
        //不相同且无序
        List list=new ArrayList();
        //第一位可以放任意4个数
        for (int i = 1; i <=4 ; i++) {
            //第二位可以放任意4个数
            for (int j = 1; j <=4 ; j++) {
                //第三位可以放任意4个数
                for (int k = 1; k <=4 ; k++) {
                        //如果4个数不相等
                        if (i !=j&&i!=k&&j!=k) {
                            list.add(i*100+j*10+k);
                            count++;

                    }
                }
            }
        }
        System.out.println(count);
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return (Integer)o1;
            }
        });

        return list;
    }

    public static Set doOrder2() {
        //统计个数
        int count=0;
        //不相同且无序
        Set set=new HashSet();
        //第一位可以放任意4个数
        for (int i = 1; i <=4 ; i++) {
        //第二位可以放任意4个数
            for (int j = 1; j <=4 ; j++) {
                //第三位可以放任意4个数
                for (int k = 1; k <=4 ; k++) {
                    //第四位可以放任意4个数
                    for (int l = 1; l <=4 ; l++) {
                        //如果4个数不相等
                        if (i !=j&&i!=k&&i!=l&&j!=k&&j!=l&&k!=l) {
                            set.add(i*1000+j*100+k*10+l);
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
        return set;
    }

}
