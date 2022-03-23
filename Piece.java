public class Piece {
    Gameboard currentGameBoard = new Gameboard();
    private int xindex;
    private int yindex;
    public String color;
    public boolean isKing;
    public Piece(Gameboard currentBoard, int xindex1, int yindex1, String color1, boolean isKing1)  {
        currentGameBoard = currentBoard;
        xindex = xindex1;
        yindex = yindex1;
        color = color1;
        isKing = isKing1;
    }
    public void move(int toXIndex, int toYIndex) {
        if(checkMove(toXIndex, toYIndex))  {
<<<<<<< HEAD
            if (currentGameBoard.gameBoard[xindex - 1][yindex - 1] = -1) {
                currentGameBoard.moveRedPiece(xindex, yindex, toXIndex, toYIndex);
            }
            if (currentGameBoard.gameBoard[xindex - 1][yindex - 1] = 1) {
=======
            currentGameBoard.game[toXIndex -1][toYIndex -1] = currentGameBoard.game[xindex - 1][yindex - 1];
            currentGameBoard.game[xindex - 1][yindex - 1] = null;
            if (color.equals("red")) {
                currentGameBoard.moveRedPiece(xindex, yindex, toXIndex, toYIndex);
            }
            if (color.equals("blue")) {
>>>>>>> 2e5090285876d9ee0452180f45487cbb9fdd07f2
                currentGameBoard.moveBluePiece(xindex, yindex, toXIndex, toYIndex);
            }
            currentGameBoard.gameBoard[toXIndex -1][toYIndex -1] = currentGameBoard.game[xindex - 1][yindex - 1];
            currentGameBoard.gameBoard[xindex - 1][yindex - 1] = 0;
            xindex = toXIndex;
            yindex = toYIndex;
        }
        else;
        
    }
    public void take(int takeXIndex, int takeYIndex, int toXIndex, int toYIndex) {
        if (checkTake(takeXIndex, takeYIndex, toXIndex, toYIndex)) {
            currentGameBoard.gameBoard[toXIndex -1][toYIndex -1] = currentGameBoard.game[xindex - 1][yindex - 1];
            xindex = toXIndex;
            yindex = toYIndex;
        }
        else; 
    }
    public boolean checkMove(int toXIndex, int toYIndex){
        if (currentGameBoard.gameBoard[toXIndex][toYIndex] = 0){
            return true;
        } 
        else return false;
    }
    public boolean checkTake(int takeXIndex, int takeYIndex, int toXIndex, int toYIndex){
<<<<<<< HEAD
        if(currentGameBoard.gameBoard[xindex - 1][yindex - 1] = 1) {
=======
        if(color.equals("blue")) {
>>>>>>> 2e5090285876d9ee0452180f45487cbb9fdd07f2
            if (toYIndex > takeYIndex && toXIndex > takeXIndex) {
                return true;
            }
            else return false;
        }
<<<<<<< HEAD
        else if (currentGameBoard.gameBoard[xindex - 1][yindex - 1] = -1) {
=======
        else if (color.equals("red")) {
>>>>>>> 2e5090285876d9ee0452180f45487cbb9fdd07f2
            if (toYIndex < takeYIndex && toXIndex < takeXIndex) {
                return true;
            }
            else return false;
        }
    }
    public boolean checkDoubleJump(int takeXIndex, int takeYIndex,int takeXIndex2, int takeYIndex2, int toXIndex , int toYIndex) {
        if (checkTake(takeXIndex, takeYIndex, takeXIndex2, takeYIndex2)) {
            if (checkTake(takeXIndex2, takeYIndex2, toXIndex, toYIndex)) {
                return true;
            }
            else return false;
        }
        else return false; 
    } 

}

