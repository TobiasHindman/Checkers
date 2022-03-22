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
            currentGameBoard.game[toXIndex -1][toYIndex -1] = currentGameBoard.game[xindex - 1][yindex - 1];
            currentGameBoard.game[xindex - 1][yindex - 1] = null;
            if (color.equals("red")) {
                currentGameBoard.moveRedPiece(xindex, yindex, toXIndex, toYIndex);
            }
            if (color.equals("blue")) {
                currentGameBoard.moveBluePiece(xindex, yindex, toXIndex, toYIndex);
            }
            xindex = toXIndex;
            yindex = toYIndex;
        }
        else {}
        
    }
    public void take(int takeXIndex, int takeYIndex, int toXIndex, int toYIndex) {
        if (checkTake(takeXIndex, takeYIndex, toXIndex, toYIndex)) {
            currentGameBoard.game[toXIndex -1][toYIndex -1] = currentGameBoard.game[xindex - 1][yindex - 1];
            xindex = toXIndex;
            yindex = toYIndex;
        }
        else {} 
    }
    public boolean checkMove(int toXIndex, int toYIndex){
        if(currentGameBoard[toXIndex][toYIndex] = null){
            return true;
        } 
        else {
            return false;
        }
    }
    public boolean checkTake(int takeXIndex, int takeYIndex, int toXIndex, int toYIndex){
        if(color.equals("blue")) {
            if (toYIndex > takeYIndex && toXIndex > takeXIndex) {
                return true;
            }
            else {return false;}
        }
        else if (color.equals("red")) {
            if (toYIndex < takeYIndex && toXIndex < takeXIndex) {
                return true;
            }
            else {return false;}
        }
    }
    public boolean checkDoubleJump(int takeXIndex, int takeYIndex,int takeXIndex2, int takeYIndex2, int toXIndex , int toYIndex) {
        if (checkTake(takeXIndex, takeYIndex, takeXIndex2, takeYIndex2)) {
            if(checkTake(takeXIndex2, takeYIndex2, toXIndex, toYIndex)) {
                return true;
            }
            else{return false;}
        }
        else{return false;}  
    }

}

