package com.ch.dataStructure.LinkedList;

import java.util.List;

/**
 * @className: Node
 * @Auther: ch
 * @Date: 2021/5/23 10:35
 * @Description: Node节点对象
 */
public class LinkedList<E> {
    private class Node {
        // 元素
        public E e;
        // 指向node的引用
        public Node next;

        public Node() {
            this.e = null;
            this.next = null;
        }

        public Node(E e) {
            this.e = e;
            this.next = null;
        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList() {
        // 虚拟节点
        dummyHead = new Node(null, null);
        size = 0;
    }

    // 获取链表中的元素个数
    public int getSize() {
        return size;
    }

    // 返回链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 在链表的index(0-based)位置添加新的元素e
    // 在链表中不是一个常用的操作,练习用
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed.Illegal index.");
        }
        /*if (index ==0){
            addFirst(e);
        }else{*/
        // 遍历获取到要插入元素的前一个元素节点Node
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        /*Node node = new Node(e);
        node.next = prev.next;
        prev.next = node;*/
        prev.next = new Node(e, prev.next);
        size++;
        /*}*/
    }

    // 在链表末尾添加新的元素e
    public void setLast(E e) {
        add(size, e);
    }

    // 在链表头添加新的元素e
    public void addFirst(E e) {
        add(0, e);
    }

    // 获得链表的第index(0-based)个位置的元素
    // 在链表中布局是一个常用的操作
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Add failed.Illegal index.");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    // 获得链表中的第一个元素
    public E getFirst() {
        return get(0);
    }

    // 获取链表中最后一个元素
    public E getLast() {
        return get(size - 1);
    }

    // 修改链表的第index(0-based)个位置的元素
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Add failed.Illegal index.");
        }
        Node cur = dummyHead;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    // 查找链表中是否有e
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    // 从链表中删除index位置的元素
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Add failed.Illegal index.");
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node delNode = prev.next;
        prev.next = delNode.next;
        delNode.next = null;
        size--;
        return delNode.e;
    }

    // 从链表中删除第一个元素,返回删除的元素
    public E removeFirst() {
        return remove(0);
    }

    // 从链表中删除最后一个元素
    public E removeLast() {
        return remove(size - 1);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
         /*Node cur = dummyHead.next;
        while (cur != null){
            res.append(cur+"->");
            cur = cur.next;
        }*/
        for (Node cur = dummyHead.next; cur != null; cur = cur.next) {
            res.append(cur + "->");
        }
        res.append("NULL");
        return res.toString();
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }
       /* linkedList.add(2, 2222);
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);*/
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
    }
}
