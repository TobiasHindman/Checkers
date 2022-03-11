public class Piece {
    private  GameBoard currentGameBoard;
    private int xindex;
    private int yindex;
    public int color;
    public piece(GameBoard currentBoard, int xindex1, int yindex1, String color1)  {
        currentGameBoard = currentBoard;
        xindex = xindex1;
        yindex = yindex1;
        color = color1;
    }
    public void move(int toXIndex, int toYIndex) {
        currentGameBoard.game[toXIndex -1][toYIndex -1] = currentGameBoard.game[xindex - 1][yindex - 1];
        currentGameBoard.game[xindex - 1][yindex - 1] = null;
        xindex = toXIndex;
        yindex = toYIndex;
    }
    public void take(int takeXIndex, int takeYIndex, int toXIndex, int toYIndex) {
        currentGameBoard.game[toXIndex -1][toYIndex -1] = currentGameBoard.game[xindex - 1][yindex - 1];
        xindex = toXIndex;
        yindex = toYIndex;
    }
    public boolean checkMove(int toXIndex, int toYIndex){
        if(currentGameBoard[toXIndex][toYIndex] = null){
            return true;
        } 
        else {
            return false;
        }
    }
    public boolean checkTake(int takeXIndex, int takeYIndex, intc toXIndex, int toYIndex){
        if(color = "blue") {
            if (toYIndex > takeYIndex && toXIndex > takeXIndex) {
                return true;
            }
            else {return false;}
        }
        else if (color = "red") {
            if (toYIndex < takeYIndex && toXIndex < takeXIndex) {
                return true;
            }
            else {return false;}
        }

    }
}

