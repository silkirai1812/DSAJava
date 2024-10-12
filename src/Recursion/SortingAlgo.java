package Recursion;

import java.util.Arrays;

public class SortingAlgo {
    public static void main(String[] args) {
        int[] arr={1,2,7,5,9,3,4,6};
        // bubbleSort(arr,0,arr.length-1);
        //selectionSort(arr, 0, arr.length-1,0);
        insertionSort(arr,1,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr,int i,int j){
        if(j==0){
            return;
        }
        if(i<=j){
            if(arr[i]<arr[i-1]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
            insertionSort(arr, i+1, j);
            
        }
        else{
            insertionSort(arr, 1, j-1);
        }
    }

    static void selectionSort(int[] arr,int i,int j,int max){
        if(j==0){
            return;
        }
        if(i<=j){
            if(arr[i]>arr[max]){
                max=i;  
            }
            selectionSort(arr, i+1, j, max);
        }

        else{
            int temp=arr[max];
            arr[max]=arr[j];
            arr[j]=temp;
            selectionSort(arr, 0, j-1, 0);
        }

    }

    static void bubbleSort(int [] arr,int i,int j){
        if(j==0){
            return;
        }
        if(i<j){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;        
            }
            bubbleSort(arr, i+1, j);
        }else{
        bubbleSort(arr, 0, j-1);
        }
    }
}
