package SortingAlgo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={23,45,6,4,5};
        bubbleSort(arr);
    }

    static void bubbleSort(int [] arr){
        int len=arr.length;
        //for(int i=len-1;i>0;i--){
            for(int i=0;i<len-1;i++){
            int c=0;            
            for(int j=1;j<=len-i-1;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr,j,j-1);
                    c++;
                }
            }
            if(c==0){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index2];
        arr[index2]=arr[index1];
        arr[index1]=temp;
    }
    
}
