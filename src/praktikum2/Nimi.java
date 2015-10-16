package praktikum2;

import lib.TextIO;

public class Nimi {
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Tervist! Palun öelge mulle oma nimi!");
		
		String nimi = TextIO.getlnString();
		
		int nimepikkus = nimi.length();
		
		System.out.println("Sinu nime " + nimi + " pikkus on " + nimepikkus + " tähte.");
		
	}
}
