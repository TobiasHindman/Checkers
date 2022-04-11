import java.util.Random;
public class Computer {
  Random rand = new Random();
  int col;
  int row;
  Player computer = new Player();
  public void move(String color){
    if(computer.jump(color)){
        System.out.println("The computer jumped");
    }
    else{
      boolean flag = true;
      while(flag){
        col = rand.nextInt(8);
        row = rand.nextInt(8);
        if(Gameboard.gameBoard[col][row] == 1){
          if((col-1) > -1 && (row+1)<8){
            if(Gameboard.gameBoard[col-1][row+1] == 0){
              Gameboard.gameBoard[col-1][row+1] = 1;
              Gameboard.gameBoard[col][row] = 0;
              flag = false;
              try
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
          else if((col+1) < 8 && (row+1)<8){
            if(Gameboard.gameBoard[col+1][row+1] == 0){
              Gameboard.gameBoard[col+1][row+1] = 1;
              Gameboard.gameBoard[col][row] = 0;
              flag = false;
              try
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
        else if(Gameboard.gameBoard[col][row] == -1){
          if((col-1) > -1 && (row-1)> -1){
            if(Gameboard.gameBoard[col-1][row-1] == 0){
              Gameboard.gameBoard[col-1][row-1] = -1;
              Gameboard.gameBoard[col][row] = 0;
              flag = false;
              try
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
          else if((col+1) < 8 && (row-1)>-1){
            if(Gameboard.gameBoard[col+1][row-1] == 0){
              Gameboard.gameBoard[col+1][row-1] = -1;
              Gameboard.gameBoard[col][row] = 0;
              flag = false;
              try
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
        else if(Gameboard.gameBoard[col][row] == 2){
          if((col-1) > -1 && (row+1)<8){
            if(Gameboard.gameBoard[col-1][row+1] == 0){
              Gameboard.gameBoard[col-1][row+1] = 2;
              Gameboard.gameBoard[col][row] = 0;
              flag = false;
              try
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
          else if((col+1) < 8 && (row+1)<8){
            if(Gameboard.gameBoard[col+1][row+1] == 0){
              Gameboard.gameBoard[col+1][row+1] = 2;
              Gameboard.gameBoard[col][row] = 0;
              flag = false;
              try
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
          if((col-1) > -1 && (row-1)> -1){
            if(Gameboard.gameBoard[col-1][row-1] == 0){
              Gameboard.gameBoard[col-1][row-1] = 2;
              Gameboard.gameBoard[col][row] = 0;
              flag = false;
              try
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
          else if((col+1) < 8 && (row-1)>-1){
            if(Gameboard.gameBoard[col+1][row-1] == 0){
              Gameboard.gameBoard[col+1][row-1] = 2;
              Gameboard.gameBoard[col][row] = 0;
              flag = false;
              try
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
        else if(Gameboard.gameBoard[col][row] == -2){
          if((col-1) > -1 && (row+1)<8){
            if(Gameboard.gameBoard[col-1][row+1] == 0){
              Gameboard.gameBoard[col-1][row+1] = -2;
              Gameboard.gameBoard[col][row] = 0;
              flag = false;
              try
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
          else if((col+1) < 8 && (row+1)<8){
            if(Gameboard.gameBoard[col+1][row+1] == 0){
              Gameboard.gameBoard[col+1][row+1] = -2;
              Gameboard.gameBoard[col][row] = 0;
              flag = false;
              try
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
          if((col-1) > -1 && (row-1)> -1){
            if(Gameboard.gameBoard[col-1][row-1] == 0){
              Gameboard.gameBoard[col-1][row-1] = -2;
              Gameboard.gameBoard[col][row] = 0;
              flag = false;
              try
              {
                Thread.sleep(500);
              }
              catch(InterruptedException ex)
              {
                  Thread.currentThread().interrupt();
              }
            }
          }
          else if((col+1) < 8 && (row-1)>-1){
            if(Gameboard.gameBoard[col+1][row-1] == 0){
              Gameboard.gameBoard[col+1][row-1] = -2;
              Gameboard.gameBoard[col][row] = 0;
              flag = false;
              try
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

