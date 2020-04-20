package sort;

import utils.ArrayUtil;

import java.util.Arrays;

/**
 * 冒泡排序
 * BubbleSort
 *
 * @author: zhaoyiwei
 * @date: 2020/4/18 19:38
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] r = ArrayUtil.getRandomArrayWithSeed(10, 1L);
        sort(r);
        System.out.println("BubbleSort array:" + Arrays.toString(r));

    }

    public static void sort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(count);
    }
}
