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
  public boolean move(String fromC, String toC){
    int fromX = (int) fromC.charAt(0);
    fromX -= 97;
    int fromY = (int) Integer.parseInt(fromC.substring(1));
    fromY -= 1;
    int toX = (int) toC.charAt(0);
    toX -= 97;
    int toY = (int) Integer.parseInt(toC.substring(1));
    toY -= 1;
    if((toX-fromX) == 2 || (fromX-toX) == 2){
      if(pieces.take(fromX, fromY, toX, toY)){
        pieces.take(fromX, fromY, toX, toY);
        return canMove;
      }
      else{
        return canMove;
      }
    }
    else if((toX-fromX) == 1 || (fromX-toX) == 1){
      if(pieces.move(fromX, fromY, toX, toY)){
        pieces.move(fromX, fromY, toX, toY);
        return canMove;
      }
      else{
        return canMove;
      }
    }
    else{
      return canMove;
    }
  }
}