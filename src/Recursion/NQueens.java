package Recursion;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        boolean [][]board= new boolean[n][n];
        System.out.println(nQueens(board,0));
        // nQueens(board,0,0,n);
    }

    static int nQueens(boolean [][] board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int col=0;col<board.length;col++){
        if(isSafe(board,row,col)){
            board[row][col]=true;
            count=count+nQueens(board,row+1);
            board[row][col]=false;
        }
    }
    return count;

    }

    // static void nQueens(boolean [][] board,int row,int col,int target){
    //     if(target==0){
    //         display(board);
    //         System.out.println();
    //     }
    //     if(row==board.length-1 && col==board.length-1){
    //         return;
    //     }
    //     if(col==board.length){
    //         nQueens(board, row+1, col,target);
    //         return;
    //     }
    //     if(row==board.length-1 && col>board.length){
    //         return;
    //     }
    //     if(col==board.length-1){
    //         nQueens(board,row+1,0,target);
    //     }
        
    //     if(isSafe(board,row,col)){
    //         board[row][col]=true;
    //         nQueens(board,row+1,0,target-1);
    //         board[row][col]=false;
    //     }
    //         nQueens(board,row,col+1,target);
        
    // }

    
    static boolean isSafe(boolean[][] board, int row, int col) {
        //vertical check
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        //right diagonal check
        int maxRight=Math.min(row,board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        //left diagonal check
        int maxleft=Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        return true;
        
    }

    static void display(boolean [][] board){
        for(boolean[] arr: board){
            for(boolean element:arr){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
