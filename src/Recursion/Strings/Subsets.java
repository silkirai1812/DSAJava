package Recursion.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        // ArrayList<ArrayList<Integer>> res=subset(arr);
        // for(ArrayList<Integer> i:res){
        //     System.out.println(i);
        // }
        System.out.println(subset(arr));
        int[] arr1={1,2,2,2,3};
        System.out.println(subsetrepeated(arr1));
    }

    //for repeated elements in array first we need to sort the array
    static ArrayList<ArrayList<Integer>> subsetrepeated(int[] arr){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int s=0;
        int e=0;
        for(int i=0;i<arr.length;i++){
            s=0;
            if(i>0 && arr[i]==arr[i-1]){
                s=e+1;
            }
            e=outer.size()-1;
            int n=outer.size();
            for(int j=s;j<n;j++){
                ArrayList<Integer> inner=new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }

    
    static ArrayList<ArrayList<Integer>> subset(int[] arr){
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
