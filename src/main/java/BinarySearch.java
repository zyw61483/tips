import sort.QuickSort;
import utils.ArrayUtil;

import java.util.Arrays;

/**
 * 二分查找 数据必须是有序的
 * BinarySearch
 *
 * @author: zhaoyiwei
 * @date: 2020/4/17 14:50
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] randomArray = ArrayUtil.getRandomArrayWithSeed(10, 17L);
        QuickSort.quickSort(0, randomArray.length - 1, randomArray);
        System.out.println("sort array:" + Arrays.toString(randomArray));
        System.out.println("index:" + binarySearch(96, 0, randomArray.length - 1, randomArray));
    }


    /**
     * @param value 目标值
     * @param low   最小索引
     * @param high  最大索引
     * @param array 数组
     * @return
     */
    public static int binarySearch(int value, int low, int high, int[] array) {
        // 没找到返回-1
        if (low > high) {
            return -1;
        }
        // 算出中间值的索引
        int mid = low + (high - low + 1) / 2;

        // 找到直接返回索引
        if (array[mid] == value) {
            return mid;
        }

        if (array[mid] < value) {
            // value比中间值大 从中间值右边一个起到最大值再查找
            return binarySearch(value, mid+1, high, array);
        } else {
            // value比中间值小 从最小值起到中间值左边一个再查找
            return binarySearch(value, low, mid-1, array);
        }
    }
}
