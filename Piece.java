public class Piece {/*
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
    public boolean take(int fromXIndex, int fromYIndex, int takeXIndex, int takeYIndex) {
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
          return true;
        }
        else{
          return false;
        } 
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
    } */
Gameboard currentGameBoard = new Gameboard();
    //private int xindex;
    //private int yindex;
    public String color;
    public boolean isKing;
    public boolean move(int fromX, int fromY, int toX, int toY) {
        if(Gameboard.gameBoard[fromX][fromY] == 1){
          if((toY-fromY) == 1){
            if(((fromX-toX)==1)||((fromX-toX)==-1)){
              System.out.println("Blue piece");
              if(Gameboard.gameBoard[toX][toY]==0){
                Gameboard.gameBoard[toX][toY] = Gameboard.gameBoard[fromX][fromY];
                Gameboard.gameBoard[fromX][fromY] = 0;
              }
            }
          }
          return true;
        }
      else if(Gameboard.gameBoard[fromX][fromY] == -1){
        System.out.println("Red piece");
          if((fromY-toY) == 1){
            if(((fromX-toX)==1)||((fromX-toX)==-1)){
              System.out.println("Blue piece");
              if(Gameboard.gameBoard[toX][toY]==0){
                Gameboard.gameBoard[toX][toY] = Gameboard.gameBoard[fromX][fromY];
                Gameboard.gameBoard[fromX][fromY] = 0;
              }
            }
          }
        return true;
      }
      else{
        return false;
      }
    }
    public boolean take(int fromX, int fromY, int toX, int toY) {
      int stepX = 0;
      int stepY = 0;
       if(Gameboard.gameBoard[fromX][fromY] == 1){
          if((toY-fromY) == 2){
            if(((fromX-toX)==2)||((fromX-toX)==-2)){
              if(Gameboard.gameBoard[toX][toY]==0){
                stepX = (toX - fromX);
                stepX = stepX+fromX;
                stepY = (toY-fromY);
                stepY = stepY + fromY;
                if((toX-fromX)){
                  
                }
                Gameboard.gameBoard[toX][toY] = Gameboard.gameBoard[fromX][fromY];
                Gameboard.gameBoard[fromX][fromY] = 0;
                Gameboard.gameBoard[stepX][stepY] = 0;
              }
            }
          }
          return true;
        }
      else if(Gameboard.gameBoard[fromX][fromY] == -1){
          if((fromY-toY) == 2){
            if(((fromX-toX)==2)||((fromX-toX)==-2)){
              if(Gameboard.gameBoard[toX][toY]==0){
                Gameboard.gameBoard[toX][toY] = Gameboard.gameBoard[fromX][fromY];
                Gameboard.gameBoard[fromX][fromY] = 0;
              }
            }
          }
        return true;
      }
      else{
        return false;
      } 
    }
}

