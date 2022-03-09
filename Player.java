import java.util.*;

public class Player 
{
  private String player;
  private int numCheckers;
  private boolean run;

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