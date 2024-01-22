package tictactoe;

/**
 * Tic-Tac-Toe state variables.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int whoseMove = Constants.X;
    private String xName = "";
    private String oName = "";
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];

    private void checkLine(int function) {

    }

    public boolean isWinner() {

        // y=i

        for (int y = 0; y < Constants.BOARD_SIZE; y++){
            
            int total = 0;
            
            for (int i = 0; i < Constants.BOARD_SIZE; i++){
                total += board[y][i];
            }
            
            if (Math.abs(total) == Constants.BOARD_SIZE) {
                return true;
            }
        }

        // x=i

        for (int x = 0; x < Constants.BOARD_SIZE; x++){
            
            int total = 0;
            
            for (int i = 0; i < Constants.BOARD_SIZE; i++){
                total += board[i][x];
            }
            
            if (Math.abs(total) == Constants.BOARD_SIZE) {
                return true;
            }
        }

        return false;
    }

    public boolean isTie() {
        // You will write this code too!!
        return false;
    }

    public int getGameState() {
        return this.gameState;
    }

    public void setGameState(int gameState) {
        this.gameState = gameState;
    }

    public int getBoardCell(int row, int col) {
        return this.board[row-1][col-1];
    }

    public void setBoardCell(int row, int col, int value) {
        this.board[row-1][col-1] = value;
    }

    public void setXName(String name) {
        this.xName = name;
    }

    public void setOName(String name) {
        this.oName = name;
    }

    public int getWhoseMove() {
        return this.whoseMove;
    }

    public void setWhoseMove(int whoseMove) {
        this.whoseMove = whoseMove;
    }

    public String getXName() {
        return this.xName;
    }

    public String getOName() {
        return this.oName;
    }
}
