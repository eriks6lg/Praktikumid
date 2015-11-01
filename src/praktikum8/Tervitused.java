package praktikum8;
import java.util.ArrayList;
import lib.TextIO;

public class Tervitused {
	
	public static void main(String[] args) {
		
		ArrayList<Inimene> inimesed = new ArrayList<Inimene>();
		
		System.out.println("Tere! See programm loob uusi inimesi Teie sisestatud\n"
				+ "nimede ja vanuste järgi. Kui te ei soovi enam inimesi sisestada,\n"
				+ "sisestage 0");
		int i = 0;
		while(true) {
			i++;
			System.out.printf("%d. inimese nimi: ", i);
			String nimi = TextIO.getlnString();
			if (nimi.equals("0"))
				break;
			System.out.printf("%d. inimese vanus: ", i);
			int vanus = TextIO.getlnInt();
			if (vanus == 0)
				break;
			inimesed.add(new Inimene(nimi, vanus));
			System.out.println();
		}
		for (Inimene inimene: inimesed) {
			
			inimene.tervita();
		}
		
	}

}
