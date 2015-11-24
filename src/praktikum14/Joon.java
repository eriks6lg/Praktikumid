package praktikum14;

public class Joon {
	
	private Punkt punkt1 = new Punkt();
	private Punkt punkt2 = new Punkt();
	
	public Joon(int x1, int y1, int x2, int y2) {
		
		punkt1.x = x1;
		punkt1.y = y1;
		punkt2.x = x2;
		punkt2.y = y2;
		
	}
	
	public Joon(Punkt punkt1, Punkt punkt2){
		this.punkt1 = punkt1;
		this.punkt2 = punkt2;
	}
	
	public String toString() {
		return "Joon punktist " + punkt1 + " punktini " + punkt2 + ".";
	}
	
	public double pikkus(){
		return Math.sqrt(Math.pow((punkt2.x-punkt1.x), 2) + Math.pow((punkt2.y-punkt1.y), 2));
	}
	

}
