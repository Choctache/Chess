package model;

import static org.junit.jupiter.api.Assertions.*;

import controller.CoordinateController;

import org.junit.jupiter.api.Test;


class BishopTest {

	@Test
	void testIsMoveLegal() {
		Board board = new Board();
		Piece bishop = new Bishop(true);
		board.setPiece(new Coordinate(4,4), bishop);
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(CoordinateController.isDiagonal(new Coordinate(4,4), new Coordinate(i,j))) {
					assertTrue(bishop.isMoveLegal(new Coordinate(4,4), new Coordinate(i,j)), "Position " + i + " : " +j);
				}
			}
		}
	}
	
	
	@Test
	void testIsMoveLegalNot() {
		Board board = new Board();
		Piece bishop = new Bishop(true);
		board.setPiece(new Coordinate(4,4), bishop);
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(!CoordinateController.isDiagonal(new Coordinate(4,4), new Coordinate(i,j))) {
					assertFalse(bishop.isMoveLegal(new Coordinate(4,4), new Coordinate(i,j)), "Position " + i + " : " +j);
				}
			}
		}
	}

}
