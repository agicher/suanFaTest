package com.linkedList;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.net.DatagramSocket;
import java.util.Scanner;

/**
 * 维护一个有序单链表，越靠近链表尾部的结点是越早之前访问的。
 * 当有一个新的数据被访问时，我们从链表头开始顺序遍历链表。
 * 1. 如果此数据之前已经被缓存在链表中了，我们遍历得到这个数据对应的结点，
 *                      并将其从原来的位置删除，然后再插入到链表的头部。
 *
 * 2. 如果此数据没有在缓存链表中，又可以分为两种情况：
 * 如果此时缓存未满，则将此结点直接插入到链表的头部；
 * 如果此时缓存已满，则链表尾结点删除，将新的数据结点插入链表的头部。
 *
 */
public class LRU<T> {
    private final static Integer  DEFAULT = 10;
    private SNode headNode;
    private Integer length;
    private Integer capacity;
    public LRU(){
        this.headNode = new SNode();
        this.length = 0;
        this.capacity = DEFAULT;
    }
    public LRU(Integer capacity){
        this.capacity = capacity;
        this.length = 0;
        this.headNode = new SNode();
    }

    public void add(T data){
        //查找之前是否缓存过
        SNode preNode = findPreNode(data);
        //有  删除 添加到队头
        if (preNode != null){
            deletePreNode(preNode);
            insertElementAtBegin(data);
        }else{
         //没有 判断对列是否满
            if (capacity > length) insertElementAtBegin(data);
            else {
                deleteTailData();
                insertElementAtBegin(data);
            }
        }

    }

    private void deletePreNode(SNode preNode) {
        preNode.next = preNode.next.next;
        length--;
    }

    private void deleteTailData() {
        SNode pointer = headNode;
        if (pointer.next == null)return;

        while (headNode.next.next != null){
            pointer = pointer.next;
        }
        pointer.next = null;

        length--;
    }

    private void insertElementAtBegin(T data) {
        SNode next = headNode.getNext();
        headNode.next = new SNode(data,next);
        length++;
    }

    /**
     * 查到前一个元素
     * @param data
     * @return
     */
    private SNode findPreNode(T data) {
        SNode pointer = headNode;
        while (pointer.next!= null){
            if (pointer.next.getElement().equals(data))return pointer;
            pointer = pointer.next;
        }
        return null;
    }


    public class SNode<T> {

        private T element;

        private SNode next;

        public SNode(T element) {
            this.element = element;
        }

        public SNode(T element, SNode next) {
            this.element = element;
            this.next = next;
        }

        public SNode() {
            this.next = null;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public SNode getNext() {
            return next;
        }

        public void setNext(SNode next) {
            this.next = next;
        }
    }

    private void printAll() {
        SNode node = headNode.getNext();
        while (node != null) {
            System.out.print(node.getElement() + ",");
            node = node.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LRU<Integer> list = new LRU<>();

        Scanner scanner = new Scanner(System.in);

        while (true){
            list.add(scanner.nextInt());
            list.printAll();
        }
    }
}
