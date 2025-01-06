public class NQueens{
    public static void main(String[] args) {
        int N = 4;
        char[][] chessBoard = new char[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                chessBoard[i][j] = '.';
            }
        }
        nQueens(chessBoard , 0); // 0 is the board
        System.out.println("Total ways " + count);
    }
    static int count = 0;
    static void nQueens(char[][] chessBoard , int row) {
        if(row == chessBoard.length){
            count++;
            print(chessBoard);
            return;
        }
        // go to columns and place the queens
        for(int j=0;j<chessBoard.length;j++) {
            if(isSafe(chessBoard, row, j)) {
                chessBoard[row][j] = 'Q';
                nQueens(chessBoard, row+1);   // for next row
                chessBoard[row][j] = '.';     // backtrack step
            }
        }
    }
    static boolean isSafe(char[][] chessBoard , int row , int col) {
        // vertical up
        for(int i=row-1 ; i>=0 ; i--) {
            if(chessBoard[i][col] == 'Q') {
                return false;
            }
        }
        // diag left up
        for(int i=row-1 , j=col-1 ; i>=0 && j>=0 ; i-- , j--) {
            if(chessBoard[i][j] == 'Q') {
                return false;
            }
        }
        // diag right up
        for(int i=row-1 , j=col+1 ; i>=0 && j<chessBoard.length ; i-- , j++) {
            if(chessBoard[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    static void print(char [][] board) {
        System.out.println("----- chess board -----");
        for (char[] board1 : board) {
            for (int j = 0; j<board.length; j++) {
                System.out.print(board1[j] + " ");
            }
            System.out.println();
        }
    }

}