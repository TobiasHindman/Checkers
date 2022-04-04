// 1 is blue, -1 is red
public class Piece2 {
    Gameboard currentGameBoard = new Gameboard();
    //private int xindex;
    //private int yindex;
    public String color;
    public boolean isKing;
    public boolean move(int fromX, int fromY, int toX, int toY) {
        if(Gameboard.gameBoard[fromX][fromY] == 1){
          if((toY-fromY) == 1){
            if(((fromX-toX)==1)||((fromX-toX)==-1)){
              if(Gameboard.gameBoard[toX][toY]==0){
                Gameboard.gameBoard[toX][toY] = Gameboard.gameBoard[fromX][fromY];
                Gameboard.gameBoard[fromX][fromY] = 0;
              }
            }
          }
          return true;
        }
      else if(Gameboard.gameBoard[fromX][fromY] == -1){
          if((fromY-toY) == 1){
            if(((fromX-toX)==1)||((fromX-toX)==-1)){
              if(Gameboard.gameBoard[toX][toY]==0){
                Gameboard.gameBoard[toX][toY] = Gameboard.gameBoard[fromX][fromY];
                Gameboard.gameBoard[fromX][fromY] = 0;
              }
            }
          }
        return true;
      }
      else{
        return false;
      }
    }
    public boolean take(int fromX, int fromY, int toX, int toY) {
        
    }
    public boolean checkMove(int fromX, int fromY, int toX, int toY){
        
    }
    public boolean checkTake(int fromX, int fromY, int toX, int toY){
        
    }
    public boolean checkDoubleJump(int fromX, int fromY, int toX, int toY) {

    } 

}

