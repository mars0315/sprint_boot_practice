package testDemo;

import java.util.*;

public class TestResolve {
    public static void main(String[] args) {
        List li=testList3(60,126);
//        List li=testList1(60,126);
//        List li2=testList2(60,126);
        System.out.println("li="+li.toString());
//        System.out.println("li="+li.toString());
//        System.out.println("li2="+li2.toString());
    }

    public static List testList3(int cInt,int dInt) {
        List alist=getSpecialNumber(cInt, new ArrayList());
        System.out.println("alist="+alist);
        List blist=getSpecialNumber(dInt, new ArrayList());
        System.out.println("blist="+blist);
        alist.removeAll(blist);
        System.out.println("first time="+alist);
        System.out.println("first time="+blist);
        return alist;
    }


    public static List testList1(int cInt,int dInt) {
        List alist=getSpecialNumber(cInt, new ArrayList());
        System.out.println("alist="+alist);
        List blist=getSpecialNumber(dInt, new ArrayList());
        System.out.println("blist="+blist);
        blist.retainAll(alist);
        System.out.println(blist);
        return blist;
    }

    public static List testList2(int eInt,int fInt) {
        List alist=getSpecialNumber(eInt, new ArrayList());
        List blist=getSpecialNumber(fInt, new ArrayList());
        blist.removeAll(alist);
        blist.addAll(alist);
        return blist;
    }

    public static List getSpecialNumber(int aInt,List list) {
        for (int i = 2; i <=aInt ; i++) {
            if (aInt%i == 0) {
                list.add(i);
                int bInt=aInt/i;
                return getSpecialNumber(bInt,list);
            }
        }
        return list;
    }
}
