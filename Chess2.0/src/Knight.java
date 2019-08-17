
public class Knight extends Piece {

	public Knight(boolean isWhite) {
		super(isWhite);
	}

	@Override
	public boolean isMoveLegal(Coordinate old, Coordinate c) {

		int possibleX[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
		int possibleY[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

		int diffX = old.getX() - c.getX();
		int diffY = old.getY() - c.getY();

		for (int i = 0; i < possibleX.length; i++) {
			if (diffX == possibleX[i] && diffY == possibleY[i]) {
				return true;
			}
		}
		return false;

	}

}
