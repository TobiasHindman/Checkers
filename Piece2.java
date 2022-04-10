if((Gameboard.gameBoard[row-2][col] >= 0) && (Gameboard.gameBoard[row+2][col] <= 7)){
            if(Gameboard.gameBoard[row-1][col+1] < 0)               {
              pieces.take(col, row, col-2, row+2, c);
              check = true;
              break;
            }
            else if(Gameboard.gameBoard[row+1][col+1] < 0){
              pieces.take(col, row, col+2, row+2, c);
              check = true;
              break;
            }
          }
          else if(Gameboard.gameBoard[row-2][col] >= 0){
            if(Gameboard.gameBoard[row-1][col+1] < 0)               {
              pieces.take(col, row, col-2, row+2, c);
              check = true;
              break;
            }
          }
          else if(Gameboard.gameBoard[row+2][col] <= 7){
            if(Gameboard.gameBoard[row+1][col+1] < 0){
              pieces.take(col, row, col+2, row+2, c);
              check = true;
              break;
            }
          }












boolean check = false;
    for(int row = 0; row < Gameboard.gameBoard.length; row++){
      for(int col = 0;col < Gameboard.gameBoard[row].length;col++){
        if(Gameboard.gameBoard[row][col]== 0){
          continue;
        }
        else if(Gameboard.gameBoard[row][col]==1){
          try{
            if(Gameboard.gameBoard[row-1][col+1] < 0){
              if(pieces.take(col, row, col-2, row+2, c)){
                pieces.take(col, row, col-2, row+2, c);
                return true;
              }
              else{
                check = false;
              }
            }
          }
          catch(Exception e){
          }
          try{
            if(Gameboard.gameBoard[row+1][col+1]<0){
              if(pieces.take(col, row, col+2, row+2, c)){
                pieces.take(col, row, col+2, row+2, c);
                return true;
              }
              else{
                check = false;
              }
            }
          }
          catch(Exception e){
            
          }
        }
        else if(Gameboard.gameBoard[row][col]== -1){
          try{
            if(Gameboard.gameBoard[row-1][col-1] > 0){
              if(pieces.take(col, row, col-2, row-2, c)){
                pieces.take(col, row, col-2, row-2, c);
                return true;
              }
              else{
                check = false;
              }
            }
          }
          catch(Exception e){
          }
          try{
            if(Gameboard.gameBoard[row+1][col-1]>0){
              if(pieces.take(col, row, col+2, row-2, c)){
                pieces.take(col, row, col+2, row-2, c);
                return true;
              }
              else{
                check = false;
              }
            }
          }
          catch(Exception e){
            
          }
        }
      }
    }
    return check;



if(c == "blue"){//if blue turn
          if(Gameboard.gameBoard[col][row]==1){
            if(pieces.take(col,row,col-2,row+2,"blue") && Gameboard.gameBoard[col-1][row+1] < 0){
              System.out.println(""+col+row+" b1to "+ (col-2)+(row+2));
              pieces.take(col,row,col-2,row+2,"blue");
              return true;
            }
            else if(pieces.take(col,row,col+2,row+2,"blue")&& Gameboard.gameBoard[col+1][row+1] < 0){
              System.out.println(""+col+row+" b2to "+ (col+2)+(row+2));
              pieces.take(col,row,col+2,row+2,"blue");
              return true;
            }
            else{
              continue;
            }
          }
          /*else if(Gameboard.gameBoard[col][row]== 2){

          }*/
          else{
            continue;
          }
        }
        else{//if red turn
          if(Gameboard.gameBoard[col][row]== -1){
            if(pieces.take(col,row,col-2,row-2,"red")&& Gameboard.gameBoard[col-1][row-1] > 0){
              System.out.println(""+col+row+" r1to "+ (col-2)+(row-2));
              pieces.take(col,row,col-2,row-2,"red");
              return true;
            }
            else if(pieces.take(col,row,col+2,row-2,"red")&& Gameboard.gameBoard[col+1][row-1] > 0){
              System.out.println(""+col+row+" r2to "+ (col+2)+(row-2));
              pieces.take(col,row,col+2,row-2,"red");
              return true;
            }
            else{
              continue;
            }
          }
          /*else if(Gameboard.gameBoard[col][row]== -2){
  
          }*/
          else{
            continue;
          }
        }