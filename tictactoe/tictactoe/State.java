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

    private boolean checkColumn(int column) {
        int total = 0;

        for (int i = 0; i < Constants.BOARD_SIZE; i++){
            total += board[column][i];
        }

        if (Math.abs(total) == Constants.BOARD_SIZE) {
            return true;
        }
        return false;
    }

    private boolean checkRow(int row) {
        int total = 0;

        for (int i = 0; i < Constants.BOARD_SIZE; i++){
            total += board[i][row];
        }

        if (Math.abs(total) == Constants.BOARD_SIZE) {
            return true;
        }
        return false;
    }
    
    private boolean checkDiagonalA() {
        int total = 0;
        
        for (int i = 0; i < Constants.BOARD_SIZE; i++) {
            total += board[i][i];
        }
        
        if (Math.abs(total) == Constants.BOARD_SIZE) {
            return true;
        }
        return false;
    }
    
    private boolean checkDiagonalB() {
        int total = 0;
        
        for (int i = 0; i < Constants.BOARD_SIZE; i++) {
            total += board[i][-i+Constants.BOARD_SIZE-1];
        }
        
        if (Math.abs(total) == Constants.BOARD_SIZE) {
            return true;
        }
        return false;
    }

    public boolean isWinner() {

        // y=i

        for (int y = 0; y < Constants.BOARD_SIZE; y++){
            if (this.checkColumn(y) == true) {
                return true;
            }
        }

        // x=i

        for (int x = 0; x < Constants.BOARD_SIZE; x++){
            if (this.checkRow(x) == true) {
                return true;
            }
        }
        
        if (this.checkDiagonalA() == true) {
            return true;
        }
        if (this.checkDiagonalB() == true) {
            return true;
        }
        
        return false;
    }

    public boolean isTie() {
        for (int x = 0; x < Constants.BOARD_SIZE; x++) {
            for (int y = 0; y < Constants.BOARD_SIZE; y++) {
                if (board[x][y] == Constants.BLANK) {
                    return false;
                }
            }
        }
        
        if (this.isWinner() == false) {
            return true;
        }
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
