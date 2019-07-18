package facetest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 该类用于判断一个数组是否等差
 */
public class moveToArithmeticSequence {
    public static void main(String[] args) {
            /*
                Sn = n * a1 +((n*(n-1))/2)*d
             */
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int seq[]= new int[n];
        for(int i=0;i<n;i++)
        {
            seq[i]=sc.nextInt();
        }

        if(isArithmeticSequence(seq,n))
            System.out.println("Possible");
        else
            System.out.println("Impossible");


    }
    //根据等差公式判断
    private static boolean isArithmeticSequence(int[] seq, int n) {

        // TODO Auto-generated method stub
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            sum+=seq[i];
            min=Math.min(min, seq[i]);
        }
        if( (2*(sum-n*min)) % (n*(n-1))==0)
            return true;
        else
            return false;


    }
    //方法2 先排序，在遍历数组，看是否等差
    public static boolean isArithmeticSequence2(int[] seq, int n) {
        Arrays.sort(seq);
        int d=seq[1]-seq[0];
        for(int i=2;i<n;i++)
        {
            if(d!=seq[i]-seq[i-1])
                return false;
        }
        return true;
    }


}
