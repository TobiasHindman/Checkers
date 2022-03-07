public class King extends Piece{
    public bool isKing;
    public King(GameBoard currentBoard, string xindex1, int yindex1, bool isKing1) {
        super.piece(currentboard, xindex1, yindex1);
        isKing = isKing1;

    }
}
