package praktikum14;

public class Punkt {
	
	
	public int x;
	public int y;
	
	public Punkt(int x, int y) {
		this.x = x;
		this.y = y;	
	}
	public Punkt() {
		x = 0;
		y = 0;
	}
	
	public String toString() {
		
		return "(" + x + ";" + y + ")";
	}

}
