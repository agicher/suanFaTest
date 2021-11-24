package com.linkedList;

import com.common.Node;

import java.util.LinkedList;

//你单链表的头节点 head ，请你反转链表，并返回反转后的链表
public class reverseList {

    //两个指针
    public Node reverseList(Node head) {
         Node cur = null;
         Node pre = head;

         while (pre != null){
             Node tmp = pre.next;
             pre.next = cur;
             cur = pre;
             pre = tmp;
         }
         return cur;
    }

    public Node reverse2(Node head){
        if (head == null || head.next == null)return head;

        Node cur = reverse2(head.next);

        //当前节点的下一个节点指向自己  实现局部反转
        head.next.next = head;

        head.next = null;

        return cur;
    }

    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

    }


}
