package praktikum8;
import lib.TextIO;

public class T2hekaupa {

	public static void main(String[] args) {
		
		System.out.print("Sisestage suvaline sõna.\nSõna: ");
		String s6na = TextIO.getlnString().toUpperCase();
		char[] t2hed = new char[s6na.length()];
		
		for (int i=0; i<s6na.length(); i++) {
			t2hed[i] = s6na.charAt(i);
		}
		for (int i=0; i<s6na.length(); i++) {
			if (i<s6na.length()-1)
				System.out.printf("%s-", t2hed[i]);
			else 
				System.out.print(t2hed[i]);
		}
	}
}
