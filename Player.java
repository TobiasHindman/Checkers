import java.util.*;

public class Player
{
  private String player;
  //private Gameboard board;
  private Piece play;
  private int numCheckers;
  private String player2;
  private String currentPlayer;
  private boolean run = true;
  private Scanner kb = new Scanner(System.in);
  private String row;  
  private int col;
  private char cRow;
  private String p1color;
  private String p2color;

  public Player()
  {
    player = "Unkown";
    player2 = "Unkown";
    numCheckers = 12;
  }
 
  public Player(String p1, String p2, String color1, String color2)
  {
    player = p1;
    player2 = p2;
    p1color = color1;
    p2color = color2;
    numCheckers = 12;
  }

  public String getPlayer(String x)
  {
    player = x;
    return player;
  }

<<<<<<< HEAD
  //public int getCheckers();
  //{
    //return numCheckers; 
  //}
  
=======
  private String getColor1(Piece color1)
  {
    p1color = color1;
    p1color = "Blue";//needs to be changed
    return p1color;
  }

  private String getColor2()
  {
   
    p2color = "Red";//needs to be changed
    return p2color;
  }

  public String getPlayer2(String y)
  {
    player2 = y;
    return player2;
  }

  public int getCheckers()
  {
    return numCheckers;
  }

  public void switchPlayer()
  {
    while(run)
    {
      do
      {
        System.out.print("Enter the x cordinate: ");
        row = kb.nextLine();
        row.toUpperCase();
        cRow = row.charAt(0);
        if (cRow < 65 && cRow > 75)
        {
          System.out.println("Not possible");
        }
      }while(cRow < 65 && cRow > 75);

      do
      {
        System.out.print("Enter the y cordinate: ");
        col = kb.nextInt();
        if(col < 0 && col > 10)
        {
          System.out.println("Not possbile");
        }
      }while(col < 0 && col > 10);

      if (numCheckers == 0)
      {
        break;
      }
    }
  }

  public String checkWin()
  {
    if (numCheckers == 0)
    {
      return player + " lost";
    }
    else
    {
      return player + " won";
    }
  }
}
