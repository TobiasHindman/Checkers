public class Main{
  public static void main(String[] args) {
    Gameboard myBoard = new Gameboard();
    myBoard.drawBoard();
    Player player1 = new Player();
    Player player2 = new Player();
    boolean hasWon = false;
    int count = 0;
    while(hasWon){
      if((count%2)==0){
        //player 1's code
      }
      else{
        //player 2's code
      }
      count++;
    }
  }
}