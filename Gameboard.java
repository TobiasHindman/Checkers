import java.awt.*;
import javax.swing.*;
public class Gameboard {
  JFrame frame1 = new JFrame("My Drawing");
  Jpanel panel1 = new Jpanel();
  frame1.setSize(500, 500);
  //panel1.setSize(300,300);
  frame.setVisible(true);
  //panel1.setVisible(true);
  public void generateBoard(Graphics g){
    g.setColor(Color.BLACK);
    g.drawRect(200,200,400,400);
    g.setColor(Color.WHITE);
    g.drawRect(75,75,50,50);
    g.drawRect(175,75,30,30);
    g.drawRect(275,75,30,30);
    g.drawRect(375,75,30,30);
    g.setColor(Color.BLACK);
    g.drawRect(125,75,50,50);
    g.drawRect(225,75,30,30);
    g.drawRect(325,75,30,30);
    g.drawRect(425,75,30,30);
    g.drawRect(75,125,50,50);
    g.drawRect(175,125,30,30);
    g.drawRect(275,125,30,30);
    g.drawRect(375,125,30,30);
    g.setColor(Color.WHITE);
    g.drawRect(125,125,50,50);
    g.drawRect(225,125,30,30);
    g.drawRect(325,125,30,30);
    g.drawRect(425,125,30,30);
    g.drawRect(75,175,50,50);
    g.drawRect(175,175,30,30);
    g.drawRect(275,175,30,30);
    g.drawRect(375,175,30,30);
    g.setColor(Color.BLACK);
    g.drawRect(125,175,50,50);
    g.drawRect(225,175,30,30);
    g.drawRect(325,175,30,30);
    g.drawRect(425,175,30,30);
    g.drawRect(75,225,50,50);
    g.drawRect(175,225,30,30);
    g.drawRect(275,225,30,30);
    g.drawRect(375,225,30,30);
    g.setColor(Color.WHITE);
    g.drawRect(125,225,50,50);
    g.drawRect(225,225,30,30);
    g.drawRect(325,225,30,30);
    g.drawRect(425,225,30,30);
    g.drawRect(75,275,50,50);
    g.drawRect(175,275,30,30);
    g.drawRect(275,275,30,30);
    g.drawRect(375,275,30,30);
    g.setColor(Color.BLACK);
    g.drawRect(125,275,50,50);
    g.drawRect(225,275,30,30);
    g.drawRect(325,275,30,30);
    g.drawRect(425,275,30,30);
    g.drawRect(75,325,50,50);
    g.drawRect(175,325,30,30);
    g.drawRect(275,325,30,30);
    g.drawRect(375,325,30,30);
    g.setColor(Color.WHITE);
    g.drawRect(125,325,50,50);
    g.drawRect(225,325,30,30);
    g.drawRect(325,325,30,30);
    g.drawRect(425,325,30,30);
    g.drawRect(75,375,50,50);
    g.drawRect(175,375,30,30);
    g.drawRect(275,375,30,30);
    g.drawRect(375,375,30,30);
    g.setColor(Color.BLACK);
    g.drawRect(125,375,50,50);
    g.drawRect(225,375,30,30);
    g.drawRect(325,375,30,30);
    g.drawRect(425,375,30,30);
    g.drawRect(75,425,50,50);
    g.drawRect(175,425,30,30);
    g.drawRect(275,425,30,30);
    g.drawRect(375,425,30,30);
    g.setColor(Color.WHITE);
    g.drawRect(125,425,50,50);
    g.drawRect(225,425,30,30);
    g.drawRect(325,425,30,30);
    g.drawRect(425,425,30,30);

  }  

  public int[][] gameBoard = new int[8][8];

  public void drawBoard(int[][] gameboard){
    for(int row = 0; row < gameboard.length; row++){
      for(int col = 0;col < gameboard[row].length;col++){
        
      }
    }
  }

  public boolean moveRedPiece(Piece x, int fromX, int fromY, int toX, int toY)  {
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
  public boolean moveBluePiece(Piece x){
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

