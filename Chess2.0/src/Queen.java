
public class Queen extends Piece {

	public Queen(boolean isWhite) {
		super(isWhite);
	}

	public boolean isMoveLegal(Coordinate old, Coordinate c) {

		Rook straightMoves = new Rook(this.isWhite);
		Bishop diagonalMoves = new Bishop(this.isWhite);

		return (straightMoves.isMoveLegal(old, c) || diagonalMoves.isMoveLegal(old, c));

	}

}
