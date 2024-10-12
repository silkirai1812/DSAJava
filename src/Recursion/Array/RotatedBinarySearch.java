package Recursion.Array;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr={5,6,7,1,2,3};
        System.out.println(rotated(arr,8,0,arr.length-1));
        
    }
     static int rotated(int [] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;

        //to search an element in the rotated array
        if(arr[mid]==target){
            return mid;
        }

        //to find pivot index
        // if(arr[mid]>arr[mid+1]){
        //     return arr[mid];
        // }
        // if(arr[mid]<arr[mid-1]){
        //     return arr[mid-1];
        // }

        
        if(arr[s]<arr[mid]){
            if(target>=arr[s] && target<=arr[mid]){
                return rotated(arr,target,s,mid-1);
            }
            else{
                return rotated(arr,target,mid+1,e);
            }
        }
        if(target>arr[mid] && target<=arr[e]){
            return rotated(arr, target, mid+1, e);
        }
        else{
            return  rotated(arr, target , s, mid-1 );
        }

        

     }
    
}
