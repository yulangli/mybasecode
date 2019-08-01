package base;

import java.util.Scanner;
/*
    递归求和1+2+3+4+5.....+n;
 */

public class qiuSum {
    public static void main(String[] args) {
        //求一到n的和
        System.out.println("输入整数n");
        int i = new Scanner(System.in).nextInt();
        int sum = sum(i);
        System.out.println(sum);
    }

    private static int sum(int i) {
        int sum;
        if(i==0){
            return 0;
        }
        int sum1 = sum(i - 1);
        sum =i+sum1;
        return sum;

    }
}
