package praktikum3;
import lib.TextIO;

public class CumLaude {
	public static void main(String[] args) {
		System.out.println("Tervist! Sisestage palun oma tunnistuse keskmine hinne!");
		double keskhinne = TextIO.getlnDouble();
		while (keskhinne > 5 || keskhinne < 0) {
			System.out.println("Keskmine hinne ei saa olla suurem kui 5 või väiksem kui 0...");
			keskhinne = TextIO.getlnDouble();
		}
		
		System.out.println("Ja mis oli Teie lõputöö hinne?");
		double lopuhinne = TextIO.getlnDouble();
		
		while (lopuhinne > 5 || lopuhinne < 0) {
			System.out.println("Lõputöö hinne ei saa olla suurem kui 5 või väiksem kui 0...");
			lopuhinne = TextIO.getlnDouble();
		}
		
		if (keskhinne > 4.5) {
			if (lopuhinne == 5) {
				System.out.println("Jah, saad Cum Laude diplomile!!!");
			}
		}
		else {
			System.out.println("Õpi veel!!!");
		}
	}
}
