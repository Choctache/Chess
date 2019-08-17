
public class ChessApp {

	public static void main(String[] args) {
		Board board = new Board();
		board.movePiece(new Coordinate(0,0), new Coordinate(0,0));
		board.movePiece(new Coordinate(0,0),new Coordinate(0,6));
		board.movePiece(new Coordinate(0,6),new Coordinate(0,7));
		
		board.movePiece(new Coordinate(1,1),new Coordinate(1,0));
		board.movePiece(new Coordinate(1,1),new Coordinate(1,1));
		board.movePiece(new Coordinate(1,1),new Coordinate(2,1));
		board.movePiece(new Coordinate(1,1),new Coordinate(1,2));
		
		board.movePiece(new Coordinate(3,0),new Coordinate(3,1));
		board.movePiece(new Coordinate(3,1),new Coordinate(4,1));
		board.movePiece(new Coordinate(4,1),new Coordinate(3,0));
		board.movePiece(new Coordinate(3,0),new Coordinate(5,1));

	}

}
