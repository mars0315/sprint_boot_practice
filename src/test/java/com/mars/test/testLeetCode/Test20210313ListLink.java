package com.mars.test.testLeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test20210313ListLink {
    public static void main(String[] args) {
        List l1=new ArrayList();
        List l2=new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(4);
        l2.add(1);
        l2.add(3);
        l2.add(4);
        mergeList(l1,l2);
    }

    public static void mergeList(List l1, List l2) {
        l1.addAll(l2);
        Collections.sort(l1);
    }
//
//     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//         if (l1 == null) {
//             return l2;
//         }else if (l2 == null) {
//             return l1;
//         }else if (l1.val<l2.val) {
//             l1.next=mergeTwoLists(l1.next,l2);
//             return l1;
//         }else {
//             l2.next=mergeTwoLists(l1,l2.next);
//             return l2;
//         }
//     }
// }
}
