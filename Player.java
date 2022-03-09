import java.util.*;

public class Player 
{
  private String player;
  private int numCheckers;
  private boolean run = true;
  private Scanner kb = new Scanner(System.in);
  private String row;  
  private String col; 

  public Player(String p1, int nchecker)
  {
    player = p1;
    numCheckers = nchecker;
  }

  public String getPlayer()
  {
    return player;
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
      }while(!row.equals("a"));

      do
      {
        System.out.print("Enter the y cordinate: ");
        col = kb.nextLine();
        col.toUpperCase();
      }while(!col.equals("a"));
      run = false; 
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