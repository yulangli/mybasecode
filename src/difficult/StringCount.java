package difficult;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 写出一段程序，要求根据用户输入的字符串string的信息
 * 如String str = "abcabcdabcddd" 统计出a=3,b=3,c=3,d=5,
 * 的对应次数
 */
public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串：");

        String line = sc.nextLine();
        Map<String,Integer> map = new HashMap<>();

        for (int i=0;i<line.length();i++){
            char c = line.charAt(i);
            String key = String.valueOf(c);

            if(map.containsKey(key)){
                Integer value = map.get(key);
                map.put(key, value+1);

            }else {
                if(c>'A'&&c<'Z'||c>='a'&&c<='z'){
                    map.put(key, 1);
                }
            }
        }
        System.out.println(map);
        sc.close();
    }

}
