package praktikum6;

import lib.TextIO;

public class Tagurpidi {

	public static void main(String[] args) {
		
		System.out.print("See programm väljastab teie sisestatud sõna tagurpidi.\nTeie sõna:");
		String word=TextIO.getln();
		String newWord = tagurpidi(word);
		System.out.println(newWord);
		
	}
	
	public static String tagurpidi(String sisestus) {
		
		String uusSisestus = "";
		for (int i = 0; i < sisestus.length(); i++) {
			char getChar = sisestus.charAt(sisestus.length() - i - 1);
			uusSisestus = uusSisestus + getChar;
		}
		return uusSisestus;
	}
}
