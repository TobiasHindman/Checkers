import java.util.*;
public class Main {//Main class
  public static void main(String[] args) {//main method
    Gameboard myBoard = new Gameboard();
    Computer computer = new Computer();
    myBoard.drawBoard();
    boolean checkV = true;
    boolean hasWon = false;
    boolean isComputer = false;
    String fromC;
    String toC;
    int count = 0;
    String p1Name;
    String p2Name;
    String p1Color;
    String p2Color;
    Scanner kb = new Scanner(System.in);
    //initialize variables and instances of classes
    System.out.println("Player 1, please enter your name");//get user1 name
    p1Name = kb.nextLine();
    System.out.println(p1Name+ " please enter the color you wish to be, type \"red\" for red, and \"blue\" for blue");//get user1 color
    p1Color = kb.nextLine().toLowerCase();
    Player player1 = new Player(p1Name,p1Color);
    if(p1Color.equals("red")){//set user2 color
      p2Color = "blue";
    }
    else{
      p2Color = "red";
    }
    System.out.println("Player 2, please enter your name, or type \"computer\" to play a computer");
    p2Name = kb.nextLine();
    if(p2Name.contains("comput")){//determine if user2 is a computer or player
      isComputer = true;
    }
    Player player2 = new Player(p2Name,p2Color);
    try//delay
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
    System.out.println("How to play:\nWhen prompted for your move, first enter the current coordinate of the piece you want to move, followed by the coordinate you want to move to. ex: (enter c1 when propted, then enter b2 when prompted) do not include spaces in your answer\nThe game will automatically double jump for you");//instructions
    try//delay
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
    if(!isComputer){//if 2 player game
      while(hasWon == false){//check for a win
        if((count%2)==0){//determine whose turn it is
          myBoard.checkKing();//check for kings
          myBoard.drawBoard();//draw the board
          if(player1.jump(p1Color)){//if a jump is available
            System.out.println(p1Name + " automatically jumped");
            myBoard.drawBoard();
            if(myBoard.checkWin() == "RED WINS"){//check for win
              hasWon = true;
              System.exit(0);
            }
            else if(myBoard.checkWin() == "BLUE WINS"){
              hasWon = true;
              System.exit(0);
            }
            try//delay
            {
              Thread.sleep(500);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
          }
          else{//user input if no jump available
          System.out.println(p1Name+" please enter the current coordinate of the piece you want to move");
          fromC = kb.nextLine();
          System.out.println(p1Name+" please enter the coordinate of where you want to move to");
          toC = kb.nextLine();
          //getting user input
          while(checkV){//call move methods and input check
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
          if(myBoard.checkWin() == "RED WINS"){//check for a win
              hasWon = true;
              System.exit(0);
            }
            else if(myBoard.checkWin() == "BLUE WINS"){
              hasWon = true;
              System.exit(0);
            }
          }
        }
        else{//if player2 turn
          myBoard.checkKing();//check for kings
          myBoard.drawBoard();//generate board
          if(player2.jump(p2Color)){//check for autojumps
            System.out.println(p2Name + " automatically jumped");
            myBoard.drawBoard();
            if(myBoard.checkWin() == "RED WINS"){//check for a win
              hasWon = true;
              System.exit(0);
            }
            else if(myBoard.checkWin() == "BLUE WINS"){
              hasWon = true;
              System.exit(0);
            }
            try//delay
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
          while(checkV){//call move methods and check user input
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
          if(myBoard.checkWin() == "RED WINS"){//check for a win
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
    else{//if 1 player game
      while(hasWon == false){
        if((count%2)==0){//if player1 turn
          myBoard.checkKing();//check for kings
          myBoard.drawBoard();//generate board
          if(player1.jump(p1Color)){//check for autojumps
            System.out.println(p1Name + " automatically jumped");
            myBoard.drawBoard();
            if(myBoard.checkWin() == "RED WINS"){//check for a win
              hasWon = true;
              System.exit(0);
            }
            else if(myBoard.checkWin() == "BLUE WINS"){
              hasWon = true;
              System.exit(0);
            }
            try//delay
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
          while(checkV){//call move methods and check user input
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
          if(myBoard.checkWin() == "RED WINS"){//check for a win
              hasWon = true;
              System.exit(0);
            }
            else if(myBoard.checkWin() == "BLUE WINS"){
              hasWon = true;
              System.exit(0);
            }
          }
        }
        else{//if computer turn
          myBoard.checkKing();//check for a king
          myBoard.drawBoard();//generate board
          computer.move(p2Color);//move the computer
          myBoard.drawBoard();//generate board
          if(myBoard.checkWin() == "RED WINS"){//check for a win
              hasWon = true;
              System.exit(0);
            }
            else if(myBoard.checkWin() == "BLUE WINS"){
              hasWon = true;
              System.exit(0);
            }
        }
        count++;//iterate turn counter
      }
    }
  }
}
