package Recursion;

import java.util.ArrayList;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean [][] board={
            {true,true,true},
            {true,true,true},
            {true,true,true} 
        };
        // pathWithObstacles("", board, 0, 0);
        // System.out.println(pathWithObstacles1("", board, 0, 0));
        allPaths("", board, 0, 0);
        System.out.println(allPathsRet("", board, 0, 0));
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



    static ArrayList<String> pathWithObstacles1(String p,boolean[][] maze,int row,int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            ArrayList<String> l=new ArrayList<>();
            l.add(p);
            return l;
        }
        // if(maze[row][col]==false){
        //     return;
        // }
        ArrayList<String> ans=new ArrayList<>();
        if(row<maze.length-1 && maze[row][col]==true){
            ans.addAll(pathWithObstacles1(p+"D", maze, row+1, col));
        }
        if(col<maze[0].length-1 && maze[row][col]==true){
            ans.addAll(pathWithObstacles1(p+"R", maze, row, col+1));
        }
        return ans;
    }
    


    static void pathWithObstacles(String p,boolean[][] maze,int row,int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(p);
            return;
        }
        // if(maze[row][col]==false){
        //     return;
        // }
        if(row<maze.length-1 && maze[row][col]==true){
            pathWithObstacles(p+"D", maze, row+1, col);
        }
        if(col<maze[0].length-1 && maze[row][col]==true){
            pathWithObstacles(p+"R", maze, row, col+1);
        }
    }
    
}
