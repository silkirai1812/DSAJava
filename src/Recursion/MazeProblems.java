package Recursion;

import java.util.ArrayList;

public class MazeProblems {
    public static void main(String[] args) {
        
        //System.out.println(countPaths(3, 3));

        //printingPaths("",3,3);

        //System.out.println(printingPaths1("", 3, 3));
        //System.out.println(printingPaths1("", 4, 3));

        // System.out.println("D- Diagonal path");
        // System.out.println("V- Vertical path");
        // System.out.println("H- Horizontal path");

        System.out.println(printingPathsDiagonal("",3,3));
    }


    //printing paths in the maze if we can go right and down and diagonal
    static ArrayList<String> printingPathsDiagonal(String p,int row,int col){
        if(row==1 && col==1){
            ArrayList<String> l=new ArrayList<>();
            l.add(p);
            return l;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(row>1){
            ArrayList<String> left=printingPathsDiagonal(p+"V", row-1, col);
            ans.addAll(left);
        }
        if(col>1){
            ArrayList<String> right=printingPathsDiagonal(p+"H", row, col-1);
            ans.addAll(right);
        }
        if(row>1 && col>1){
            ans.addAll(printingPathsDiagonal(p+"D", row-1, col-1));
        }
        return ans;
    }


    //printing paths in the maze if we can go only right and down
    // static void printingPaths(String p,int row,int col){
    //     if(row==1 && col==1){
    //         System.out.println(p);
    //         return;
    //     }
    //     if(row>1){
    //         printingPaths(p+"D", row-1, col);
    //     }
    //     if(col>1){
    //         printingPaths(p+"R", row, col-1);
    //     }
    // }

    //printing paths in the maze if we can go only right and down
    static ArrayList<String> printingPaths1(String p,int row,int col){
        if(row==1 && col==1){
            ArrayList<String> l=new ArrayList<>();
            l.add(p);
            return l;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(row>1){
            ArrayList<String> left=printingPaths1(p+"D", row-1, col);
            ans.addAll(left);
        }
        if(col>1){
            ArrayList<String> right=printingPaths1(p+"R", row, col-1);
            ans.addAll(right);
        }
        return ans;
    }


    //counting the number of paths in a maze(2-d array) if we can go only right and down
    static int countPaths(int row,int col){
        if(row==1 || col==1){
            return 1;
        }
        int count=0;
        count=count+countPaths(row-1,col);
        count=count+countPaths(row,col-1);
        return count;
    }

    
}
