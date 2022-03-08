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
  public Array gameBoard = new Array[][];
  public void moveRedPiece(int x, int y){
    
  }
  public void moveBluePiece(int x,int y){
    
  }
}
