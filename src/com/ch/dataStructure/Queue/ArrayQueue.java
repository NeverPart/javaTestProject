package com.ch.dataStructure.Queue;

import com.ch.dataStructure.Array.DynamicArray;

/**
 * @className: ArrayQueue
 * @Auther: ch
 * @Date: 2021/5/22 17:02
 * @Description: 队列
 */
public class ArrayQueue<E> implements Queue<E> {

    DynamicArray<E> array;

    public ArrayQueue() {
        array = new DynamicArray<>();
    }

    public ArrayQueue(int capacity) {
        array = new DynamicArray<>(capacity);
    }


    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Queue: [");
        for (int i = 0; i < array.getSize(); i++) {
            builder.append(array.get(i));
            if (i != array.getSize() - 1) {
                builder.append(", ");
            }
        }
        builder.append("] tail");
        return builder.toString();
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);

    }
}
