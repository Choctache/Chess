
public class Bishop extends Piece {

	public Bishop(boolean isWhite) {
		super(isWhite);
	}

	@Override
	public boolean isMoveLegal(Coordinate old, Coordinate c) {

		if (CoordinateController.isDiagonal(old, c)) {
			int directionX = 1;
			int directionY = 1;
			if (old.getX() > c.getX()) {
				directionX = -1;
			}
			if (old.getY() > c.getY()) {
				directionY = -1;
			}
			for (int i = old.getX() + directionX; i != c.getX(); i += directionX) {
				for (int j = old.getY() + directionY; j != c.getY(); j += directionY) {
					if (board.getPiece(new Coordinate(i, j)) != null) {
						return false;
					}
				}
			}
		}
		return true;

	}

}
