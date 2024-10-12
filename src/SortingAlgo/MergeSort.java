package SortingAlgo;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,17,324,3,2,1,98};
        System.out.println(Arrays.toString(mergeSort(arr)));   
        //mergeSort(arr, 0, arr.length-1); 
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        
        int mid=arr.length/2;
        int [] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    static int[] merge(int[] left,int[] right){
        int[] a=new int[left.length + right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                a[k]=left[i];
                i++;
                k++;
            }
            else{
                a[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<left.length){
            a[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            a[k]=right[j];
            j++;
            k++;
        }
        return a;

    }
    
    // static void mergeSort(int[] arr,int s,int e){
    //     if(e-s==1){
    //         return;
    //     }
    //     int mid=s+(e-s)/2;
    //     mergeSort(arr, s, mid);
    //     mergeSort(arr, mid, e);

    //     merge(arr,s,mid,e);
        
    // }

    // static void merge(int[] arr,int s,int m,int e){
    //     int[] num=new int[e-s];
    //     int i=s;
    //     int j=m;
    //     int k=0;
    //     //int mid=s+(e-s)/2;
    //     while(i<m && j<e){
    //     if(arr[i]<arr[j]){
    //         num[k]=arr[i];
    //         k++;
    //         i++;
    //     }
    //     else{
    //         num[k]=arr[j];
    //         k++;
    //         j++;
    //     }
    // }
    // while(i<m){
    //     num[k]=arr[i];
    //     i++;
    //     k++;
    // }
    // while(j<e){
    //     num[k]=arr[j];
    //     j++;
    //     k++;
    // }
        
    // for(int l=0;l<num.length;l++){
    //     arr[s+l]=num[l];
    // }
// }
}
