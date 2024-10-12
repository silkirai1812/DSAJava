package Recursion;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][]board={ {3, 0, 6, 5, 0, 8, 4, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 7, 0, 0, 0, 0, 3, 1},
        {0, 0, 3, 0, 1, 0, 0, 8, 0},
        {9, 0, 0, 8, 6, 3, 0, 0, 5},
        {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
        {1, 3, 0, 0, 0, 0, 2, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 7, 4},
        {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        System.out.println(sudoku(board));
        // if(sudoku(board)){
        //     display(board);
        //     System.out.println();
        // }
        // else{
        //     System.out.println("can't solve");
        // }
        
    }
    
    static boolean sudoku(int[][] board){
        int n=board.length;
        int row=-1;
        int col=-1;
        boolean empty=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    empty=false;
                    break;
                }
            }
            if(empty==false){
                break;
            }
            if(empty==true){
                return true;
            }
        }
        for(int number=1;number<=9;number++){
            if(isSafe(board,row,col,number)){
                board[row][col]=number; 
                if(sudoku(board)){
                    display(board);
                    return true;
                }
                //backtrack
                else{
                    board[row][col]=0;
                } 
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board,int row,int col,int num){
        //row check
        for(int i=0;i<=col;i++){
            if(board[row][col]==num){
                return false;
            }
        }
        //col check
        for(int [] nums:board){
            if(nums[col]==num){
                return false;
            }
        }
        //3x3 box check
        int sqrt=(int)(Math.sqrt(board.length));
        row=row-row%sqrt;
        col=col-col%sqrt;
        
        for(int i=row;i<row+sqrt;i++){
            for(int j=col;j<col+sqrt;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }

    static void display(int[][]board){
        for(int[] row:board){
            for(int num:row){
                System.out.print(num+" ");
            }
        }
        System.out.println();
    }
}
