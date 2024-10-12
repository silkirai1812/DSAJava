//import java.util.ArrayList;
import java.util.Arrays;

//searching of an element in sorted matrix


public class SortedMatrix {
      public static void main(String[] args) {
        int [][] arr1={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int[] ans2=sortedMatrix(arr1, 6);
        System.out.println(Arrays.toString(ans2));


        // int [][] arr={
        //     {10,20,30,40},
        //     {15,25,35,45},
        //     {28,29,36,38},
        //     {30,36,49,50}
        // };
        //int[] ans=rowColSortedMatrix(arr, 36);
        //System.out.println(Arrays.toString(ans));
    }


    static int[] binarySearch(int [][]arr,int target,int row,int cStart,int cEnd){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(arr[row][mid]==target){
                return new int[] {row,mid};
            }
            else if(arr[row][mid]>target){
                cEnd=mid-1;
            }
            else{
                cStart=mid+1;
            }
        }
        return new int [] {-1,-1};
    }



    //search in a sorted matrix
    
    static int[] sortedMatrix(int[][] arr, int target){
        int rows=arr.length;
        int cols=arr[0].length-1;
        if(rows==1){
            return binarySearch(arr, target, 0, 0, rows-1);
        }
        int rStart=0;
        int midCol=cols/2;
        int rEnd=rows-1;
        while(rStart<rEnd-1){
            int mid=rStart+(rEnd-rStart)/2;
            if(arr[rStart][midCol]==target){
                return new int[] {rStart,midCol};
            }
            if(arr[rStart][midCol]>target){
                rEnd=mid;
            }
            else{
                rStart=mid;
            }
        }
        if(target==arr[rStart][midCol]){
            return new int[] {rStart,midCol};
        }
        else if(target==arr[rStart+1][midCol]){
            return new int[] {rStart+1,midCol};
        }
        else if(target<arr[rStart][midCol]){
            return binarySearch(arr, target, rStart, 0, midCol-1);
        }
        else if(target<arr[rStart+1][midCol]){
            return binarySearch(arr, target, rStart+1, 0, midCol-1);
        }
        else if(target>arr[rStart][midCol]){
            return binarySearch(arr, target, rStart, midCol+1, cols-1);
        }
        else {
            return binarySearch(arr, target, rStart+1, midCol+1, cols-1);
        }
    }


    //binary search in rowwise and colwise sorted matrix
    //complexity--O(n)
    static int[] rowColSortedMatrix(int [][] arr,int target){
        int r=0;
        int row=arr.length-1;
        int c=arr[row].length-1;
        //int [] res={-1,-1};
        while(r<arr.length && c>=0){
            int element = arr[r][c];
            if(target<element){
                c--;
            }
            else if(target>element) {
                r++;
            }
            else{
                //res[0]=r;
                //res[1]=c;
                return new int[] {r,c};
            }   
        }
        return new int[] {-1,-1};
    }






    /*//useless
    static int sortedMatrix(int[][] arr,int target){
        ArrayList <Integer> list=new ArrayList<>(10);
        int row=arr.length-1;
        int col=arr[row].length-1;
        for(int i=0;i<=row;i++){
            for(int j=0;j<=col;j++){
                list.add(arr[i][j]);
            }
        }
        
        int s=0;
        int e=list.size()-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target>list.get(mid)){
                s=mid+1;
            }
            else if(target<list.get(mid)){
                e=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }*/

    
}
