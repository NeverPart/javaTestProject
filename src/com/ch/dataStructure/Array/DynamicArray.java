package com.ch.dataStructure.Array;

/**
 * @className: DynamicArray
 * @Auther: ch
 * @Date: 2021/5/22 14:05
 * @Description: 泛型动态数组
 */
@SuppressWarnings(value = "METHOD")
public class DynamicArray<E> {
    private E[] data;
    // 数组内的元素个数
    private int size;

    // 无参构造函数,默认数据容量capacity为10
    public DynamicArray() {
        this(10);
    }

    // 构造函数,初始化数组容量capacity
    public DynamicArray(int capacity) {
        data = (E[]) new Object[capacity];
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
        // 检测索引的合法性
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add Failed.Require index >=0 and index < size");
        }
        if (size == data.length) {
            //throw new IllegalArgumentException("addLast Failed.Array is full.");
            resize(2 * data.length);
        }
        // 从数组末尾开始循环,将元素往后移动
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        // 将元素插入对应的位置中
        data[index] = e;
        size++;
    }

    // 当数组满了后,数组扩容
    private void resize(int newCapacity) {
        E[] newArray = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = data[i];
        }
        data = newArray;
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

    // 返回数组中的最后一个元素
    public E getLast() {
        return data[size - 1];
    }

    // 返回数组第一个元素
    public E getFirst() {
        return data[0];
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
        size--;
        data[size] = null;
        // 数组空间不能等于0
        if (size == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }
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
        if (index != -1) {
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
        DynamicArray<Integer> arr = new DynamicArray<>();
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);
        arr.add(0, -1);
        System.out.println(arr);
        arr.add(0, -2);
        System.out.println(arr);
        arr.remove(0);
        arr.remove(0);
        arr.remove(0);
        System.out.println(arr);
    }


}
