package com.stack;

import java.util.LinkedList;

public class stack {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.addLast(10);
        Integer integer = stack.removeLast();
    }
}
