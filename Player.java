import java.util.*;

public class Player extends Gameboard
{
  private String player;
  private int numCheckers;
  private String player2; 
  private String currentPlayer;
  private boolean run = true;
  private Scanner kb = new Scanner(System.in);
  private String row;  
  private int col; 
  private char cRow;

  public Player()
  {
    player = "Unkown";
    player2 = "Unkown";
    numCheckers = 12; 
  }
  public Player(String p1, String p2)
  {
    player = p1;
    player2 = p2; 
    numCheckers = 12;
  }

  public String getPlayer()
  {
    player.setColor(Color.BLUE);
    return player;
  }

  public String getPlayer2()
  {
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