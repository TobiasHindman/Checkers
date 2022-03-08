public class Piece {
    private  GameBoard currentGameBoard;
    private int xindex;
    private int yindex;
    public int color;
    public piece(GameBoard currentBoard, int xindex1, int yindex1, String color1)  {
        currentGameBoard = currentBoard;
        xindex = xindex1;
        yindex = yindex1;
        color = color1;
    }
    public void move(int toXIndex, int toYIndex) {
        currentGameBoard.game[toXIndex -1][toYIndex -1] = currentGameBoard.game[xindex - 1][yindex - 1];
        currentGameBoard.game[xindex - 1][yindex - 1] = null;
    }
    public void take(int fromXIndex, int fromYIndex, int toXIndex, int toYIndex) {
        currentGameBoard.game[toXIndex -1][toYIndex -1] = currentGameBoard.game[fromXIndex - 1][fromYIndex - 1];
    }
}

