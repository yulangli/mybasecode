package base;

import java.util.Arrays;
import java.util.Random;

/**
 * 该类是一个简单的冒泡排序
 */
public class SortArray {

    public static void main(String[] args) {
        int[] a = ranmodArray();
        int[] c= paixun2(a);
        System.out.println(Arrays.toString(c));
    }

    private static int[] paixun2(int[] a) {
        for (int i=0;i<a.length;i++){
            for (int j=a.length-1;j>i;j--){
                if(a[i]>a[j]){
                    int t = a[j];
                    a[j] = a[i];
                    a[i] = t;

                }
            }
        }
        return a;
    }

    private static int[] paixun1(int[] a) {

        for (int i=0;i<a.length;i++){
            for (int j=i;j<a.length-1;j++){
                if(a[j+1]<a[i]){
                    int t =a[j+1];
                    a[j+1]=a[i];
                    a[i]=t;
                }
            }
        }
        return a;
    }

    private static int[] ranmodArray() {
        int[] a = new int[new Random().nextInt(100)];
        for (int i=0;i<a.length;i++){
            a[i] =new Random().nextInt(100);
        }
        return a;
    }
}
