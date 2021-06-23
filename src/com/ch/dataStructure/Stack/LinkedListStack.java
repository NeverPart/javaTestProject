package com.ch.dataStructure.Stack;

import com.ch.dataStructure.LinkedList.LinkedList;

/**
 * @className: LinkedListStack
 * @Auther: ch
 * @Date: 2021/5/23 14:00
 * @Description: 链表栈
 */
public class LinkedListStack<E> implements Stack<E>{
    private LinkedList<E> linkedList;

    public LinkedListStack(){
        linkedList = new LinkedList<>();
    }
    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public void push(E e) {
        linkedList.addFirst(e);
    }

    @Override
    public E pop() {
        return linkedList.removeFirst();
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("LinkedListStack: top ");
        res.append(linkedList);
        return res.toString();
    }

    public static void main(String[] args) {
        LinkedListStack<Integer> linkedListStack  = new LinkedListStack();
        for (int i = 0; i < 5; i++) {
            linkedListStack.push(i);
        }
        System.out.println(linkedListStack);
        linkedListStack.pop();
        linkedListStack.pop();
        System.out.println(linkedListStack);
    }
}
