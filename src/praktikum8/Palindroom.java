package praktikum8;
import lib.TextIO;

public class Palindroom {
	public static void main(String[] args) {
		
		System.out.print("Sisestage sõna ja see programm kontrollib,\n"
				+ "kas sõna on edaspidi ja tagurpidi lugedes sama.\nSõna: ");
		
		String s6na = TextIO.getlnString();
		boolean kasPalindroom = palindroom(s6na); 
		if (kasPalindroom == true) {
			System.out.println("Teie sisestatud sõna '" + s6na + "' on palindroom\n"
					+ "ehk edaspidi ja tagurpidi samamoodi loetav.");
		} else
			System.out.println("Teie sisestatud sõna '" + s6na + "' ei ole palindroom\n"
					+ "ehk ta pole edaspidi ja tagurpidi samamoodi loetav.");
	}
	public static boolean palindroom(String s6na) {
		char[] s6naMassiiv = new char[s6na.length()];
		String uusS6na;
		char[] uusS6naMassiiv = new char[s6na.length()];
		
		for (int i=0; i<s6na.length(); i++) {
			s6naMassiiv[i] = s6na.charAt(i);
		}
		for (int i=s6na.length()-1; i>=0; i--) {
			uusS6naMassiiv[s6na.length()-1 -i] = s6naMassiiv[i];
		}
		uusS6na = String.valueOf(uusS6naMassiiv);
		if (s6na.equals(uusS6na))
			return true;
		else
			return false;
	}

}
