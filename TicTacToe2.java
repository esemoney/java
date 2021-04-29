import java.util.Scanner;

public class TicTacToe2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row, column;
        char player = 'X';

        //create 2 dimensional array for tic tac toe board
        char[][] board = new char[3][3];
        char ch = '1';
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                board[i][j] = ch++;
            }
        }
        displayBoard(board);
        while(!winner(board) == true){

            //get input for row/column
            System.out.println("Enter a row and column (0, 1, or 2); for player " + player + ":");
            row = in.nextInt();
            column = in.nextInt();

            //occupied
            while (board[row][column] == 'X' || board[row][column] == 'O') {
                System.out.println("This spot is occupied. Please try again");
            }
            //place the X
            board[row][column] = player;
            displayBoard(board);

            if (winner(board)){
                System.out.println("Player " + player + " is the winner!");
            }

            //time to swap players after each go.
            if (player == 'O') {
                player = 'X';

            }
            else {
                player = 'O';
            }
            if (winner(board) == false && !hasFreeSpace(board)) {
                System.out.println("The game is a draw. Please try again.");
            }
        }

        //Don't forget to close the scanner.
        in.close();

    }

    public static void displayBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j == board[i].length - 1) System.out.print(board[i][j]);
                else System.out.print( board[i][j] + " | ");
            }
            System.out.println();
        }
    }

    /**
     * Determines whether the board is completely occupied by X and O characters
     * @param board the board to search through
     * @return true if entire board is populated by X or O, false otherwise.
     */
    public static boolean hasFreeSpace(char[][] board){
        for (int i = 0; i< board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != 'O' && board[i][j] != 'X') {
                    return true;
                }
            }
        }
        return false;
    }

    //method to determine whether there is a winner
    public static boolean winner(char[][] board){
        return isHorizontalWin(board) || isVerticalWin(board) || isDiagonalWin(board);
    }

    /**
     * Determines if there is a winner by checking each row for consecutive
     * matching tokens.
     * @return true if there is a winner horizontally, false otherwise.
     */
    private static boolean isHorizontalWin(char[][] board) {
        for(int row = 0; row < board.length; row++){
            if(isWin(board[row]))
                return true;
        }
        return false;
    }

    /**
     * Determines whether all of the buttons in the specified array have the
     * same text and that the text is not empty string.
     * @param lineToProcess an array of buttons representing a line in the grid
     * @return true if all buttons in the array have the same non-empty text, false otherwise.
     */
    private static boolean isWin(char[] lineToProcess) {
        boolean foundWin = true;
        char prevChar = '-';
        for(char character: lineToProcess) {
            if(prevChar == '-')
                prevChar = character;
            if ('O' != character && 'X' != character) {
                foundWin = false;
                break;
            } else if (prevChar != character) {
                foundWin = false;
                break;
            }
        }
        return foundWin;
    }

    /**
     * Determines whether there is a winner by checking column for consecutive
     * matching tokens.
     * @return true if there is a vertical winner, false otherwise.
     */
    private static boolean isVerticalWin(char[][] board) {
        char[] column = null;
      //assuming all rows have same legnth (same number of cols in each row), use first row
        for(int col = 0; col < board[0].length; col++){
            column = new char[board[0].length];
            for(int row = 0; row < column.length; row++){
                column[row] = board[row][col];
            }
            if(isWin(column))
                return true;
        }
        return false;
    }

    /**
     * Determines if there is a winner by checking each diagonal for consecutive
     * matching tokens.
     * @return true if a diagonal winner exists, false otherwise.
     */
    private static boolean isDiagonalWin(char[][] board) {

        int row = 0, col = 0;
        int cols = board.length;
        int rows = board[0].length; //assuming all rows are equal length so just use the first one

        //Create a one-dimensional array to represent the diagonal. Use the lesser
        // of the rows or columns to set its size. If the grid is rectangular then
        // a diagonal will always be the size of the lesser of its two dimensions.
        int size = rows < cols ? rows : cols;
        char[] diagonal = new char[size];

        //Since we know the grid is a square we really could just check one of
        // these - either row or col, but I left both in here anyway.
        while (row < rows && col < cols) {
            diagonal[col] = board[row][col];

            row++;
            col++;
        }
        if (isWin(diagonal)) {
            return true;
        }


        row = rows - 1;
        col = 0;
        diagonal = new char[size];
        while (row >=0 && col < cols) {
            diagonal[col] = board[row][col];
            row--;
            col++;
        }
        return isWin(diagonal);

    }
}
