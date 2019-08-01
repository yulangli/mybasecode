package difficult;

import java.util.Arrays;

/**
 * 数组去重
 */
public class ArrayTrim {
    public static void main(String[] args) {
        int[] array =new int[]{90,23,45,19,23,12,12,12};
        int[] arr = trim(array);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] trim(int[] arry) {
        int t = 0;
        int[] newary = new int[arry.length];

        for (int i = 0; i < arry.length; i++) {
            boolean isTrue = true;
            for (int j = i+1; j < arry.length; j++) {

                if(arry[i] == arry[j]){
                    isTrue = false;
                    break;
                }
            }

            if(isTrue){
                newary[t] = arry[i];
                t++;
            }

        }

        int[] newArry = new int[t];
        System.arraycopy(newary,0,newArry,0,t);
        return newArry;

    }
}
