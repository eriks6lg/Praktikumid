package praktikum2;

import lib.TextIO;

public class Grupid {
	
	public static void main(String[] args) {
		
		int arv;
		int klassid;
		int jaak;
		int jagatis;
		
		System.out.println("Tervist. Küsin esmalt, mitu inimest käib sinu koolis?");
		
		arv = TextIO.getlnInt();
		
		System.out.println("Ja mitu klassi on sinu koolis?");
		
		klassid = TextIO.getlnInt();
		
		jaak = arv % klassid;
		
		jagatis = arv / klassid;
		
		System.out.println("Kui " + arv + " õpilasega ja " + klassid + " klassiga koolis\n"
				+ "käiks igas klassis sama arv õpilasi, siis " + klassid
				+ " klassiga koolis käiks igas klassis\n" + jagatis
				+ "õpilast ja järele jääks " + jaak + " õpilast.");
	}
}
