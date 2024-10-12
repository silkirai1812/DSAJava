package Recursion;

public class Patterns {
    public static void main(String[] args) {
        pattern1(4,0 ,0);
        System.out.println();
        pattern2(5,0);
    }
    
    static void pattern1(int n,int row,int col){
        if(row>n){
            return;
        }
        if(col<row){
            System.out.print("*");
            pattern1(n,row,col+1);
        }
        else{
        System.out.println();
        row++;
        pattern1(n,row,0);
        }

        // if(row==0){
        //     return;
        // }
        // if(col<row){
        //     pattern1(n,row,col+1);
        //     System.out.print("*");
        // }
        // else{
        //     pattern1(n,row-1,0);
        //     System.out.println();
        // }
        

    }


    static void pattern2(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("*");
            pattern2(row,col+1);
        }
        else{
            System.out.println();
            pattern2(row-1,0);
        }

        //  if(row==0){
        //     return;
        // }
        // if(col<row){
        //     pattern2(row,col+1);
        //     System.out.print("*");
        // }
        // else{
        //     pattern2(row-1,0);
        //     System.out.println();
        // }
    }
}
