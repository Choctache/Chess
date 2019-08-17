
public abstract class Piece{
	
	protected boolean isWhite;
	protected boolean isFirstMove;
	protected static Board board;
	
	public Piece(boolean isWhite) {
		this.isWhite = isWhite;
		this.isFirstMove = true;
	}
	
	public abstract boolean isMoveLegal(Coordinate old, Coordinate c);

	public boolean isFirstMove() {
		return isFirstMove;
	}

	public void setFirstMove(boolean isFirstMove) {
		this.isFirstMove = isFirstMove;
	}

}
