package SortingAlgo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={9,56,7,3,2,1};
        insertionSort(arr);
        //System.out.println(Arrays.toString(arr));
    }
    
    
    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1 );
                }else{
                    break;
                }
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
