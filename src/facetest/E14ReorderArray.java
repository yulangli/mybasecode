package facetest;

/**
 * 面试题之调整一个数组的循序，使能被三整除的数排在不能被三整除的前面
 */
public class E14ReorderArray {
    public void order(int[] arr){
        if(arr == null)
            return;
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            //如果前面的数不能被3整除，后面能，则交换位置
            if(isEven(arr[i]) && !isEven(arr[j])){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }
            //如果前面能被3整除，后面不能，位置不变，换下一位
            else if(!isEven(arr[i]) && isEven(arr[j])){
                i++;
            }
            //如果都不能，则长度减1
            else if(isEven(arr[i]) && isEven(arr[j])){
                j--;
            }else{
                i++;
                j--;
            }
        }
    }
    public boolean isEven(int n){
        return (n % 3) != 0;
    }
    public static void main(String[] args){
        E14ReorderArray test = new E14ReorderArray();
        int[] arr= {1,2,3,4,5,6,12,7,8,9,10};
        test.order(arr);
        for(int i = 0;i<arr.length ;i++){
            System.out.print(arr[i]+",");
        }
    }


}
