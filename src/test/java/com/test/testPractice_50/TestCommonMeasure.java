package testDemo;

import java.util.*;

public class TestCommonMeasure {
    public static void main(String[] args) {
        List list=doTestMeasure(60,126);
        List list2=doTestMultiple(60,126);
        System.out.println("list1.collect="+list);
        System.out.println("list2.spread="+list2);
    }

    public static List doTestMeasure(int a,int b) {
        //求出1的所有约束
        List list1 = doResolve(a,new ArrayList());
        System.out.println("list1="+list1);
        //求出2的所有约束
        List list2 = doResolve(b,new ArrayList());
        System.out.println("list2="+list2);
        // 比较2个list找到相同的value,添加到list3找到A和B相同的约束相乘
        list2.retainAll(list1);
        return list2;
    }

    public static List doTestMultiple(int a,int b) {
        //求出1的所有约束
        List list1 = doResolve(a,new ArrayList());
        //求出2的所有约束
        List list2 = doResolve(b,new ArrayList());
        // 比较2个list找到相同的value,添加到list3找到A和B相同的约束相乘
        list2.removeAll(list1);
        list2.addAll(list1);
        return list2;
    }

    public static List doResolve(int aInt,List list){
        for (int i = 2; i <=aInt ; i++) {
            if (aInt%i == 0) {
                list.add(i);
                int rec=aInt/i;
                return doResolve(rec,list);
            }
        }
        return list;
    }


}
