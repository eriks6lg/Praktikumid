package praktikum2;

import lib.TextIO;

public class Asendus {
	public static void main(String[] args) {

		System.out.println("Tervist! Öelge palun sõna, mis sisaldab rohkem kui 1 'k' tähte!");

		String nimi = TextIO.getlnString();

		String uusnimi = nimi.replace('k', 'n');

		System.out.println("Kui sinu sõnas '" + nimi + "' vahetada välja kõik k tähed n tähega,\n" + "tekiks uus sõna '"
				+ uusnimi + "'.");
	}
}
