import java.awt.*;
public class Gameboard {
  public static int[][] gameBoard = {{1,0,1,0,0,0,-1,0},{0,1,0,0,0,-1,0,-1},{1,0,1,0,0,0,-1,0},{0,1,0,0,0,-1,0,-1},{1,0,1,0,0,0,-1,0},{0,1,0,0,0,-1,0,-1},{1,0,1,0,0,0,-1,0},{0,1,0,0,0,-1,0,-1}};
  public void drawBoard(){
    Frame gFrame = new Frame();
    gFrame.add(new makeBoard(gameBoard));
    gFrame.setSize(500,500);
    gFrame.setVisible(true);
  }  
  /*public void setBoard(int[][] a){
    gameBoard = a;
  }*/
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

  public String checkWin(){
    for(int row = 0; row < arr.length; row++){
      for(int col = 0;col < arr[row].length;col++)            {
        if((arr[row][col] != 1) && (arr[row][col]!= 2))
        {
          return "Blue wins";
        }
        if((arr[row][col] != -1) && (arr[row][col]!= -2))
        {
          return "Red wins";
        }
      }
    }
    return "No win";
  }
}

