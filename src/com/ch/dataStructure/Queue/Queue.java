package com.ch.dataStructure.Queue;

/**
 * @className: Queue
 * @Auther: ch
 * @Date: 2021/5/22 16:58
 * @Description: 队列接口
 */
public interface Queue<E> {
    // 进队
    void enqueue(E e);

    // 出队
    E dequeue();

    // 获取对首元素
    E getFront();

    // 队元素大小
    int getSize();

    // 队是否为空
    boolean isEmpty();

}
