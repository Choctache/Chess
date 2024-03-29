package model;

import controller.CoordinateController;

public class Board {

	private Piece[][] board;


	public Board() {
		this.board = new Piece[8][8];
		Piece.board = this;

	}

	public void movePiece(Coordinate old, Coordinate c) {
		if (CoordinateController.isValid(c)) {
			Piece p = board[old.getX()][old.getY()];
			if (p != null) {
				if (p.isMoveLegal(old, c)) {
					if(p.isFirstMove()) {
						p.setFirstMove(false);
					}
					this.setPiece(old, null);
					this.setPiece(c, p);
					System.out.println("Piece has been moved.");
					
				} else {
					System.out.println("Illegal Move: Piece has not been moved.");
				}

			}
		}

	}

	public void fillBoard() {
		setPiece(new Coordinate(0, 0), new Rook(false));
		setPiece(new Coordinate(7, 0), new Rook(false));
		setPiece(new Coordinate(0, 7), new Rook(true));
		setPiece(new Coordinate(7, 7), new Rook(true));
		setPiece(new Coordinate(1, 1), new Pawn(false));
		setPiece(new Coordinate(6, 6), new Pawn(false));
		setPiece(new Coordinate(3, 0), new Queen(false));
		setPiece(new Coordinate(4, 7), new Queen(true));
	}
	

	public Piece getPiece(Coordinate c) {
		return board[c.getX()][c.getY()];
	}

	public void setPiece(Coordinate c, Piece piece) {
		board[c.getX()][c.getY()] = piece;
	}

}
