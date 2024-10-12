public class Recursion {
    public static void main(String[] args) {
        //System.out.println(fibonacci(4));
        int[] arr={2,5,7,9,8,10,21};
        int bs=binarySearch(arr, 21, 0, arr.length-1);
        System.out.println(bs);        
    }

    static int fibonacci(int n){
        if(n==0){
            // System.out.println(0);
            return 0;
        }
        if(n==1){
            // System.out.println(1);
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
        // System.out.println();
    }



    static int binarySearch(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        
        if(target>arr[mid]){
            return binarySearch(arr, target, mid+1, end);
        }
        else if(target<arr[mid]){
            return binarySearch(arr, target, start, mid-1);
        }
        return mid;
    }
    
}
