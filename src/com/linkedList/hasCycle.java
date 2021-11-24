package com.linkedList;

import sun.misc.Launcher;

import java.util.HashSet;

//给定一个链表，判断链表中是否有环。
public class hasCycle {
    //快慢指针
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast){
            if (fast == null || fast.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    //哈希表
    public boolean hasCycle2(ListNode head){
        HashSet<ListNode> listNodes = new HashSet<>();

        while (head!=null){
            if (!listNodes.add(head))return true;
            head= head.next;
        }
        return false;
    }

//找出 相遇节点
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head, fast = head, pos = head;


        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow){
                while (slow!=pos){
                    slow = slow.next;
                    pos = pos.next;
                }
                return pos;
            }
        }
        return null;
    }
    public ListNode detectCycle2(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;

    }


}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}