public class Piece {//Piece class
Gameboard currentGameBoard = new Gameboard();
    public String color;
    public boolean isKing;
  //declare variables
    public boolean move(int fromX, int fromY, int toX, int toY, String c) {//move method
        if(Gameboard.gameBoard[fromX][fromY] == 1 && c.equals("blue")){//if blue piece
          if((toY-fromY) == 1){
            if(((fromX-toX)==1)||((fromX-toX)==-1)){
              if(Gameboard.gameBoard[toX][toY]==0){//check for move
                Gameboard.gameBoard[toX][toY] = Gameboard.gameBoard[fromX][fromY];
                Gameboard.gameBoard[fromX][fromY] = 0;
                return true;
                //do the move
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
      else if(Gameboard.gameBoard[fromX][fromY] == -1 && c.equals("red")){//if red piece
          if((fromY-toY) == 1){
            if(((fromX-toX)==1)||((fromX-toX)==-1)){
              if(Gameboard.gameBoard[toX][toY]==0){//check for move
                Gameboard.gameBoard[toX][toY] = Gameboard.gameBoard[fromX][fromY];
                Gameboard.gameBoard[fromX][fromY] = 0;
                return true;
                //make the move
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
      else if(Gameboard.gameBoard[fromX][fromY] == -2 && c.equals("red")){//if red king
          if((fromY-toY) == 1 || (toY-fromY) == 1){
            if(((fromX-toX)==1)||((fromX-toX)==-1)){
              if(Gameboard.gameBoard[toX][toY]==0){//check for move
                Gameboard.gameBoard[toX][toY] = Gameboard.gameBoard[fromX][fromY];
                Gameboard.gameBoard[fromX][fromY] = 0;
                return true;
                //make the move
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
      else if(Gameboard.gameBoard[fromX][fromY] == 2 && c.equals("blue")){//if blue king
          if((fromY-toY) == 1 || (toY-fromY) == 1) {
            if(((fromX-toX)==1)||((fromX-toX)==-1)){
              if(Gameboard.gameBoard[toX][toY]==0){//check for move
                Gameboard.gameBoard[toX][toY] = Gameboard.gameBoard[fromX][fromY];
                Gameboard.gameBoard[fromX][fromY] = 0;
                return true;
                //make the move
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
    public boolean take(int fromX, int fromY, int toX, int toY, String c) {//jump/take method
      int stepX = 0;
      int stepY = 0;
      //index variables
       if(Gameboard.gameBoard[fromX][fromY] == 1 && c.equals("blue")){//if blue piece
          if((toY-fromY) == 2 && toY < 8 && toX < 8 && toX > -1){
            if(((fromX-toX)==2)||((fromX-toX)==-2)){
              if(Gameboard.gameBoard[toX][toY]==0){//check for jump
                if((toX-fromX)<0){
                  stepX = -1;
                }
                else{
                  stepX = 1;
                }
                if((toY-fromY)<0){
                  stepY = -1;
                }
                else{
                  stepY = 1;
                }
                stepX = stepX+fromX;
                stepY = stepY + fromY;
                if(Gameboard.gameBoard[stepX][stepY] > 0){//dont jump blue pieces
                  return false;
                }
                Gameboard.gameBoard[toX][toY] = Gameboard.gameBoard[fromX][fromY];
                Gameboard.gameBoard[fromX][fromY] = 0;
                Gameboard.gameBoard[stepX][stepY] = 0;
                return true;
                //make the jump
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
      else if(Gameboard.gameBoard[fromX][fromY] == -1 && c.equals("red")&& toY > -1 && toX < 8 && toX > -1){//if red piece
          if((toY-fromY) == -2){
            if(((fromX-toX)==2)||((fromX-toX)==-2)){
              if(Gameboard.gameBoard[toX][toY]==0){//check for the jump
                if((toX-fromX)<0){
                  stepX = -1;
                }
                else{
                  stepX = 1;
                }
                if((toY-fromY)<0){
                  stepY = -1;
                }
                else{
                  stepY = 1;
                }
                stepX = stepX+fromX;
                stepY = stepY + fromY;
                if(Gameboard.gameBoard[stepX][stepY] < 0){//dont jump red pieces
                  return false;
                }
                Gameboard.gameBoard[toX][toY] = Gameboard.gameBoard[fromX][fromY];
                Gameboard.gameBoard[fromX][fromY] = 0;
                Gameboard.gameBoard[stepX][stepY] = 0;
                return true;
                //make the jump
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
        else if(Gameboard.gameBoard[fromX][fromY] == 2 && c.equals("blue") && toY < 8 && toY > -1 && toX < 8 && toX > -1){//if blue king
          if((toY-fromY) == 2 || (toY-fromY) == -2){
            if(((fromX-toX)==2)||((fromX-toX)==-2)){
              if(Gameboard.gameBoard[toX][toY]==0){//check for the jump
                if((toX-fromX)<0){
                  stepX = -1;
                }
                else{
                  stepX = 1;
                }
                if((toY-fromY)<0){
                  stepY = -1;
                }
                else{
                  stepY = 1;
                }
                stepX = stepX+fromX;
                stepY = stepY + fromY;
                if(Gameboard.gameBoard[stepX][stepY] > 0){//dont jump on blue pieces
                  return false;
                }
                Gameboard.gameBoard[toX][toY] = Gameboard.gameBoard[fromX][fromY];
                Gameboard.gameBoard[fromX][fromY] = 0;
                Gameboard.gameBoard[stepX][stepY] = 0;
                return true;
                //make the jump
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
          else if(Gameboard.gameBoard[fromX][fromY] == -2 && c.equals("red")&& toY < 8 && toY > -1 && toX < 8 && toX > -1){//if red king
          if((toY-fromY) == 2 || (toY-fromY) == -2){
            if(((fromX-toX)==2)||((fromX-toX)==-2)){
              if(Gameboard.gameBoard[toX][toY]==0){//check the jump
                if((toX-fromX)<0){
                  stepX = -1;
                }
                else{
                  stepX = 1;
                }
                if((toY-fromY)<0){
                  stepY = -1;
                }
                else{
                  stepY = 1;
                }
                stepX = stepX+fromX;
                stepY = stepY + fromY;
                if(Gameboard.gameBoard[stepX][stepY] <0){//dont jump on red pieces
                  return false;
                }
                Gameboard.gameBoard[toX][toY] = Gameboard.gameBoard[fromX][fromY];
                Gameboard.gameBoard[fromX][fromY] = 0;
                Gameboard.gameBoard[stepX][stepY] = 0;
                return true;
                //make the jump
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

