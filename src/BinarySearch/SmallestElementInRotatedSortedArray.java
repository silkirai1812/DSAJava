package BinarySearch;

public class SmallestElementInRotatedSortedArray {
    public static void main(String[] args) {

        int [] arr ={4,5,6,1,2,3};
        System.out.println(smallElement(arr));
    }

    static int smallElement(int[]arr){
        int l=0;
        int h=arr.length-1;
        int index=-1;
        int ans=Integer.MAX_VALUE;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[l]<=arr[h]){
                if(arr[l]<ans){
                    ans=arr[l];
                    index=l;
                }
                break;
            }
            if(arr[l]<=arr[mid]){
                // ans=Math.min(ans,arr[l]);
                if(arr[l]<ans){
                    ans=arr[l];
                    index=l;
                }
                l=mid+1;
            }
            else{
                if(arr[mid]<ans){
                    ans=arr[mid];
                    index=mid;
                }
                h=mid-1;
            }
        }
        System.out.println();
        System.out.println("pivot index = "+index);
        return ans;
    }
}
