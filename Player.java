import java.util.*;

public class Player
{
  //private Gameboard board;
  private String currentPlayer;
  private Scanner kb = new Scanner(System.in);
  private String playerColor;
  private int numCheckers;
  Piece pieces = new Piece();

  public Player(String player, String color)
  {
    currentPlayer = player;
    playerColor = color;
    numCheckers = 12;
  }
  public boolean move(String fromC, String toC)
  {
    boolean result = true;
    int fromX = (int) fromC.charAt(0);
    fromX -= 96;
    int fromY = (int) Integer.parseInt(fromC.substring(1));
    int toX = (int) toC.charAt(0);
    toX-= 96;
    int toY = (int) Integer.parseInt(toC.substring(1));
    if((toX-fromX) == 2 || (fromX-toX) == 2){//start if jump
      if(pieces.checkTake(fromX, fromY, toX, toY)){//check the jump
        pieces.take(fromX, fromY, toX, toY);//make the jump
        result = true;
      }
      else{
        result = false;
      }
    }//end if jump
    else if((toX-fromX) == 1 || (fromX-toX) == 1){//start if move
      if(pieces.checkMove(fromX, fromY, toX, toY)){//check the move
        pieces.move(fromX, fromY, toX, toY);//move the piece
        result = true;
      }
      else{
        result = false;
      }
    }//end if move
    return result;
  }
}
