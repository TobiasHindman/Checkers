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