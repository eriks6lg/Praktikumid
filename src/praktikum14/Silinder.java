package praktikum14;

public class Silinder extends Ring {
	
	public int korgus;
	
	public Silinder(Ring ring, int korgus) {
		super(new Punkt(ring.keskpunkt.x, ring.keskpunkt.y), ring.raadius);
		this.korgus = korgus;
	}
	
	public double pindala() {
		return super.umbermoot()*korgus + 2*super.pindala();
	}
	public double ruumala() {
		return super.pindala()*korgus;
	}
}
