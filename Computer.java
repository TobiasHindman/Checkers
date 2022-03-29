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
        while(true){
            nextLetter = (int) 10 * math.random(0,1);
            nextNumber = (int) 10 * math.random(0,1);
            int[] nextMove = new int [2];
            nextMove[0] = nextLetter;
            nextMove[1] = nextNumber;
            if (gameboard.GameBoard[nextLetter - 1][ nextNumber - 1] != 0) {
                return nextMove;
            }
        }
        return null;
    }
    public int[] toMove(int[] fromMove, int color) {
        int[] nextMove = new int [2];
        if(color == 1) {
            if(piece.checkMove(fromMove[0] + 1, fromMove[1] - 1)) {
            nextMove[0] = fromMove[0] + 1;
            nextMove[1] = fromMove[0] - 1;
            return nextMove;
            }
            if(piece.checkMove(fromMove[0] - 1, fromMove[1] - 1)){
            nextMove[0] = fromMove[0] + 1;
            nextMove[1] = fromMove[0] - 1;
            return nextMove;
            }
        }
        if(color == -1) {
            if(piece.checkMove(fromMove[0] + 1, fromMove[1] + 1)) {
            nextMove[0] = fromMove[0] + 1;
            nextMove[1] = fromMove[0] + 1;
            return nextMove;
            }
            if(piece.checkMove(fromMove[0] - 1, fromMove[1] + 1))
            nextMove[0] = fromMove[0] + 1;
            nextMove[1] = fromMove[0] + 1;
            return nextMove;
            }
        else return null;
        } 
    }

