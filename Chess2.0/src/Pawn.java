
public class Pawn extends Piece {



	public Pawn(boolean isWhite) {
		super(isWhite);
	}

	public boolean isMoveLegal(Coordinate old, Coordinate c) {

		int direction = -1;
		if (!isWhite) {
			direction = 1;
		}
		if (CoordinateController.isStraightX(old, c) && board.getPiece(c) == null) {
			if (!(old.getY() + direction == c.getY())) {
				if (!(isFirstMove && old.getY() + 2 * direction == c.getY())) {
					return false;
				}
			}
		} else if (CoordinateController.isDiagonal(old, c) && board.getPiece(c) != null) {
			if (!((old.getX() + direction == c.getX() || old.getX() - direction == c.getX())
					&& old.getY() + direction == c.getY())) {
				return false;
			}
		}
		return true;
	}
}
