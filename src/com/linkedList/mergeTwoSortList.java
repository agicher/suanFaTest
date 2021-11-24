package com.linkedList;

import com.common.ListNode;
// 21
// 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
public class mergeTwoSortList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);

        ListNode pre = preHead;

        while (l1 != null && l2!=null){
            if (l1.val < l2.val){
                pre.next = l1;
                l1 = l1.next;
            }else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }



        pre.next = l1== null ? l2 : l1;

        return preHead.next;
    }

    public ListNode mergeTwoLists_re(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }

        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    public static void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;
        while (i<j){
            char tmp = s[i];
            s[j] = s[i];
            s[i] = tmp;
        }
    }
}
