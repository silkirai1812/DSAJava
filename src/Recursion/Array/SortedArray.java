package Recursion.Array;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        int index=0;
        System.out.println(sorted(arr,index));
        
    }
    
    static boolean sorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        
        // if(arr[i]<arr[i+1]){
        //     return sorted(arr,i+1);
        // }
        // return false;

        return (arr[i]<arr[i+1] && sorted(arr,i+1));
    }
}
