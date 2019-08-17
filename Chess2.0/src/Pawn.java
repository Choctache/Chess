
public class Pawn extends Piece {

	private boolean isFirstMove;

	public Pawn(boolean isWhite) {
		super(isWhite);
		this.isFirstMove = true;
		// TODO Auto-generated constructor stub
	}

	public boolean isMoveLegal(Coordinate old, Coordinate c) {

		if (CoordinateController.isStraightX(old, c)) {
			if (!isWhite) {
				if (old.getY() + 1 == c.getY() && board.getPiece(c) == null) {

				}
			} else {
				if (c.getY() + 1 == old.getY() && board.getPiece(c) == null) {

				}
			}
		} else if (CoordinateController.isDiagonal(old, c) && board.getPiece(c) != null) {
			if (!isWhite) {
				if (old.getX() + 1 == c.getX() && old.getY() + 1 == c.getY()) {

				} else if (old.getX() - 1 == c.getX() && old.getY() + 1 == c.getY()) {

				} else {
					return false;
				}

			} else {

				if (old.getX() - 1 == c.getX() && old.getY() - 1 == c.getY()) {

				} else if (old.getX() + 1 == c.getX() && old.getY() - 1 == c.getY()) {

				} else {
					return false;
				}

			}

		}
		return true;

	}
}
