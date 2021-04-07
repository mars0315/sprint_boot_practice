package com.test.testLeetCode;

import com.test.testUtils.ListNode;

public class Test20210407DeleteDuplicates {
    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode head){
        if (head==null) {
            return head;
        }
        ListNode cur=head;
        while (cur.next!=null){
            if (cur.val == cur.next.val) {
                cur.next.val=cur.next.next.val;
            }else {
                cur=cur.next;
            }
        }
        return head;
    }
}
