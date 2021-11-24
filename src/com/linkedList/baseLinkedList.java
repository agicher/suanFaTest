package com.linkedList;

import com.common.Node;

/**
 * 头插法
 * 尾插法
 * 删除
 * 查找
 */
public class baseLinkedList {
    private Node head = null;

    public  void insetFromHead(Node n){
        if (head ==null) head = n;
        else {
            n.next = head;
            head = n;
        }
    }

    public void insertFromTail(Node node){
        if (head == null) head = node;
        else {
            Node point = head;
            while (point!= null) point = point.next;
            node.next = point.next;
            point.next = node;
        }
    }

    public void deleteByNode(Node node){
        if (node == null || head == null)return;
        if (node == head) head = head.next;

        Node pointer = head;
        while (pointer!= null && pointer.next != null) pointer = pointer.next;
        pointer.next = pointer.next.next;
    }
}
