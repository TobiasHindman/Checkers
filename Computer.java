import math.random;
public class Computer {
    public int nextLetter;
    public int nextNumber;

    public int[] nextMove() {
        nextLetter = (int) 10 * math.random(0,1);
    }
}
