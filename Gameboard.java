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
  public void generateBoard(int[][] gameboard, Graphics g){
    g.setColor(Color.BLACK);
    g.fillRect(200,200,400,400);
    g.setColor(Color.WHITE);
    g.fillRect(75,75,50,50);
    g.fillRect(175,75,30,30);
    g.fillRect(275,75,30,30);
    g.fillRect(375,75,30,30);
    g.setColor(Color.BLACK);
    g.fillRect(125,75,50,50);
    g.fillRect(225,75,30,30);
    g.fillRect(325,75,30,30);
    g.fillRect(425,75,30,30);
    g.fillRect(75,125,50,50);
    g.fillRect(175,125,30,30);
    g.fillRect(275,125,30,30);
    g.fillRect(375,125,30,30);
    g.setColor(Color.WHITE);
    g.fillRect(125,125,50,50);
    g.fillRect(225,125,30,30);
    g.fillRect(325,125,30,30);
    g.fillRect(425,125,30,30);
    g.fillRect(75,175,50,50);
    g.fillRect(175,175,30,30);
    g.fillRect(275,175,30,30);
    g.fillRect(375,175,30,30);
    g.setColor(Color.BLACK);
    g.fillRect(125,175,50,50);
    g.fillRect(225,175,30,30);
    g.fillRect(325,175,30,30);
    g.fillRect(425,175,30,30);
    g.fillRect(75,225,50,50);
    g.fillRect(175,225,30,30);
    g.fillRect(275,225,30,30);
    g.fillRect(375,225,30,30);
    g.setColor(Color.WHITE);
    g.fillRect(125,225,50,50);
    g.fillRect(225,225,30,30);
    g.fillRect(325,225,30,30);
    g.fillRect(425,225,30,30);
    g.fillRect(75,275,50,50);
    g.fillRect(175,275,30,30);
    g.fillRect(275,275,30,30);
    g.fillRect(375,275,30,30);
    g.setColor(Color.BLACK);
    g.fillRect(125,275,50,50);
    g.fillRect(225,275,30,30);
    g.fillRect(325,275,30,30);
    g.fillRect(425,275,30,30);
    g.fillRect(75,325,50,50);
    g.fillRect(175,325,30,30);
    g.fillRect(275,325,30,30);
    g.fillRect(375,325,30,30);
    g.setColor(Color.WHITE);
    g.fillRect(125,325,50,50);
    g.fillRect(225,325,30,30);
    g.fillRect(325,325,30,30);
    g.fillRect(425,325,30,30);
    g.fillRect(75,375,50,50);
    g.fillRect(175,375,30,30);
    g.fillRect(275,375,30,30);
    g.fillRect(375,375,30,30);
    g.setColor(Color.BLACK);
    g.fillRect(125,375,50,50);
    g.fillRect(225,375,30,30);
    g.fillRect(325,375,30,30);
    g.fillRect(425,375,30,30);
    g.fillRect(75,425,50,50);
    g.fillRect(175,425,30,30);
    g.fillRect(275,425,30,30);
    g.fillRect(375,425,30,30);
    g.setColor(Color.WHITE);
    g.fillRect(125,425,50,50);
    g.fillRect(225,425,30,30);
    g.fillRect(325,425,30,30);
    g.fillRect(425,425,30,30);
    for(int row = 0; row < gameboard.length; row++){
      for(int col = 0;col < gameboard[row].length;col++){
        if(gameboard[row][col]==1){
          g.setColor(Color.BLUE);
          g.drawOval((row*50)+25,(col*50)+25,50,50);
        }
        else if(gameboard[row][col]== -1){
          g.setColor(Color.RED);
          g.drawOval((row*50)+25,(col*50)+25,50,50);
        }
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