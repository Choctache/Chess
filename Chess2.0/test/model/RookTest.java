package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.CoordinateController;

class RookTest {

	@Test
	void testIsMoveLegalStraightX() {
		Board board = new Board();
		Piece rook = new Rook(true);
		board.setPiece(new Coordinate(4,4), rook);
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(CoordinateController.isStraightX(new Coordinate(4,4), new Coordinate(i,j))) {
					assertTrue(rook.isMoveLegal(new Coordinate(4,4), new Coordinate(i,j)), "Position " + i + " : " +j);
				}
			}
		}
	}
	
	@Test
	void testIsMoveLegalStraightY() {
		Board board = new Board();
		Piece rook = new Rook(true);
		board.setPiece(new Coordinate(4,4), rook);
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(CoordinateController.isStraightY(new Coordinate(4,4), new Coordinate(i,j))) {
					assertTrue(rook.isMoveLegal(new Coordinate(4,4), new Coordinate(i,j)), "Position " + i + " : " +j);
				}
			}
		}
	}
	
	@Test
	void testIsMoveLegalNot() {
		Board board = new Board();
		Piece rook = new Rook(true);
		board.setPiece(new Coordinate(4,4), rook);
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(!CoordinateController.isStraightY(new Coordinate(4,4), new Coordinate(i,j)) && !CoordinateController.isStraightX(new Coordinate(4,4), new Coordinate(i,j))) {
					assertFalse(rook.isMoveLegal(new Coordinate(4,4), new Coordinate(i,j)), "Position " + i + " : " +j);
				}
				
			}
		}
		
	}
	
	

}
