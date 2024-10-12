package SortingAlgo;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,2,5,1,4};
        cyclicSort(arr);
    }

    //cyclic sort is used when range is given from 0 to n or 1 to n
    static void cyclicSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            while(arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
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
