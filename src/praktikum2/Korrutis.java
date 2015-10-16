package praktikum2;

import lib.TextIO;

public class Korrutis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arv1;
		int arv2;
		int korrutis;
		
		System.out.println("Tervist! Küsin sinult 2 täisarvu ning/n"
				+ "seejärel väljastan nende korrutise");
		
		System.out.print("Arv1:");
		arv1 = TextIO.getlnInt();
		
		System.out.print("Arv2:");
		arv2 = TextIO.getlnInt();
		
		korrutis = arv1 * arv2;
		
		System.out.print("Teie sisestatud arvude " + arv1
				+ " ja " + arv2 + " korrutis on " + korrutis + ".");
	}

}
