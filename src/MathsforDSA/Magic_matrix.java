package MathsforDSA;

import java.util.Scanner;

/**
 * Magic_matrix
 */
public class Magic_matrix {
    int[][] arr;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix size: ");
        int n=sc.nextInt();
        arr=new int[n][n];
        if (n%2!=0) {
            System.out.println("Enter Matrix Elements: ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j]=sc.nextInt();
                }
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        Magic_matrix ob=new Magic_matrix();
        ob.input();
        ob.check();
        
    }
    void check() {
        
    }
}