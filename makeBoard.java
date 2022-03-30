import java.awt.*;
class makeBoard extends Component{
  public int[][] gameboard = new int[8][8];
  makeBoard(int[][] gameBoard){
    gameboard = gameBoard;
  }
  public void paint(Graphics g)
  {
    Graphics2D graph = (Graphics2D)g;
    Font font = new Font("Serif", Font.PLAIN, 12);
    graph.setFont(font);
    graph.drawString("Why Hello There",25,25);
    graph.setColor(Color.DARK_GRAY);
    graph.fillRect(0,0,500,500);
    graph.setColor(Color.WHITE);
    graph.fillRect(50,50,50,50);
    graph.fillRect(150,50,50,50);
    graph.fillRect(250,50,50,50);
    graph.fillRect(350,50,50,50);
    graph.setColor(Color.BLACK);
    graph.fillRect(100,50,50,50);
    graph.fillRect(200,50,50,50);
    graph.fillRect(300,50,50,50);
    graph.fillRect(400,50,50,50);
    graph.fillRect(50,100,50,50);
    graph.fillRect(150,100,50,50);
    graph.fillRect(250,100,50,50);
    graph.fillRect(350,100,50,50);
    graph.setColor(Color.WHITE);
    graph.fillRect(100,100,50,50);
    graph.fillRect(200,100,50,50);
    graph.fillRect(300,100,50,50);
    graph.fillRect(400,100,50,50);
    graph.fillRect(50,150,50,50);
    graph.fillRect(150,150,50,50);
    graph.fillRect(250,150,50,50);
    graph.fillRect(350,150,50,50);
    graph.setColor(Color.BLACK);
    graph.fillRect(100,150,50,50);
    graph.fillRect(200,150,50,50);
    graph.fillRect(300,150,50,50);
    graph.fillRect(400,150,50,50);
    graph.fillRect(50,200,50,50);
    graph.fillRect(150,200,50,50);
    graph.fillRect(250,200,50,50);
    graph.fillRect(350,200,50,50);
    graph.setColor(Color.WHITE);
    graph.fillRect(100,200,50,50);
    graph.fillRect(200,200,50,50);
    graph.fillRect(300,200,50,50);
    graph.fillRect(400,200,50,50);
    graph.fillRect(50,250,50,50);
    graph.fillRect(150,250,50,50);
    graph.fillRect(250,250,50,50);
    graph.fillRect(350,250,50,50);
    graph.setColor(Color.BLACK);
    graph.fillRect(100,250,50,50);
    graph.fillRect(200,250,50,50);
    graph.fillRect(300,250,50,50);
    graph.fillRect(400,250,50,50);
    graph.fillRect(50,300,50,50);
    graph.fillRect(150,300,50,50);
    graph.fillRect(250,300,50,50);
    graph.fillRect(350,300,50,50);
    graph.setColor(Color.WHITE);
    graph.fillRect(100,300,50,50);
    graph.fillRect(200,300,50,50);
    graph.fillRect(300,300,50,50);
    graph.fillRect(400,300,50,50);
    graph.fillRect(50,350,50,50);
    graph.fillRect(150,350,50,50);
    graph.fillRect(250,350,50,50);
    graph.fillRect(350,350,50,50);
    graph.setColor(Color.BLACK);
    graph.fillRect(100,350,50,50);
    graph.fillRect(200,350,50,50);
    graph.fillRect(300,350,50,50);
    graph.fillRect(400,350,50,50);
    graph.fillRect(50,400,50,50);
    graph.fillRect(150,400,50,50);
    graph.fillRect(250,400,50,50);
    graph.fillRect(350,400,50,50);
    graph.setColor(Color.WHITE);
    graph.fillRect(100,400,50,50);
    graph.fillRect(200,400,50,50);
    graph.fillRect(300,400,50,50);
    graph.fillRect(400,400,50,50);
    for(int row = 0; row < gameboard.length; row++){
      for(int col = 0;col < gameboard[row].length;col++)       {
        if(gameboard[row][col]==1){
          graph.setColor(Color.BLUE);
          graph.fillOval((row*50)+50,(col*50)+50,50,50);
        }
        else if(gameboard[row][col]== -1){
          graph.setColor(Color.RED);
          graph.fillOval((row*50)+50,(col*50)+50,50,50);
        }
      }
    }
  }
}