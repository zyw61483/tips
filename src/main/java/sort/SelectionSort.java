package sort;

import utils.ArrayUtil;

import java.util.Arrays;

/**
 * SelectionSort
 *
 * @author: zhaoyiwei
 * @date: 2020/4/20 11:00
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] r = ArrayUtil.getRandomArrayWithSeed(10, 1L);
        sort(r);
        System.out.println("SelectionSort sort:" + Arrays.toString(r));
    }

    public static void sort(int[] array) {
        // 放置数据的标识
        int flag = 0;
        // 遍历排序
        for (int i = 0; i < array.length - 1; i++) {
            // 找出最小的数的索引
            int minIndex = i;
            for (int j = i; j < array.length - 1; j++) {
                if (array[minIndex] > array[j + 1]) {
                    minIndex = j + 1;
                }
            }
            // 把最小的数换到标识位
            int tmp = array[flag];
            array[flag] = array[minIndex];
            array[minIndex] = tmp;
            // 标识移动到下一位置
            flag++;
        }
    }
}

