
public class CoordinateController {
	
	
	public static boolean isStraightX(Coordinate old, Coordinate c) {
		if(c.getX() == old.getX()) {
			return true;
		}
		return false;
	}
	
	public static boolean isStraightY(Coordinate old, Coordinate c) {
		if(c.getY() == old.getY()) {
			return true;
		}
		return false;
	}
	
	public static boolean isDiagonal(Coordinate old, Coordinate c) {
		if(old.getX()-c.getX() == old.getY()-c.getY()) {
			return true;
		}
		return false;
		
	}
	
	public static boolean isValid(Coordinate c) {
		if(c.getX() <= 7 && c.getX() >=0 && c.getY() <= 7 && c.getY() >= 0) {
			return true;
		}
		return false;
	}

}
