import java.util.Arrays;
import java.util.Random;

/**
 * QuickSort
 *
 * @author: zhaoyiwei
 * @date: 2020/1/15 11:40
 */
public class QuickSort {
    public static void main(String[] args) {
        int length = 10;
        int r[] = getRandomArray(length);
        quickSort(0, r.length - 1, r);
        System.out.println("sort array:" + Arrays.toString(r));
    }

    private static void quickSort(Integer left, Integer right, int[] r) {
        if (left >= right)
            return;
        int swap = swap(left, right, r);
        quickSort(left, swap - 1, r);
        quickSort(swap + 1, right, r);
    }

    private static int swap(Integer left, Integer right, int[] r) {
        int temp = r[left];
        while (left < right) {
            while (left < right && temp <= r[right]) {
                right--;
            }
            r[left] = r[right];
            while (left < right && r[left] <= temp) {
                left++;
            }
            r[right] = r[left];
        }
        r[right] = temp;
        return right;
    }

    private static int[] getRandomArray(int length) {
        int[] result = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            result[i] = random.nextInt(100);
        }
        System.out.println("random array:" + Arrays.toString(result));
        return result;
    }
}
