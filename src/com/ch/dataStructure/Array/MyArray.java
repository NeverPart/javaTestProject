package com.ch.dataStructure.Array;


/**
 * @className: MyArray
 * @Auther: ch
 * @Date: 2021/5/22 10:45
 * @Description: 泛型静态数组
 */
@SuppressWarnings(value = "METHOD")
public class MyArray<E> {
    private E[] data;
    // 数组内的元素个数
    private int size;

    // 无参构造函数,默认数据容量capacity为10
    public MyArray() {
        this(10);
    }

    // 构造函数,初始化数组容量capacity
    public MyArray(int capacity) {
        data = (E[])new Object[capacity];
        size = 0;
    }

    // 获取数组中元素个数
    public int getSize() {
        return size;
    }

    // 获取数组容量大小
    public int getCapacity() {
        return data.length;
    }

    // 判断数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 向index位置插入一个新的元素e
    public void add(int index, E e) {
        if (size == data.length) {
            throw new IllegalArgumentException("addLast Failed.Array is full.");
        }
        // 检测索引的合法性
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add Failed.Require index >=0 and index < size");
        }
        // 从数组末尾开始循环,将元素往后移动
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        // 将元素插入对应的位置中
        data[index] = e;
        size++;
    }
    // 在所有元素前添加一个元素
    public void addFirst(E e) {
        add(0, e);
    }
    // 向所有数组元素后添加一个元素
    public void addLast(E e) {
        add(size, e);
       /* if (size == data.length) {
            throw new IllegalArgumentException("addLast Failed.Array is full.");
        }
        data[size] = e;
        size++;*/
    }
    // 获取index索引位置的元素
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IllegalArgumentException("Get Failed. index is illegal");
        }
        return data[index];
    }

    // 修改数组index位置索引为e
    public void set(int index, E e) {
        if (index >= size || index < 0) {
            throw new IllegalArgumentException("Set Failed. index is illegal");
        }
        data[index] = e;
    }

    // 判断数组中是否包含元素e
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    // 查找数组中元素e的索引,如果不存在返回元素-1
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    // 删除数组中索引为index的元素,并且返回删除的元素
    public E remove(int index) {
        // 检测索引的合法性
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("remove Failed.Require index >=0 and index <= size");
        }
        E result = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        /*for (int i = size - 1; i >= index; i--) {
            data[i-1] = data[i];
        }*/
        size--;
        return result;
    }

    // 从数组中删除第一个元素,返回删除的元素
    public E removeFirst() {
        return remove(0);
    }

    // 从数组中删除最后一个元素,返回删除的元素
    public E removeLast() {
        return remove(size - 1);
    }

    // 从数组中删除某个元素e,如果有就删除
    public void removeElement(E e) {
        int index = find(e);
        if (index !=-1){
            remove(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Array: size = %d,capacity = %d\n", size, data.length));
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i]);
            if (i != size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        MyArray<Integer> arr = new MyArray<>(20);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);
        System.out.println(arr.find(1));
        arr.add(0,-1);
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
    }
}
