package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PawnTest {
	
	Coordinate[] legalPossibilities = {new Coordinate(0,2), new Coordinate(1,2), new Coordinate(2,2), new Coordinate(1,3)};

	@Test
	void test() {
		Board board = new Board();
		Piece pawn = new Pawn(false);
		board.setPiece(new Coordinate(1,1), pawn);
		board.setPiece(new Coordinate(0,2), new Rook(true));
		board.setPiece(new Coordinate(2,2), new Rook(true));
		
		for(int i = 0; i < legalPossibilities.length; i++) {
			assertTrue(pawn.isMoveLegal(new Coordinate(1,1), legalPossibilities[i]), "Position: " + i);
		}
		
		
		
	}

}
