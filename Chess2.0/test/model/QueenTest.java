package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.CoordinateController;

class QueenTest {

	@Test
	void testIsMoveLegal() {
		Board board = new Board();
		Piece queen = new Queen(true);
		board.setPiece(new Coordinate(4,4), queen);
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(CoordinateController.isStraightX(new Coordinate(4,4), new Coordinate(i,j))) {
					assertTrue(queen.isMoveLegal(new Coordinate(4,4), new Coordinate(i,j)), "Position " + i + " : " +j);
				}
			}
		}
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(CoordinateController.isStraightY(new Coordinate(4,4), new Coordinate(i,j))) {
					assertTrue(queen.isMoveLegal(new Coordinate(4,4), new Coordinate(i,j)), "Position " + i + " : " +j);
				}
			}
		}
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(CoordinateController.isDiagonal(new Coordinate(4,4), new Coordinate(i,j))) {
					assertTrue(queen.isMoveLegal(new Coordinate(4,4), new Coordinate(i,j)), "Position " + i + " : " +j);
				}
			}
		}
	}
	
	@Test
	void testIsMoveLegalNot() {
		Board board = new Board();
		Piece queen = new Queen(true);
		board.setPiece(new Coordinate(4,4), queen);
		
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(!CoordinateController.isDiagonal(new Coordinate(4,4), new Coordinate(i,j)) && !CoordinateController.isStraightY(new Coordinate(4,4), new Coordinate(i,j)) && !CoordinateController.isStraightX(new Coordinate(4,4), new Coordinate(i,j))) {
					assertFalse(queen.isMoveLegal(new Coordinate(4,4), new Coordinate(i,j)), "Position " + i + " : " +j);
				}
			}
		}
	}
	

}
