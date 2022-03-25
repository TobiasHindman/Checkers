import java.util.*;
public class Main{
  public static void main(String[] args) {
    Gameboard myBoard = new Gameboard();
    myBoard.drawBoard();
    boolean hasWon = false;
    int count = 0;
    String p1Name;
    String p2Name;
    String p1Color;
    String p2Color;
    Scanner kb = new Scanner(System.in);
    System.out.println("Player 1, please enter your name");
    p1Name = kb.nextLine();
    System.out.println(p1Name+ " please enter the color you wish to be, type \"red\" for red, and \"blue\" for blue");
    p1Color = kb.nextLine().toLowerCase();
    Player player1 = new Player(p1Name,p1Color);
    if(p1Color.equals("red")){
      p2Color = "blue";
    }
    else{
      p2Color = "red";
    }
    System.out.println("Player 2, please enter your name, or press \"c\" to play a computer");
    p1Name = kb.nextLine();
    if(p1Name.equals("c")){
      Player player2 = new Player("Computer", p2Color);
    }
    else{
      Player player2 = new Player(p2Name, p2Color);
    }
    
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