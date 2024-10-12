package SortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={9,56,7,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    //selection sort
    static void selectionSort(int[] arr){
        int l=arr.length;
        for(int i=0;i<l;i++){
            int lastIndex=l-i-1;
            // int maxIndex=0;
            int max=getmaxIndex(arr,0,lastIndex);
            swap(arr,max,lastIndex);
        }
    }


    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index2];
        arr[index2]=arr[index1];
        arr[index1]=temp;
    }


    static int getmaxIndex(int[] arr,int start,int last){
        int max=0;
        for(int i=0;i<=last;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    
}
