
public abstract class Piece{
	
	protected boolean isWhite;
	protected static Board board;
	
	public Piece(boolean isWhite) {
		this.isWhite = isWhite;
	}
	
	public abstract boolean isMoveLegal(Coordinate old, Coordinate c);

}
