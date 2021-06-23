package com.ch.sort;

import java.util.Arrays;

/**
 * @className: selectSort
 * @Auther: ch
 * @Date: 2021/6/15 19:41
 * @Description: 选择排序
 */
public class SelectSort {
    public static int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            //把当前遍历的数和后面所有的数依次进行比较，并记录下最小的数的下标
            for (int j = i+1; j < arr.length; j++) {
                // 如果后面的元素比最小值元素小则替换最小值元素索引
                if (arr[j] < arr[min]) {
                    //记录最小的那个数的下标
                    min = j;
                }
            }
            //如果最小的数和当前遍历数的下标不一致，说明下标为min的数比当前遍历的数更小
            if (i!=min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 7, 8, 6, 20, 9};
        System.out.println(Arrays.toString(selectSort(arr)));
    }
}
