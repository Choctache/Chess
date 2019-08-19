package model;

import controller.CoordinateController;

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
			int distanceBetween = Math.abs(old.getX() - c.getX());
			for (int i = 1; i <= distanceBetween; i++) {
				if (board.getPiece(new Coordinate(old.getX() + directionX, old.getY() + directionY)) != null) {
					return false;
				}
			}
			return true;
		}
		return false;

	}

}
