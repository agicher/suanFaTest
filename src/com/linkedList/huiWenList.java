package com.linkedList;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;

public class huiWenList {
   //将值赋值到数组中  双指针遍历
   public boolean isPalindrome(ListNode head){
       ArrayList<Integer> arrayList = new ArrayList<>();

       ListNode currentHead = head;
       while (currentHead!= null){
           arrayList.add(currentHead.val);
           currentHead = currentHead.next;
       }

       int i = 0;
       int j = arrayList.size() - 1;
        while (i<j){
            if (arrayList.get(i++) != arrayList.get(j--))return false;
        }
        return true;
   }

   //找出 后半部分的头结点  ： 快慢指针
    // 利用反转链表
    // 判断是否相等

    public boolean isPalindrome2(ListNode head){
       if (head == null)return true;

       ListNode firstHalfEnd =endOfFistHalf(head);
       ListNode secondHald = reverse_List(firstHalfEnd.next);

       while (secondHald!=null){
           if (secondHald.val != head.val)return false;
       }
       return true;
    }

    private ListNode reverse_List(ListNode head) {
        ListNode cur = null;
        ListNode pre = head;

        while (pre!= null){
            ListNode tmp = pre.next;
            pre.next = cur;
            cur = pre;
            pre = tmp;
        }
        return cur;
    }

    private ListNode endOfFistHalf(ListNode head) {
       if (head == null || head.next == null)return head;
       ListNode slow = head;
       ListNode fast = head.next;

       while (fast!=null || fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
       }
       return slow;
    }


}
