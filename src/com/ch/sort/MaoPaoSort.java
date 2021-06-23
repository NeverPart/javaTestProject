package com.ch.sort;

import java.util.Arrays;

/**
 * @className: MaoPaoSort
 * @Auther: ch
 * @Date: 2021/6/15 19:02
 * @Description: 冒泡排序
 */
public class MaoPaoSort {
    public static void sort(int[] arr) {
        int temp;
        // 控制多少轮
        for (int i = 0; i < arr.length; i++) {
            // 控制每一轮的次数
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 7, 8, 6, 20, 9};
        sort(arr);
    }
}
