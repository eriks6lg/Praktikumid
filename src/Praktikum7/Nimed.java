package Praktikum7;
import lib.TextIO;
import java.util.ArrayList;
import java.util.Collections;

public class Nimed {
	
	public static void main(String[] args) {
		
		int count = 0;
		ArrayList<String> nimed = new ArrayList<String>();
		System.out.println("Sisestage palun soovitud arv nimesid!\n"
				+ "Numbreid nimedena ei loetleta."
				+ "Kui soovite lõpetada, sisestage 0");
		while(true) {
			count++;
			System.out.printf("Nimi %s: ", count);
			String sisestus = TextIO.getlnString();
			try {
					if (0 == Integer.parseInt(sisestus))
						break;
			}
			catch (NumberFormatException a) {
				nimed.add(sisestus);
			}
		}
		Collections.sort(nimed);
		for (String nimi:nimed) {
			System.out.println(nimi);
		}
		
		
	}

}
