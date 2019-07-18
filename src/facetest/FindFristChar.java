package facetest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定一个字符串（不一定全是字母）A及它的长度n,
 * 请返回第一个重复出现的字符。保证字符串中有重复的字符串
 * 字符串的长度小于等于1000.
 */
public class FindFristChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        int index = str.length(); //将其初始值定为字符串的长度
        //开辟两个数组
        int[] num = new int[256];
        int[] indexs = new int[256];
        Arrays.fill(indexs, -1); //将数组的indexs全部置为-1
        // 遍历字符串，构造两个数组
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int loc = ch;
            num[loc]++;
            if (indexs[loc] == -1) {
                indexs[loc] = i;
            }
        }
        // 遍历数组，得到最终索引
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 1 && indexs[i] < index) {
                index = indexs[i];
            }

        }
        System.out.println(index);
    }
}