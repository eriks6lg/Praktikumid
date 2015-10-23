package praktikum8;
import lib.TextIO;

public class S6napikkused {
	
	public static void main(String[] args) {
		String[] s6nad = new String[10];
	
		System.out.println("See programm trükib välja teie poolt sisestadud\n"
				+ "10 sõna ja nende pikkused.");
		
		for (int i=0; i<s6nad.length; i++) {
			
			System.out.printf("Sõna %s: ", i+1);
			s6nad[i] = TextIO.getlnString();
		}
		for (int i=0; i<s6nad.length; i++) {
			System.out.println(s6nad[i].length() + " " + s6nad[i]);
		}
	}
	
	

}
