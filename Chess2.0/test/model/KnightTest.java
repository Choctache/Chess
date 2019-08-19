package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KnightTest {

	Coordinate[] legalPossibilities = { new Coordinate(6, 3), new Coordinate(6, 5), new Coordinate(5, 2),
			new Coordinate(5, 6), new Coordinate(3, 2), new Coordinate(3, 6), new Coordinate(2, 3),
			new Coordinate(2, 5) };

	@Test
	void testIsMoveLegalAllLegalOptions() {
		// setup
		Board board = new Board();
		Piece knight = new Knight(true);
		board.setPiece(new Coordinate(4, 4), knight);

		// test
		for(int i = 0; i < legalPossibilities.length; i++) {
			assertTrue(knight.isMoveLegal(new Coordinate(4,4), legalPossibilities[i]));
		}
		

	}

	@Test
	void testIsMoveLegalAllIllegalOptions() {
		// setup
		Board board = new Board();
		Piece knight = new Knight(true);
		board.setPiece(new Coordinate(4, 4), knight);

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
					assertFalse(knight.isMoveLegal(new Coordinate(4, 4), currentTest),
							currentTest.getX() + " : " + currentTest.getY());
				}

			}
		}

	}

}
