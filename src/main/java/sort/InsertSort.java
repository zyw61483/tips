package sort;

import utils.ArrayUtil;

import java.util.Arrays;

/**
 * InsertSort
 *
 * @author: zhaoyiwei
 * @date: 2020/4/20 11:52
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] r = ArrayUtil.getRandomArrayWithSeed(10, 1L);
        sort(r);
        System.out.println("Insert sort:" + Arrays.toString(r));
    }

    private static void sort(int[] r) {
        for (int i = 0; i < r.length; i++) {
            int x = r[i];
            for (int j = i - 1; j >= 0; j--) {
                if (r[j] > x) {
                    r[j+1] = r[j];
                    r[j] = x;
                }
            }
        }
    }
}
