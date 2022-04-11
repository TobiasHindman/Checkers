import java.awt.*;//imports
public class Gameboard {//Gameboard class
  static int[][] gameBoard = {{1,0,1,0,0,0,-1,0},{0,1,0,0,0,-1,0,-1},{1,0,1,0,0,0,-1,0},{0,1,0,0,0,-1,0,-1},{1,0,1,0,0,0,-1,0},{0,1,0,0,0,-1,0,-1},{1,0,1,0,0,0,-1,0},{0,1,0,0,0,-1,0,-1}};
  //create the static array with starting positions
  public void drawBoard(){//drawBoard method
    Frame gFrame = new Frame();
    gFrame.add(new makeBoard(gameBoard));//calls makeBoard to generate board
    gFrame.setSize(500,500);
    gFrame.setVisible(true);
  }  
  public boolean moveRedPiece(int fromX, int fromY, int toX, int toY)  {
    if(toX==(fromX+1)||toX==(fromX-1)){//if they only move by one
      if(toX<gameBoard.length && toX>0){//check for out of bounds
        if(toY==(fromY+1)){//if they only move by one
          if(toY<gameBoard[0].length && toY>0){//check for out of bounds
            if(gameBoard[fromY][fromX] == 0){
              gameBoard[toY][toX] = gameBoard[fromY][fromX];
              gameBoard[fromY][fromX] = 0;
            }
            else{
              return false;
            }
          }
          else{
            return false;
          }
        }
        else{
          return false;
        }
      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
    return false;
  }
  public boolean moveBluePiece(int fromX, int fromY, int toX, int toY){
    if(toX==(fromX+1)||toX==(fromX-1)){//if they only move by one
      if(toX<gameBoard.length && toX>0){//check for out of bounds
        if(toY==(fromY+1)){//if they only move by one
          if(toY<gameBoard[0].length && toY>0){//check for out of bounds
            if(gameBoard[fromY][fromX] == 0){
              gameBoard[toY][toX] = gameBoard[fromY][fromX];
              gameBoard[fromY][fromX] = 0;
            }
            else{
              return false;
            }
          }
          else{
            return false;
          }
        }
        else{
          return false;
        }
      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
    return false;
  }

  public String checkWin(){//checkWin method
    int blueCount = 0;
    int redCount = 0;
    //counter variables
    for(int row = 0; row < gameBoard.length; row++){
      for(int col = 0;col < gameBoard[row].length;col++){//iterate through array
        if(Gameboard.gameBoard[row][col] == 1 || Gameboard.gameBoard[row][col] == 2)
        {//check for blue pieces
          blueCount++;
        }
        if(Gameboard.gameBoard[row][col] == -1 || Gameboard.gameBoard[row][col] == -2)
        {//check for red pieces
          redCount++;
        }
      }
    }
    if(blueCount == 0){//return if red wins
      return "RED WINS";
    }
    else if(redCount == 0){//return if blue wins
      return "BLUE WINS";
    }
    else{
      return "nothing";
    }
  }
  public void checkKing(){//checkKing method
    for(int row = 0; row < 8; row++){
      for(int col = 0;col < 8;col++){//iterate through the array
        if(col == 0 && Gameboard.gameBoard[row][col] == -1){//check for pieces on the end of board
          Gameboard.gameBoard[row][col] = -2;//make it a king
        }
        if(col == 7 && Gameboard.gameBoard[row][col] == 1){//check for pieces on the end of board
          Gameboard.gameBoard[row][col] = 2;//make it a king
        }
      }
    }
  }
}

