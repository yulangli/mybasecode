package base;

import java.util.Scanner;

/**
 * 该类用于求斐波那契数
 * 1,1,2,3,5,8,13,26.....
 */

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("要求第几个fibonacciNumber");
        int n = sc.nextInt();
       int number =  getFibonacciNumber2(n);
       System.out.println(number);
    }

    private static int getFibonacciNumber1(int n) {
        int a = 1;//第一个FibonacciNumber
        int b = 1;//第二个FibonacciNumber
        for(int i =3;i<=n;i++){//从第三个FibonacciNumber开始
            b = a+b;
            a = b-a;

        }
        return b;
    }
    private static int getFibonacciNumber2(int n) {
        //斐波那契数最简问题
        if(n==1 || n==2) {
            return 1;
        }
        return getFibonacciNumber2(n-1) + getFibonacciNumber2(n-2);

    }
}
