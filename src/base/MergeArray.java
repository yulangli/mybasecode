package base;

import java.util.Arrays;
import java.util.Random;

/**
 * 该类用于合并两个有序数组
 */
public class MergeArray {
    public static void main(String[] args) {
        int[] a = suiji();
        int[] b = suiji();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        Arrays.sort(a);
        Arrays.sort(b);
        int[] c = hebing(a,b);

      System.out.println(Arrays.toString(c));
    }

    private static int[] hebing(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0, j = 0, k = 0; i < c.length; i++) {
            if (j >= a.length) {
                c[i] = b[k];
                k++;
                continue;
            } else if (k >= b.length) {
                c[i] = a[j];
                j++;
                continue;
            }

            if (a[j] <= b[k]) {
                c[i] = a[j];
                j++;
            } else {
                c[i] = b[k];
                k++;
            }
        }
        return c;
    }

    private static int[] suiji() {
        int n = 5+ new Random().nextInt(100);
        int[] a =new int[n];
        for (int i=0; i<a.length;i++){
            a[i] = new Random().nextInt(1000);
        }
        return a ;
    }
}
