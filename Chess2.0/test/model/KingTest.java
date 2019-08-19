package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KingTest {
	
	Coordinate[] legalPossibilities = {new Coordinate(6,4), new Coordinate(6,5), new Coordinate(6,6), new Coordinate(5,4),
			new Coordinate(5,6), new Coordinate(4,4), new Coordinate(4,5), new Coordinate(4,6)};

	@Test
	void testIsMoveLegalAllLegalMoves() {
		//setup
		Piece king = new King(true);
		Board board = new Board();
		board.setPiece(new Coordinate(5,5), king);
		
		//test
		for(int i = 0; i < legalPossibilities.length; i++) {
			assertTrue(king.isMoveLegal(new Coordinate(5,5), legalPossibilities[i]), "Position " + i );
		}
		
	}
	
	@Test
	void testIsMoveLegalAllIllegalOptions() {
		// setup
		Piece king = new King(true);
		Board board = new Board();
		board.setPiece(new Coordinate(5,5), king);

		// test

		Coordinate currentTest;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				boolean isIllegal = true;
				currentTest = new Coordinate(i, j);
				for (Coordinate c : legalPossibilities) {
					if (c.getX() == currentTest.getX() && c.getY() == currentTest.getY()) {
						isIllegal = false;
						break;
					}
				}
				if (isIllegal) {
					assertFalse(king.isMoveLegal(new Coordinate(5, 5), currentTest),
							currentTest.getX() + " : " + currentTest.getY());
				}

			}
		}

	}


}
