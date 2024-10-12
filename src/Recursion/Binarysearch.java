package Recursion;

public class Binarysearch {
    public static void main(String[] args) {
        int [] arr={4,5,6,8,10,12,56,60,78,90};
        int target=121;
        int res=bs(arr, target, 0, arr.length-1);
        System.out.println(res);

        
    }

    static int bs(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(target>arr[mid]){
            return bs(arr,target,mid+1,end);
        }
        else if(target<arr[mid]){
            return bs(arr, target, start, mid-1);
        }
        return mid;
    }
    }

    

