
public class Queen extends Piece{

	public Queen(boolean isWhite) {
		super(isWhite);
	}

	
	public boolean isMoveLegal(Coordinate old,Coordinate c) {
		if(CoordinateController.isStraightX(old, c)) {
			int startY = c.getY();
			int endY = old.getY()-1;
			if(old.getY() <= c.getY()) {
				startY = old.getY()+1;
				endY = c.getY();
			}
			for(int i = startY; i <=  endY; i++) {
				if(board.getPiece(new Coordinate(c.getX(), i)) != null) {
					//throw new IllegalArgumentException("Obstacle in the way");
					return false;
					
				}
			}
			
		}
		else if(CoordinateController.isStraightY(old, c)) {
			int startX = c.getX();
			int endX = old.getX()-1;
			if(old.getX() <= c.getX()) {
				startX = old.getX()+1;
				endX = c.getX();
			}
			for(int i = startX; i <=  endX; i++) {
				if(board.getPiece(new Coordinate(i, c.getY())) != null) {
					//throw new IllegalArgumentException("Obstacle in the way");
					return false;
					
				}
			}
		}
		else if(CoordinateController.isDiagonal(old, c)){
			if(old.getX() < c.getX() && old.getY()< c.getY()) {
				for(int i = old.getX() + 1; i <= c.getX(); i++) {
					for(int j = old.getY() + 1; j <= c.getY(); j++) {
						if(board.getPiece(new Coordinate(i, j)) != null) {
							return false;
						}
					}
				}
			}
			else if(old.getX() < c.getX() && old.getY() > c.getY()) {
				for(int i = old.getX() + 1; i <= c.getX(); i++) {
					for(int j = old.getY()-1; j >= c.getY(); j--) {
						if(board.getPiece(new Coordinate(i, j)) != null) {
							return false;
						}
					}
				}
				
			}
			else if(old.getX() > c.getX() && old.getY() > c.getY()) {
				for(int i = old.getX() - 1; i >= c.getX(); i--){
					for(int j = old.getY()-1; j >= c.getY(); j--) {
						if(board.getPiece(new Coordinate(i, j)) != null) {
							return false;
						}
					}
				}
			}
			else if(old.getX() > c.getX() && old.getY() < c.getY()) {
				for(int i = old.getX() - 1; i >= c.getX(); i--){
					for(int j = old.getY()+1; j <= c.getY(); j++) {
						if(board.getPiece(new Coordinate(i, j)) != null) {
							return false;
						}
					}
				}
			}else {
				return false;
			}
			
		
		}else {
			return false;
		}
		
		return true;
	}


}
