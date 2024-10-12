package SortingAlgo;
//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

public class CyclesortQus {
    public static void main(String[] args) {
        int [] nums={4,3,2,7,8,2,3,1};
        findDisappearedNumbers(nums);
        //System.out.println(Arrays.toString(nums));
        
    }

    //public List<Integer> findDisappearedNumbers(int[] nums) {
    static void findDisappearedNumbers(int[] nums) {
        //ArrayList<Integer> list=new ArrayList<>(2);
        int n=nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    static void swap(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
