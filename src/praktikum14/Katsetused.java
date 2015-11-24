package praktikum14;

public class Katsetused {
	
	public static void main(String[] args) {
		
		Punkt punkt = new Punkt(2, 3);
		Punkt punkt2 = new Punkt(2, 4);
		Joon joon = new Joon(punkt, punkt2);
		double joonepikkus = joon.pikkus();
		Ring ring = new Ring(punkt, 5);
		Silinder silinder = new Silinder(ring, 4);
		System.out.println(silinder.pindala());
		Graafiline graafika = new Graafiline();
		graafika.joonistaPunkt(punkt);
	}

}
