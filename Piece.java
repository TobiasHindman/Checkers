public class Piece {
    Gameboard currentGameBoard = new Gameboard();
    //private int xindex;
    //private int yindex;
    public String color;
    public boolean isKing;
    public void move(int xindex, int yindex, int toXIndex, int toYIndex) {
        if(checkMove(xindex, yindex, toXIndex, toYIndex))  {
            if (Gameboard.gameBoard[xindex - 1][yindex - 1] == -1) {
                currentGameBoard.moveRedPiece(xindex, yindex, toXIndex, toYIndex);
            }
            if (Gameboard.gameBoard[xindex - 1][yindex - 1] == 1) {
                currentGameBoard.moveBluePiece(xindex, yindex, toXIndex, toYIndex);
            }
            Gameboard.gameBoard[toXIndex -1][toYIndex -1] = Gameboard.gameBoard[xindex - 1][yindex - 1];
            Gameboard.gameBoard[xindex - 1][yindex - 1] = 0;
            xindex = toXIndex;
            yindex = toYIndex;
            
        }  
    }
    public void take(int fromXIndex, int fromYIndex, int takeXIndex, int takeYIndex) {
        int toXIndex;
        int toYIndex;
        if (Gameboard.gameBoard[fromXIndex - 1][fromYIndex - 1] == -1) {
            if(takeXIndex > fromXIndex) {
                toXIndex = takeXIndex + 1;
                toYIndex = takeYIndex - 1;
            }
            else {
                toXIndex = takeXIndex - 1;
                toYIndex = takeYIndex - 1;
            }
        }
        else {
            if(takeXIndex > fromXIndex) {
                toXIndex = takeXIndex + 1;
                toYIndex = takeYIndex + 1;
            }
            else {
                toXIndex = takeXIndex - 1;
                toYIndex = takeYIndex + 1;
            }
        }
        
        if (checkTake(fromXIndex, fromYIndex, takeXIndex, takeYIndex, toXIndex, toYIndex)) {
            Gameboard.gameBoard[toXIndex -1][toYIndex -1] = Gameboard.gameBoard[fromXIndex - 1][fromYIndex - 1];
        }
        else; 
    }
    public boolean checkMove(int xindex, int yindex, int toXIndex, int toYIndex){
        if (Gameboard.gameBoard[toXIndex][toYIndex] == 0){
            return true;
        }
        if(Gameboard.gameBoard[xindex][yindex] == -1) {
            if((toXIndex != xindex) &&(toYIndex > yindex)) {
                return true;
            }
        }
        if(Gameboard.gameBoard[xindex][yindex] == 1) {
            if((toXIndex != xindex) &&(toYIndex < yindex)) {
                return true;
            }
        }
        return false;
    }
    public boolean checkTake(int fromXIndex, int fromYIndex, int takeXIndex, int takeYIndex, int toXIndex, int toYIndex){
        if(Gameboard.gameBoard[fromXIndex - 1][fromYIndex - 1] == 1) {
            if (toYIndex > takeYIndex && toXIndex > takeXIndex) {
                return true;
            }
            else return false;
        }
        else if (Gameboard.gameBoard[fromXIndex - 1][fromYIndex - 1] == -1) {
            if (toYIndex < takeYIndex && toXIndex < takeXIndex) {
                return true;
            }
            else return false;
        }
        else return false;
    }
    public boolean checkDoubleJump(int fromXIndex, int fromYIndex, int takeXIndex, int takeYIndex,int takeXIndex2, int takeYIndex2, int toXIndex , int toYIndex) {
        if (checkTake(fromXIndex, fromYIndex, takeXIndex, takeYIndex, takeXIndex2, takeYIndex2)) {
            if (checkTake(takeXIndex, takeYIndex, takeXIndex2, takeYIndex2, toXIndex, toYIndex)) {
                return true;
            }
            else return false;
        }
        else return false; 
    } 

}

