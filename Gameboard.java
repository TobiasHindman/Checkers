import java.awt.*;
import javax.swing.*;
public class Gameboard {
  public int[][] gameBoard = new int[8][8];
  /*
  JFrame frame1 = new JFrame("My Drawing");
  Jpanel panel1 = new Jpanel();
  frame1.setSize(500, 500);
  panel1.setSize(300,300);
  frame.setVisible(true);
  panel1.setVisible(true);
*/
  public void drawBoard(){
    Frame gFrame = new Frame;
    gFrame.add(new makeBoard());
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
    /*for(int row = 0; row < gameBoard.length; row++){
      for(int col = 0;col < gameBoard[row].length;col++){
        
      }
    }*/
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
  }
}

