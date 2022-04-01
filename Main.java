import java.util.*;
public class Main {
  public static void main(String[] args) {
    Gameboard myBoard = new Gameboard();
    Computer computer = new Computer();
    myBoard.drawBoard();
    boolean hasWon = false;
    String fromC;
    String toC;
    String input;
    int count = 0;
    String p1Name;
    String p2Name;
    String p1Color;
    String p2Color;

    Scanner kb = new Scanner(System.in());
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
    p2Name = kb.nextLine();
    if(p1Name.equals("c")){
      Player player2 = new Player("Computer", p2Color);
    }
    else{
      Player player2 = new Player(p2Name, p2Color);
    }
    try
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
    System.out.println("How to play:\nWhen prompted for your move, first enter the current coordinate of the piece you want to move, followed by the coordinate you want to move to. ex: (c1b2) do not include spaces in your answer\nThe game will automatically double jump for you");
    try
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
    if (p1.name.equals("c")|| p2.name.equals("c")) {
      while(hasWon = false){
        if((count%2)==0){
          System.out.println(p1Name+" please enter your move");
          input = kb.nextLine();
          fromC = input.substring(0,1);
          toC = input.substring(1);
          player1.move(fromC, toC);
          myBoard.drawBoard();
        }
        else{
          System.out.println(p2Name+" please enter your move");
          input = kb.nextLine();
          int[] fromMove = new int [2];
          fromMove = computer.fromMove();
          fromC = String.valueOf(fromMove[0]);
          fromC += String.valueOf(fromMove[1]);
          int[] nextMove = new int [2];
          fromMove = computer.nextMove();
          toC = String.valueOf(nextMove[0]);
          toC += String.valueOf(fromMove[1]);
          player2.move(fromC, toC);
          myBoard.drawBoard();
        }
        count++;
      }
    }
    else {
      while(hasWon = false){

    if(player2.getName() != "c"){
      while(hasWon == false){
        System.out.println("first check");
        if((count%2)==0){
          System.out.println(p1Name+" please enter your move");
          input = kb.nextLine();
          fromC = input.substring(0,1);
          toC = input.substring(1);
          player1.move(fromC, toC);
          myBoard.drawBoard();
        }
        else{
          System.out.println(p2Name+" please enter your move");
          input = kb.nextLine();
          fromC = input.substring(0,1);
          toC = input.substring(1);
          player2.move(fromC, toC);
          myBoard.drawBoard();
        }
        count++;
      }
    }
  }
}
  }
}
