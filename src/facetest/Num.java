package facetest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**输入一个大于10的正整数n，从其中删除一个数字，使得剩下的数最大。
 * 例如，输入9187，应该删除1，剩下的987
 *
 */
public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于10的整数：");
        Integer num = sc.nextInt();
        num =getnum(num);
        System.out.println(num);
        sc.close();
    }

    private static int getnum(int num) {
        //将整数num转换为数组
        String s = String.valueOf(num);
        Integer[] ints = new Integer[s.length()];
        for (int i = 0;i<s.length();i++){
            String value = String.valueOf(s.charAt(i));
            ints[i]=Integer.parseInt(value);
        }
        //得到数组中最小值
        List<Integer> ints1 = Arrays.asList(ints);
        Integer min = Collections.min(ints1);
        //新建数组存放缺少最小值得数组
        int[] newarr = new int[ints.length - 1];
        int index = 0;

        for (int j=0;j<ints.length;j++){
            if(min != ints[j]){
               newarr[index]=ints[j];
                index++;
            }

        }
        //将数组转换为整数
        Integer i = parseInt(newarr);
        return i;
    }
    //该方法将数组中每个值相加得出总数
    private static Integer parseInt(int[] newarr) {
        int length = newarr.length;
        int sum = 0;
        for (int i =0;i<length;i++){
            int number =newarr[i];
            sum += calculateWeightNum(number, length - (i + 1)) ;


        }
        return sum;
    }
    //该方法位数和数组中值计算出结果
    private static int calculateWeightNum(int number, int i) {
        int result=number;
        for (int j =0;i>0&&j<i;j++){
            result = result*10;
        }
        return result;

    }
}
