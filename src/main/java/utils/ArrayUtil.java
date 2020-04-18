package utils;

import java.util.Arrays;
import java.util.Random;

/**
 * ArrayUtil
 *
 * @author: zhaoyiwei
 * @date: 2020/4/17 14:48
 */
public class ArrayUtil {
    public static int[] getRandomArray(int length) {
        int[] result = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            result[i] = random.nextInt(100);
        }
        System.out.println("random array:" + Arrays.toString(result));
        return result;
    }

    public static int[] getRandomArrayWithSeed(int length, long seed) {
        int[] result = new int[length];
        Random random = new Random(seed);
        for (int i = 0; i < length; i++) {
            result[i] = random.nextInt(100);
        }
        System.out.println("random array:" + Arrays.toString(result));
        return result;
    }
}
