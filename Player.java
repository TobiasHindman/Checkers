import java.util.*;

public class Player
{
  //private Gameboard board;
  private String currentPlayer;
  private Scanner kb = new Scanner(System.in);
  private String playerColor;
  private int numCheckers;
  boolean canMove = false;
  Piece pieces = new Piece();

  public Player(String player, String color)
  {
    currentPlayer = player;
    playerColor = color;
    numCheckers = 12;
  }
  public String getName(){
    return currentPlayer;
  }
  public boolean jump(String c){
    boolean check = false;
    for(int row = 0; row < Gameboard.gameBoard.length; row++){
      for(int col = 0;col < Gameboard.gameBoard[row].length;col++){
        if(Gameboard.gameBoard[row][col]==1){
          try{
            if(Gameboard.gameBoard[row-1][col+1] < 0){
              System.out.println(row+"Blue"+ col);
              pieces.take(col, row, col-2, row+2, c);
              return true;
            }
            else if(Gameboard.gameBoard[row+1][col+1]<0){
              System.out.println(row+"Blue"+ col);
              pieces.take(col, row, col+2, row+2, c);
              return true;
            }
            else{
              check = false;
            }
          }
          catch(Exception e){
          }
        }
        else if(Gameboard.gameBoard[row][col]== -1){
          try{
            if(Gameboard.gameBoard[row-1][col-1] > 0){
              System.out.println(row+"RED1"+ col);
              pieces.take(col, row, col-2, row-2, c);
              return true;
            }
            else if(Gameboard.gameBoard[row+1][col-1]>0){
              System.out.println(row+"RED2"+ col);
              pieces.take(col, row, col+2, row-2, c);
              return true;
            }
            else{
              check = false;
            }
          }
          catch(Exception e){
          }
        }
        else if(Gameboard.gameBoard[row][col]== 0){
        }
        else{
          return false;
        }
      }
    }
    return check;
  }
  public boolean move(String fromC, String toC, String Color){
    int fromX = (int) fromC.charAt(0);
    fromX -= 97;
    int fromY = (int) Integer.parseInt(fromC.substring(1));
    fromY -= 1;
    int toX = (int) toC.charAt(0);
    toX -= 97;
    int toY = (int) Integer.parseInt(toC.substring(1));
    toY -= 1;
    if((toX-fromX) == 2 || (fromX-toX) == 2){
      if(pieces.take(fromX, fromY, toX, toY, Color)){
        pieces.take(fromX, fromY, toX, toY, Color);
        canMove=true;
      }
      else{
        canMove = false;
      }
    }
    else if((toX-fromX) == 1 || (fromX-toX) == 1){
      if(pieces.move(fromX, fromY, toX, toY, Color)){
        pieces.move(fromX, fromY, toX, toY, Color);
        canMove = true;
      }
      else{
        canMove = false;
      }
    }
    else{
      canMove = false;
    }
    return canMove;
  }
}