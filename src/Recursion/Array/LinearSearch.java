package Recursion.Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={3,4,4,7,4,8,4,9};
        int target=4;
        
        System.out.println(search(arr,target,0));
        System.out.println(search1(arr,target,0));

        // ArrayList<Integer> list=new ArrayList<Integer>();
        // System.out.println(search(arr,target,0, list()));
        System.out.println(search(arr,target,0, new ArrayList<>()));
        System.out.println(search2(arr,target,0));
    }


    static ArrayList<Integer> search2(int [] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ans = search2(arr,target,index+1);
        list.addAll(ans);
        return list;
    }



    //if an element is occuring multiple times
    static ArrayList<Integer> search(int [] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return search(arr,target,index+1,list);
    }
    
    
    static int search(int [] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return search(arr,target,index+1);
    }

    //return whether the element exists in the array or not
    static boolean search1(int [] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || search1(arr,target,index+1);
    }
}
