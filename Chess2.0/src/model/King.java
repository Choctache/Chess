package model;

public class King extends Piece {
	
	boolean isFirstMove;

	public King(boolean isWhite) {
		super(isWhite);
	}

	@Override
	public boolean isMoveLegal(Coordinate old, Coordinate c) {

		if (((Math.abs(old.getX() - c.getX()) == 1) && (old.getY() - c.getY() == 0)) || 
				((old.getX() - c.getX() == 0) && (Math.abs(old.getY() - c.getY()) == 1)) ||
				((Math.abs(old.getX() - c.getX()) == 1) && (Math.abs(old.getY() - c.getY()) == 1)) ) {
			Queen possibleMoves = new Queen(this.isWhite);
			return possibleMoves.isMoveLegal(old, c);
		}
		return false;

	}

}
