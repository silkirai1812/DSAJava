package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        boolean [][] maze={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] matrix=new int[maze.length][maze[0].length];
        printingMatrix("",matrix, 0, 0, 1);
        //printingMatrix("",maze,matrix,0,0,1);        
    }


    //printing matrix of the patths
    static void printingMatrix(String p,boolean[][] maze,int[][] matrix,int row, int col,int count){
        if(row==matrix.length-1 && col==matrix[0].length-1){
            matrix[row][col]=count;
            for(int[] arr:matrix){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(maze[row][col]==false){
            return;
        }
        
        maze[row][col]=false;
        matrix[row][col]=count;
        if(row<matrix.length-1){
            printingMatrix(p+"D",maze,matrix, row+1, col,count+1);
        }
        if(col<matrix[0].length-1 ){
            printingMatrix(p+"R",maze, matrix, row, col+1, count+1);
        }
        if(row>0){
            printingMatrix(p+"U",maze, matrix,row-1,col, count+1);
        }
        if(col>0){
            printingMatrix(p+"L",maze,matrix,row,col-1, count+1);
        }
        maze[row][col]=true;
        matrix[row][col]=0;
    } 




    static void printingMatrix(String p,int[][] matrix,int row, int col,int count){
        if(row==matrix.length-1 && col==matrix[0].length-1){
            matrix[row][col]=count;
            for(int[] arr:matrix){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(matrix[row][col]>0){
            return;
        }
        
        //maze[row][col]=false;
        // count+=1;
        matrix[row][col]=count;
        if(row<matrix.length-1){
            printingMatrix(p+"D",matrix, row+1, col,count+1);
        }
        if(col<matrix[0].length-1 ){
            printingMatrix(p+"R", matrix, row, col+1, count+1);
        }
        if(row>0){
            printingMatrix(p+"D",matrix,row-1,col, count+1);
        }
        if(col>0){
            printingMatrix(p+"L",matrix,row,col-1, count+1);
        }
        //maze[row][col]=true;
        matrix[row][col]=0;
    } 



    //printing paths in the maze including all paths that is up, down, left, right
    static ArrayList<String> allPathsRet(String p,boolean[][] maze,int row,int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(maze[row][col]==false){
            return list;
        }
        
        //all the  cells thar are visited mark those as false so that it does not go there
        maze[row][col]=false;
        if(row<maze.length-1){
            // maze[row][col]=false;
            list.addAll(allPathsRet(p+"D", maze, row+1, col));
            // maze[row][col]=true;
        }
        if(col<maze[0].length-1){
            // maze[row][col]=false;
            list.addAll(allPathsRet(p+"R", maze, row, col+1));
            // maze[row][col]=true;
        }
        if(row>0){
            // maze[row][col]=false;
            list.addAll(allPathsRet(p+"U",maze,row-1,col));
            // maze[row][col]=true;
        }
        if(col>0){
            // maze[row][col]=false;
            list.addAll(allPathsRet(p+"L",maze,row,col-1));
            // maze[row][col]=true;
        }
        maze[row][col]=true;

        return list;
    }




    static void allPaths(String p,boolean[][] maze,int row,int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[row][col]==false){
            return;
        }
        //all the  cells thar are visited mark those as false so that it does not go there
        if(row<maze.length-1){
            maze[row][col]=false;
            allPaths(p+"D", maze, row+1, col);
            maze[row][col]=true;
        }
        if(col<maze[0].length-1){
            maze[row][col]=false;
            allPaths(p+"R", maze, row, col+1);
            maze[row][col]=true;
        }
        if(row>0){
            maze[row][col]=false;
            allPaths(p+"U",maze,row-1,col);
            maze[row][col]=true;
        }
        if(col>0){
            maze[row][col]=false;
            allPaths(p+"L",maze,row,col-1);
            maze[row][col]=true;
        }
    }

    
}
