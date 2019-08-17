
public class King extends Piece {

	public King(boolean isWhite) {
		super(isWhite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isMoveLegal(Coordinate old, Coordinate c) {
		if (CoordinateController.isDiagonal(old, c)) {
			if (old.getX() + 1 == c.getX() && old.getY() + 1 == c.getY()) {
				if (board.getPiece(c) != null) {
					return false;
				}
			} else if (old.getX() + 1 == c.getX() && old.getY() - 1 == c.getY()) {
				if (board.getPiece(c) != null) {
					return false;
				}
			} else if (old.getX() - 1 == c.getX() && old.getY() - 1 == c.getY()) {
				if (board.getPiece(c) != null) {
					return false;
				}
			} else if (old.getX() - 1 == c.getX() && old.getY() + 1 == c.getY()) {
				if (board.getPiece(c) != null) {
					return false;
				}
			}
		} else if (CoordinateController.isStraightX(old, c)) {
			if (old.getX() + 1 == c.getX() && board.getPiece(c) != null) {
				return false;
			} else if (old.getX() - 1 == c.getX() && board.getPiece(c) != null) {
				return false;
			}

		} else if (CoordinateController.isStraightY(old, c)) {
			if (old.getY() + 1 == c.getY() && board.getPiece(c) != null) {
				return false;
			} else if (old.getX() - 1 == c.getY() && board.getPiece(c) != null) {
				return false;
			}
		} else {
			return false;
		}
		return true;

	}

}
