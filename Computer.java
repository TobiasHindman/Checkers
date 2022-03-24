import math.random;
public class Computer {
    public int nextLetter;
    public int nextNumber;
    public Piece piece;

    public int[] nextMove() {
        nextLetter = (int) 10 * math.random(0,1);
        nextNumber = (int) 10 * math.random(0,1);
        int[] nextMove = new int [2];
        nextMove[0] = nextLetter;
        nextMove[1] = nextNumber;
        return nextMove;
    }
    public int[] fromMove() {
        
        while() {
            nextLetter = (int) 10 * math.random(0,1);
            nextNumber = (int) 10 * math.random(0,1);
            int[] nextMove = new int [2];
            nextMove[0] = nextLetter;
            nextMove[1] = nextNumber;
            if (piece.currentGameBoard[nextLetter - 1][ nextNumber - 1] != 0) {
                return nextMove;
            }
        }
        return null;
    }
}
