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

    public boolean isWinner() {
        // You will write this code!!
        return true;
    }

    public boolean isTie() {
        // You will write this code too!!
        return true;
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
