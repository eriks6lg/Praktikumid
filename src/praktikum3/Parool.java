package praktikum3;

import lib.TextIO;

public class Parool {
	
	public static void main(String[] args) {
		String parool = "MAASIKAS";
		System.out.print("Parool: ");
		String sisestus = TextIO.getlnString();
		sisestus = sisestus.toUpperCase();
		
		while (!sisestus.equals(parool)) {
			System.out.print("Parool: ");
			sisestus = TextIO.getlnString();
			sisestus = sisestus.toUpperCase();
		}
		System.out.println("Tere tulemast!");
		
	}
}
