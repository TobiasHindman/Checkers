import java.awt.*;
import java.swing.*;
public class GameBoard {
  JFrame frame = new JFrame("My Drawing");
  Jpanel panel1 = new Jpanel();
  frame.setSize(400, 400);
  //panel1.setSize(300,300);
  frame.setVisible(true);
  //panel1.setVisible(true);
  public void generateBoard(Graphics g){
    g.setColor(Color.BLACK);
    g.drawRect(200,200,300,300);
    g.setColor(Color.WHITE);
    g.drawRect(65,65,30,30);
    g.drawRect(130,65,30,30);
    g.drawRect(195,65,30,30);
    g.drawRect(260,65,30,30);
    g.drawRect(325,65,30,30);
  }  
  public int[] gameBoard = new int[8][8];
  public boolean moveRedPiece(Piece x, int fromX, int fromY, int toX, int toY){
    if(toX==(fromX+1)||toX==(fromX-1)){//if they only move by one
      if(toX<gameBoard.length){//check for out of bounds
        
      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
    if(toY==(fromY+1)){//if they only move by one
      if(toY<gameBoard[row].length){//check for out of bounds
        
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
  public boolean moveBluePiece(Piece x){
    
  }
}

