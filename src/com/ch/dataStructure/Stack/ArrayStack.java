package com.ch.dataStructure.Stack;

import com.ch.dataStructure.Array.DynamicArray;
import com.ch.dataStructure.Array.MyArray;

/**
 * @className: ArrayStack
 * @Auther: ch
 * @Date: 2021/5/22 15:34
 * @Description: TODO
 */
public class ArrayStack<E> implements Stack<E> {

    private DynamicArray<E> array;

    public ArrayStack() {
        array = new DynamicArray<>();
    }

    public ArrayStack(int capacity) {
        array = new DynamicArray<>(capacity);
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stack:");
        stringBuilder.append("[");
        for (int i = 0; i < array.getSize(); i++) {
            stringBuilder.append(array.get(i));
            if (i != array.getSize() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("] top");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<>(5);
        for (int i = 0; i < 9; i++) {
            arrayStack.push(i);
        }
        System.out.println(arrayStack);
        arrayStack.pop();
        System.out.println(arrayStack);
    }
}
