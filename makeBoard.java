import java.awt.*;//imports
class makeBoard extends Component{//makeBoard class
  public int[][] gameboard = new int[8][8];//creates the array
  makeBoard(int[][] gameBoard){//gets the array to draw
    gameboard = gameBoard;
  }
  public void paint(Graphics g)//create paint method
  {
    Graphics2D graph = (Graphics2D)g;//get Graphics2D
    Font font = new Font("Serif", Font.PLAIN, 20);//set font
    graph.setFont(font);
    graph.setColor(Color.DARK_GRAY);
    graph.fillRect(0,0,500,500);
    graph.setColor(Color.WHITE);
    graph.drawString("A",70,40);
    graph.drawString("B",120,40);
    graph.drawString("C",170,40);
    graph.drawString("D",220,40);
    graph.drawString("E",270,40);
    graph.drawString("F",320,40);
    graph.drawString("G",370,40);
    graph.drawString("H",420,40);
    graph.drawString("1",30,75);
    graph.drawString("2",30,125);
    graph.drawString("3",30,175);
    graph.drawString("4",30,225);
    graph.drawString("5",30,275);
    graph.drawString("6",30,325);
    graph.drawString("7",30,375);
    graph.drawString("8",30,425);
    //generate letters and number labels
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
    //generate the board
    for(int row = 0; row < gameboard.length; row++){
      for(int col = 0;col < gameboard[row].length;col++){//iterate through the array
        if(gameboard[row][col]==1){//generate blue pieces
          graph.setColor(Color.BLUE);
          graph.fillOval((row*50)+50,(col*50)+50,50,50);
        }
        else if(gameboard[row][col]== -1){//generate red pieces
          graph.setColor(Color.RED);
          graph.fillOval((row*50)+50,(col*50)+50,50,50);
        }
        else if(Gameboard.gameBoard[row][col]== -2){//generate red kings
          graph.setColor(Color.RED);
          graph.fillOval((row*50)+50,(col*50)+50,50,50);
          graph.setColor(Color.WHITE);
          graph.drawString("K",(row*50)+75,(col*50)+75);
        }
        else if(Gameboard.gameBoard[row][col]== 2){//generate blue kings
          graph.setColor(Color.BLUE);
          graph.fillOval((row*50)+50,(col*50)+50,50,50);
          graph.setColor(Color.WHITE);
          graph.drawString("K",(row*50)+75,(col*50)+75);
        }
      }
    }
    Gameboard newBoard = new Gameboard();
    if(newBoard.checkWin() == "RED WINS"){//if there is a winner, draw RED win screen
      Font font1 = new Font("Serif", Font.PLAIN, 50);
      graph.setFont(font1);
      graph.setColor(Color.RED);
      graph.drawString("RED WINS",100,250);
    }
    else if(newBoard.checkWin() == "BLUE WINS"){//if there is a winner, draw BLUE win screen
      Font font2 = new Font("Serif", Font.PLAIN, 50);
      graph.setFont(font2);
      graph.setColor(Color.BLUE);
      graph.drawString("BLUE WINS",100,250);
    }
  }
}