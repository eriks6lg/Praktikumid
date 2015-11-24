package praktikum14;

public class Ring {
	
	Punkt keskpunkt = new Punkt();
	int raadius;
	
	public Ring (Punkt keskpunkt, int raadius) {
		this.keskpunkt = keskpunkt;
		this.raadius = raadius;
	}
	
	public double umbermoot() {
		
		return 2*Math.PI*raadius;
	}
	public double pindala(){
		return Math.PI*(Math.pow(raadius, 2));
	}
}
