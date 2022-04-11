import java.util.*;
//import util
public class Player//player class
{
  private String currentPlayer;
  private Scanner kb = new Scanner(System.in);
  private String playerColor;
  private int numCheckers;
  boolean canMove = false;
  Piece pieces = new Piece();
  //variable declarations
  public Player(){//default contructor
  }
  public Player(String player, String color)//overloaded constructor
  {
    currentPlayer = player;
    playerColor = color;
    numCheckers = 12;
  }
  public String getName(){//getName method
    return currentPlayer;//return player name
  }
  public boolean jump(String c){//jump method
    boolean flag = true;
    for(int col = 0; col < 8; col++){
      for(int row = 0;row < 8; row++){//iterate through the array
        if(Gameboard.gameBoard[col][row] == 1){//if blue piece
          if((col-2) > -1 && (row+2)<8){//can jump -+
            if(Gameboard.gameBoard[col-1][row+1] < 0 && Gameboard.gameBoard[col-2][row+2] == 0){//check move
              Gameboard.gameBoard[col-2][row+2] = 1;
              Gameboard.gameBoard[col-1][row+1] = 0;
              Gameboard.gameBoard[col][row] = 0;
              //make the jump
              while(flag){//check for double jump
                if(doubleJump(col-2,row+2)){
                  flag = true;
                }
                else{
                  flag = false;
                }
              }
              flag = true;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
            }
          }
          else if((col+2) < 8 && (row+2)<8){//can jump ++
            if(Gameboard.gameBoard[col+1][row+1] < 0 && Gameboard.gameBoard[col+2][row+2] == 0){//if valid jump
              Gameboard.gameBoard[col+2][row+2] = 1;
              Gameboard.gameBoard[col+1][row+1] = 0;
              Gameboard.gameBoard[col][row] = 0;
              //make the jump
              while(flag){//check doublejump
                if(doubleJump(col+2,row+2)){
                  flag = true;
                }
                else{
                  flag = false;
                }
              }
              flag = true;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
            }
          }
        }
        else if(Gameboard.gameBoard[col][row] == -1 ){//if red piece
          if((col-2) > -1 && (row-2)>-1){//can move --
            if(Gameboard.gameBoard[col-1][row-1] > 0 && Gameboard.gameBoard[col-2][row-2] == 0){//check jump
              Gameboard.gameBoard[col-2][row-2] = -1;
              Gameboard.gameBoard[col-1][row-1] = 0;
              Gameboard.gameBoard[col][row] = 0;
              //make jump
              while(flag){//check for doublejump
                if(doubleJump(col-2,row-2)){
                  flag = true;
                }
                else{
                  flag = false;
                }
              }
              flag = true;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
            }
          }
          else if((col+2) < 8 && (row-2)>-1){//can jump +-
            if(Gameboard.gameBoard[col+1][row-1] > 0 && Gameboard.gameBoard[col+2][row-2] == 0){//check jump
              Gameboard.gameBoard[col+2][row-2] = -1;
              Gameboard.gameBoard[col+1][row-1] = 0;
              Gameboard.gameBoard[col][row] = 0;
              //make the jump
              while(flag){//check doublejump
                if(doubleJump(col+2,row-2)){
                  flag = true;
                }
                else{
                  flag = false;
                }
              }
              flag = true;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
            }
          }
        }
        else if(Gameboard.gameBoard[col][row] == 2 ){//if blue king
          if((col-2) > -1 && (row+2)<8){//check for -+
            if(Gameboard.gameBoard[col-1][row+1] < 0 && Gameboard.gameBoard[col-2][row+2] == 0){//if valid jump
              Gameboard.gameBoard[col-2][row+2] = 2;
              Gameboard.gameBoard[col-1][row+1] = 0;
              Gameboard.gameBoard[col][row] = 0;
              //make the jump
              while(flag){//check for doublejump
                if(doubleJump(col-2,row+2)){
                  flag = true;
                }
                else{
                  flag = false;
                }
              }
              flag = true;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
            }
          }
          else if((col+2) < 8 && (row+2)<8){//if jump ++
            if(Gameboard.gameBoard[col+1][row+1] < 0 && Gameboard.gameBoard[col+2][row+2] == 0){//if valid jump
              Gameboard.gameBoard[col+2][row+2] = 2;
              Gameboard.gameBoard[col+1][row+1] = 0;
              Gameboard.gameBoard[col][row] = 0;
              //make the jump
              while(flag){//if you can doublejump
                if(doubleJump(col+2,row+2)){
                  flag = true;
                }
                else{
                  flag = false;
                }
              }
              flag = true;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
            }
          }
          else if((col+2) < 8 && (row-2)>-1){//if valid +- jump
            if(Gameboard.gameBoard[col+1][row-1] < 0 && Gameboard.gameBoard[col+2][row-2] == 0){//if valid jump
              Gameboard.gameBoard[col+2][row-2] = 2;
              Gameboard.gameBoard[col+1][row-1] = 0;
              Gameboard.gameBoard[col][row] = 0;
              //make the jump
              while(flag){//check for doublejump
                if(doubleJump(col+2,row-2)){
                  flag = true;
                }
                else{
                  flag = false;
                }
              }
              flag = true;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
            }
          }
          else if((col-2) > -1 && (row-2) > -1){//if valid jump --
            if(Gameboard.gameBoard[col-1][row-1] < 0 && Gameboard.gameBoard[col-2][row-2] == 0){//if valid jump
              Gameboard.gameBoard[col-2][row-2] = 2;
              Gameboard.gameBoard[col-1][row-1] = 0;
              Gameboard.gameBoard[col][row] = 0;
              //make the jump
              while(flag){//check for doublejump
                if(doubleJump(col-2,row-2)){
                  flag = true;
                }
                else{
                  flag = false;
                }
              }
              flag = true;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
            }
          }
        }
        else if(Gameboard.gameBoard[col][row] == -2 ){//if red king
          if((col-2) > -1 && (row+2)<8){//check for jump -+
            if(Gameboard.gameBoard[col-1][row+1] > 0 && Gameboard.gameBoard[col-2][row+2] == 0){//if valid jump
              Gameboard.gameBoard[col-2][row+2] = -2;
              Gameboard.gameBoard[col-1][row+1] = 0;
              Gameboard.gameBoard[col][row] = 0;
              //make the jump
              while(flag){//check for doublejump
                if(doubleJump(col-2,row+2)){
                  flag = true;
                }
                else{
                  flag = false;
                }
              }
              flag = true;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
            }
          }
          else if((col+2) < 8 && (row+2)<8){//if valid jump ++
            if(Gameboard.gameBoard[col+1][row+1] > 0 && Gameboard.gameBoard[col+2][row+2] == 0){//if valid jump
              Gameboard.gameBoard[col+2][row+2] = -2;
              Gameboard.gameBoard[col+1][row+1] = 0;
              Gameboard.gameBoard[col][row] = 0;
              //make the jump
              while(flag){//check for doublejump
                if(doubleJump(col+2,row+2)){
                  flag = true;
                }
                else{
                  flag = false;
                }
              }
              flag = true;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
            }
          }
          else if((col+2) < 8 && (row-2)>-1){//if valid +- jump
            if(Gameboard.gameBoard[col+1][row-1] > 0 && Gameboard.gameBoard[col+2][row-2] == 0){//if valid jump
              Gameboard.gameBoard[col+2][row-2] = -2;
              Gameboard.gameBoard[col+1][row-1] = 0;
              Gameboard.gameBoard[col][row] = 0;
              //make the jump
              while(flag){//check for doublejump
                if(doubleJump(col+2,row-2)){
                  flag = true;
                }
                else{
                  flag = false;
                }
              }
              flag = true;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
            }
          }
          else if((col-2) > -1 && (row-2) > -1){//if valid -- jump
            if(Gameboard.gameBoard[col-1][row-1] > 0 && Gameboard.gameBoard[col-2][row-2] == 0){//if valid jump
              Gameboard.gameBoard[col-2][row-2] = -2;
              Gameboard.gameBoard[col-1][row-1] = 0;
              Gameboard.gameBoard[col][row] = 0;
              //make the jump
              while(flag){//check for doublejump
                if(doubleJump(col-2,row-2)){
                  flag = true;
                }
                else{
                  flag = false;
                }
              }
              flag = true;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  public boolean doubleJump(int col, int row){//doubleJump class to double jump
    if(Gameboard.gameBoard[col][row] == 1){//if blue piece
          if((col-2) > -1&& (row+2)<8 && Gameboard.gameBoard[col-1][row+1] < 0 && Gameboard.gameBoard[col-2][row+2] == 0){//check for a valid -+ jump
              Gameboard.gameBoard[col-2][row+2] = 1;
              Gameboard.gameBoard[col-1][row+1] = 0;
              Gameboard.gameBoard[col][row] = 0;
            //make the jump
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
          }
          else if((col+2) < 8&& (row+2)<8 && Gameboard.gameBoard[col+1][row+1] < 0 && Gameboard.gameBoard[col+2][row+2] == 0){//check for a valid ++ jump
              Gameboard.gameBoard[col+2][row+2] = 1;
              Gameboard.gameBoard[col+1][row+1] = 0;
              Gameboard.gameBoard[col][row] = 0;
            //make the jump
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
          }
    }
    else if(Gameboard.gameBoard[col][row] == -1){//if red piece
      if((col-2) > -1 && (row-2)>-1 && Gameboard.gameBoard[col-1][row-1] > 0 && Gameboard.gameBoard[col-2][row-2] == 0){//check for a valid -- jump
              Gameboard.gameBoard[col-2][row-2] = -1;
              Gameboard.gameBoard[col-1][row-1] = 0;
              Gameboard.gameBoard[col][row] = 0;
            //make the jump
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
          }
          else if((col+2) < 8 && (row-2)>-1 && Gameboard.gameBoard[col+1][row-1] > 0 && Gameboard.gameBoard[col+2][row-2] == 0){//check for a valid +- jump
              Gameboard.gameBoard[col+2][row-2] = -1;
              Gameboard.gameBoard[col+1][row-1] = 0;
              Gameboard.gameBoard[col][row] = 0;
            //make the jump
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
          }
    }
    else if(Gameboard.gameBoard[col][row] == 2){//if blue king
      if((col-2) > -1 && (row-2)>-1 && Gameboard.gameBoard[col-1][row-1] < 0 && Gameboard.gameBoard[col-2][row-2] == 0){//check for valid -- jump
              Gameboard.gameBoard[col-2][row-2] = 2;
              Gameboard.gameBoard[col-1][row-1] = 0;
              Gameboard.gameBoard[col][row] = 0;
            //make the jump
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
          }
          else if((col+2) < 8 && (row-2)>-1 && Gameboard.gameBoard[col+1][row-1] < 0 && Gameboard.gameBoard[col+2][row-2] == 0){//check for valid +- jump
              Gameboard.gameBoard[col+2][row-2] = 2;
              Gameboard.gameBoard[col+1][row-1] = 0;
              Gameboard.gameBoard[col][row] = 0;
            //make the jump
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
          }
      if((col-2) > -1&& (row+2)<8 && Gameboard.gameBoard[col-1][row+1] < 0 && Gameboard.gameBoard[col-2][row+2] == 0){//check for valid -+ jump
              Gameboard.gameBoard[col-2][row+2] = 2;
              Gameboard.gameBoard[col-1][row+1] = 0;
              Gameboard.gameBoard[col][row] = 0;
            //make the jump
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
          }
          else if((col+2) < 8&& (row+2)<8 && Gameboard.gameBoard[col+1][row+1] < 0 && Gameboard.gameBoard[col+2][row+2] == 0){//check for valid ++ jump
              Gameboard.gameBoard[col+2][row+2] = 2;
              Gameboard.gameBoard[col+1][row+1] = 0;
              Gameboard.gameBoard[col][row] = 0;
            //make the jump
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
          }
    }
    else if(Gameboard.gameBoard[col][row] == -2){//if red king
      if((col-2) > -1 && (row-2)>-1 && Gameboard.gameBoard[col-1][row-1] > 0 && Gameboard.gameBoard[col-2][row-2] == 0){//check for valid -- jump
              Gameboard.gameBoard[col-2][row-2] = -2;
              Gameboard.gameBoard[col-1][row-1] = 0;
              Gameboard.gameBoard[col][row] = 0;
            //make the jump
              try//add delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
          }
          else if((col+2) < 8 && (row-2)>-1 && Gameboard.gameBoard[col+1][row-1] > 0 && Gameboard.gameBoard[col+2][row-2] == 0){//check for valid +- jump
              Gameboard.gameBoard[col+2][row-2] = -2;
              Gameboard.gameBoard[col+1][row-1] = 0;
              Gameboard.gameBoard[col][row] = 0;
            //make the jump
              try//add delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
          }
      if((col-2) > -1&& (row+2)<8 && Gameboard.gameBoard[col-1][row+1] > 0 && Gameboard.gameBoard[col-2][row+2] == 0){//check for valid -+ jump
              Gameboard.gameBoard[col-2][row+2] = -2;
              Gameboard.gameBoard[col-1][row+1] = 0;
              Gameboard.gameBoard[col][row] = 0;
            //make the jump
              try//add delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
          }
          else if((col+2) < 8&& (row+2)<8 && Gameboard.gameBoard[col+1][row+1] > 0 && Gameboard.gameBoard[col+2][row+2] == 0){//check for valid ++ jump
              Gameboard.gameBoard[col+2][row+2] = -2;
              Gameboard.gameBoard[col+1][row+1] = 0;
              Gameboard.gameBoard[col][row] = 0;
            //make the jump
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
              return true;
          }
    }
    return false;
  }
  public boolean move(String fromC, String toC, String Color){//move method to pass into Piece class
    int fromX = (int) fromC.charAt(0);
    fromX -= 97;//convert X coordinate letters to numbers
    int fromY = (int) Integer.parseInt(fromC.substring(1));
    fromY -= 1;
    int toX = (int) toC.charAt(0);
    toX -= 97;//convert X coordinate letters to numbers
    int toY = (int) Integer.parseInt(toC.substring(1));
    toY -= 1;
    if((toX-fromX) == 2 || (fromX-toX) == 2){//if its a jump move
      if(pieces.take(fromX, fromY, toX, toY, Color)){
        pieces.take(fromX, fromY, toX, toY, Color);//call take method
        canMove=true;
      }
      else{
        canMove = false;
      }
    }
    else if((toX-fromX) == 1 || (fromX-toX) == 1){//if its a normal move
      if(pieces.move(fromX, fromY, toX, toY, Color)){
        pieces.move(fromX, fromY, toX, toY, Color);//call the move method
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