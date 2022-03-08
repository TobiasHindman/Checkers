import java.util.*;

public class Player
{
  private String player;
  private int numCheckers;
  private boolean run; 
  private Random rand = new Random();
  private int num; 

  public Player(String p1)
  {
    player = p1;
    numCheckers = 12;
  }

  public String getPlayer()
  {
    return player;
  }

  public int getCheckers()
  {
    return numCheckers; 
  }

  public void ai()
  {
    numCheckers = 12;
    player = "AI";

    if (numCheckers == 0)
    {
      checkWin();
    }

    if(numCheckers < 12)
    {
      
    }
    else
    {
      num = rand.nextInt(); 
    }
    
  }

  public void checkWin()
  {
    if (numCheckers == 0)
    {
      run = false; 
      System.out.println(player +" lost");
    }
    else
    {
      run = true;
      System.out.println(player + " won");
    }
  }
}
