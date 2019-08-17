
public class Bishop extends Piece {

	public Bishop(boolean isWhite) {
		super(isWhite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isMoveLegal(Coordinate old, Coordinate c) {
		if (CoordinateController.isDiagonal(old, c)) {
			if (old.getX() < c.getX() && old.getY() < c.getY()) {
				for (int i = old.getX() + 1; i <= c.getX(); i++) {
					for (int j = old.getY() + 1; j <= c.getY(); j++) {
						if (board.getPiece(new Coordinate(i, j)) != null) {
							return false;
						}
					}
				}
			} else if (old.getX() < c.getX() && old.getY() > c.getY()) {
				for (int i = old.getX() + 1; i <= c.getX(); i++) {
					for (int j = old.getY() - 1; j >= c.getY(); j--) {
						if (board.getPiece(new Coordinate(i, j)) != null) {
							return false;
						}
					}
				}

			} else if (old.getX() > c.getX() && old.getY() > c.getY()) {
				for (int i = old.getX() - 1; i >= c.getX(); i--) {
					for (int j = old.getY() - 1; j >= c.getY(); j--) {
						if (board.getPiece(new Coordinate(i, j)) != null) {
							return false;
						}
					}
				}
			} else if (old.getX() > c.getX() && old.getY() < c.getY()) {
				for (int i = old.getX() - 1; i >= c.getX(); i--) {
					for (int j = old.getY() + 1; j <= c.getY(); j++) {
						if (board.getPiece(new Coordinate(i, j)) != null) {
							return false;
						}
					}
				}
			}
			return true;
		}
		return false;

	}

}
