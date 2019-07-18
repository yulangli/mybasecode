package base;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 二分法查找算法
 */
public class TestBinarySearch {
    public static void main(String[] args) {
        int[] array = suiji();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("请输入要查询的数据");
        int i = new Scanner(System.in).nextInt();
        int a = doBinarySearchIndexByNum(array,i);
        System.out.println(array[a]);
    }

    private static int doBinarySearchIndexByNum(int[] array,int value) {
        for (int i = 0; i < array.length; i++) {
            int low = 0;
            int high = array.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (array[mid] == value) {
                    return mid;
                }
                if (value < array[mid]) {
                    high = mid - 1;
                }
                if (value > array[mid]) {
                    low = mid + 1;
                }

            }
        }
        return -1;
    }

    private static int[] suiji() {
        int[] array = new int[new Random().nextInt(100)];
        for(int i=0;i<array.length;i++){
            array[i] = new Random().nextInt(100000000);
        }
        return array;
    }
}
