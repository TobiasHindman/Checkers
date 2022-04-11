import java.util.Random;//import Random
public class Computer {//Computer class
  Random rand = new Random();
  int col;
  int row;
  Player computer = new Player();
  //initialize variable and class instances
  public void move(String color){//general computer move method
    if(computer.jump(color)){//calls the autojump method in Player class
        System.out.println("The computer jumped");
    }
    else{//if no jump available
      boolean flag = true;
      while(flag){
        col = rand.nextInt(8);
        row = rand.nextInt(8);
        //picks a random piece coordinate
        if(Gameboard.gameBoard[col][row] == 1 && color == "blue"){//if blue piece
          if((col-1) > -1 && (row+1)<8){//check if it can move -+
            if(Gameboard.gameBoard[col-1][row+1] == 0){
              Gameboard.gameBoard[col-1][row+1] = 1;
              Gameboard.gameBoard[col][row] = 0;
              //make it move
              flag = false;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
          else if((col+1) < 8 && (row+1)<8){//check if it can move ++
            if(Gameboard.gameBoard[col+1][row+1] == 0){
              Gameboard.gameBoard[col+1][row+1] = 1;
              Gameboard.gameBoard[col][row] = 0;
              //make it move
              flag = false;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
        }
        else if(Gameboard.gameBoard[col][row] == -1 && color == "red"){//if red piece
          if((col-1) > -1 && (row-1)> -1){//check if it can move --
            if(Gameboard.gameBoard[col-1][row-1] == 0){
              Gameboard.gameBoard[col-1][row-1] = -1;
              Gameboard.gameBoard[col][row] = 0;
              //make it move
              flag = false;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
          else if((col+1) < 8 && (row-1)>-1){//check if it can move +-
            if(Gameboard.gameBoard[col+1][row-1] == 0){
              Gameboard.gameBoard[col+1][row-1] = -1;
              Gameboard.gameBoard[col][row] = 0;
              //make it move
              flag = false;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
        }
        else if(Gameboard.gameBoard[col][row] == 2 && color == "blue"){//if blue king
          if((col-1) > -1 && (row+1)<8){//check if it can move -+
            if(Gameboard.gameBoard[col-1][row+1] == 0){
              Gameboard.gameBoard[col-1][row+1] = 2;
              Gameboard.gameBoard[col][row] = 0;
              //make it move
              flag = false;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
          else if((col+1) < 8 && (row+1)<8){//check for move ++
            if(Gameboard.gameBoard[col+1][row+1] == 0){
              Gameboard.gameBoard[col+1][row+1] = 2;
              Gameboard.gameBoard[col][row] = 0;
              //make it move
              flag = false;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
          if((col-1) > -1 && (row-1)> -1){//check for move --
            if(Gameboard.gameBoard[col-1][row-1] == 0){
              Gameboard.gameBoard[col-1][row-1] = 2;
              Gameboard.gameBoard[col][row] = 0;
              //make it move
              flag = false;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
          else if((col+1) < 8 && (row-1)>-1){//check for move +-
            if(Gameboard.gameBoard[col+1][row-1] == 0){
              Gameboard.gameBoard[col+1][row-1] = 2;
              Gameboard.gameBoard[col][row] = 0;
              //make it move
              flag = false;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
        }
        else if(Gameboard.gameBoard[col][row] == -2  && color == "red"){//if red king
          if((col-1) > -1 && (row+1)<8){//check for move -+
            if(Gameboard.gameBoard[col-1][row+1] == 0){
              Gameboard.gameBoard[col-1][row+1] = -2;
              Gameboard.gameBoard[col][row] = 0;
              //make it move
              flag = false;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
          else if((col+1) < 8 && (row+1)<8){//check for move ++
            if(Gameboard.gameBoard[col+1][row+1] == 0){
              Gameboard.gameBoard[col+1][row+1] = -2;
              Gameboard.gameBoard[col][row] = 0;
              //make it move
              flag = false;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
          if((col-1) > -1 && (row-1)> -1){//check for move --
            if(Gameboard.gameBoard[col-1][row-1] == 0){
              Gameboard.gameBoard[col-1][row-1] = -2;
              Gameboard.gameBoard[col][row] = 0;
              //make it move
              flag = false;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
          else if((col+1) < 8 && (row-1)>-1){//check for move +-
            if(Gameboard.gameBoard[col+1][row-1] == 0){
              Gameboard.gameBoard[col+1][row-1] = -2;
              Gameboard.gameBoard[col][row] = 0;
              //make it move
              flag = false;
              try//delay
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
        }
      }
    }
  }
}

