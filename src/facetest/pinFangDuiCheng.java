package facetest;

public class pinFangDuiCheng {
    /*
        输出0~256中，左右对称的整数  ，如11*11=121；
     */
    public static void main(String[] args) {
        int n = 256;
        int num ,m ,temp;//定义平方和变量，和尾数变量，交换变量
        for (int i=1;i<256;i++){
            m=0;
            num=i*i;
            while (num>0){
                temp=num%10;//取最小平方尾数
                m = temp + m*10;//一一对应位数
                num=num/10;
            }
            if(m==i*i){
                System.out.println(i);
            }

        }
    }
}
