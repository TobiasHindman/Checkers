import java.util.*;
public class Main {
  public static void main(String[] args) {
    Gameboard myBoard = new Gameboard();
    Computer computer = new Computer();
    myBoard.drawBoard();
    boolean checkV = true;
    boolean hasWon = false;
    boolean isComputer = false;
    String fromC;
    String toC;
    String input;
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
    System.out.println("Player 2, please enter your name, or type \"computer\" to play a computer");
    p2Name = kb.nextLine();
    if(p2Name.contains("comput")){
      isComputer = true;
    }
    Player player2 = new Player(p2Name,p2Color);
    try
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
    System.out.println("How to play:\nWhen prompted for your move, first enter the current coordinate of the piece you want to move, followed by the coordinate you want to move to. ex: (enter c1 when propted, then enter b2 when prompted) do not include spaces in your answer\nThe game will automatically double jump for you");
    try
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
    if(!isComputer){
      while(hasWon == false){
        if((count%2)==0){
          myBoard.checkKing();
          myBoard.drawBoard();
          if(player1.jump(p1Color)){
            System.out.println(p1Name + " automatically jumped");
            myBoard.drawBoard();
            if(myBoard.checkWin() == "RED WINS"){
              hasWon = true;
              System.exit(0);
            }
            else if(myBoard.checkWin() == "BLUE WINS"){
              hasWon = true;
              System.exit(0);
            }
            try
            {
              Thread.sleep(500);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
          }
          else{
          System.out.println(p1Name+" please enter the current coordinate of the piece you want to move");
          fromC = kb.nextLine();
          System.out.println(p1Name+" please enter the coordinate of where you want to move to");
          toC = kb.nextLine();
          while(checkV){
            if(player1.move(fromC, toC, p1Color)){
              player1.move(fromC, toC, p1Color);
              checkV = false;
            }
            else{
              System.out.println(p1Name+" Your move was invalid, please reenter your move\n");
              System.out.println(p1Name+" please enter the current coordinate of the piece you want to move");
          fromC = kb.nextLine();
          System.out.println(p1Name+" please enter the coordinate of where you want to move to");
          toC = kb.nextLine();
              checkV = true;
            }
          }
          checkV = true;
          myBoard.drawBoard();
          if(myBoard.checkWin() == "RED WINS"){
              hasWon = true;
              System.exit(0);
            }
            else if(myBoard.checkWin() == "BLUE WINS"){
              hasWon = true;
              System.exit(0);
            }
          }
        }
        else{
          myBoard.checkKing();
          myBoard.drawBoard();
          if(player2.jump(p2Color)){
            System.out.println(p2Name + " automatically jumped");
            myBoard.drawBoard();
            if(myBoard.checkWin() == "RED WINS"){
              hasWon = true;
              System.exit(0);
            }
            else if(myBoard.checkWin() == "BLUE WINS"){
              hasWon = true;
              System.exit(0);
            }
            try
            {
              Thread.sleep(500);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
          }
          else{
          System.out.println(p2Name+" please enter the current coordinate of the piece you want to move");
          fromC = kb.nextLine();
          System.out.println(p2Name+" please enter the coordinate of where you want to move to");
          toC = kb.nextLine();
          while(checkV){
            if(player2.move(fromC, toC, p2Color)){
              player2.move(fromC, toC, p2Color);
              checkV = false;
            }
            else{
              System.out.println(p2Name+" Your move was invalid, please reenter your move\n");
              System.out.println(p2Name+" please enter the current coordinate of the piece you want to move");
          fromC = kb.nextLine();
          System.out.println(p2Name+" please enter the coordinate of where you want to move to");
          toC = kb.nextLine();
              checkV = true;
            }
          }
          checkV = true;
          myBoard.drawBoard();
          if(myBoard.checkWin() == "RED WINS"){
              hasWon = true;
              System.exit(0);
            }
            else if(myBoard.checkWin() == "BLUE WINS"){
              hasWon = true;
              System.exit(0);
            }  
          }
        }
        count++;
      }
    }
    else{
      while(hasWon == false){
        if((count%2)==0){
          myBoard.checkKing();
          myBoard.drawBoard();
          if(player1.jump(p1Color)){
            System.out.println(p1Name + " automatically jumped");
            myBoard.drawBoard();
            if(myBoard.checkWin() == "RED WINS"){
              hasWon = true;
              System.exit(0);
            }
            else if(myBoard.checkWin() == "BLUE WINS"){
              hasWon = true;
              System.exit(0);
            }
            try
            {
              Thread.sleep(500);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
          }
          else{
          System.out.println(p1Name+" please enter the current coordinate of the piece you want to move");
          fromC = kb.nextLine();
          System.out.println(p1Name+" please enter the coordinate of where you want to move to");
          toC = kb.nextLine();
          while(checkV){
            if(player1.move(fromC, toC, p1Color)){
              player1.move(fromC, toC, p1Color);
              checkV = false;
            }
            else{
              System.out.println(p1Name+" Your move was invalid, please reenter your move\n");
              System.out.println(p1Name+" please enter the current coordinate of the piece you want to move");
          fromC = kb.nextLine();
          System.out.println(p1Name+" please enter the coordinate of where you want to move to");
          toC = kb.nextLine();
              checkV = true;
            }
          }
          checkV = true;
          myBoard.drawBoard();
          if(myBoard.checkWin() == "RED WINS"){
              hasWon = true;
              System.exit(0);
            }
            else if(myBoard.checkWin() == "BLUE WINS"){
              hasWon = true;
              System.exit(0);
            }
          }
        }
        else{
          myBoard.checkKing();
          myBoard.drawBoard();
          computer.move(p2Color);
          myBoard.drawBoard();
          if(myBoard.checkWin() == "RED WINS"){
              hasWon = true;
              System.exit(0);
            }
            else if(myBoard.checkWin() == "BLUE WINS"){
              hasWon = true;
              System.exit(0);
            }
        }
        count++;
      }
    }
  }
}
