package com.ch.dataStructure.Stack;

/**
 * @className: Stack
 * @Auther: ch
 * @Date: 2021/5/22 15:32
 * @Description: 栈接口
 */
public interface Stack<E> {
    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();
}
