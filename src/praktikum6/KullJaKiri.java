package praktikum6;
import lib.TextIO;

public class KullJaKiri {
	
	public static void main(String[] args) {
		
		int kasutajaRaha = 100;
		int kullKiri;
		int panus;
		String kasutajaArvab;
		
		System.out.print("See on kulli ja kirja mäng. Teile antakse 100 raha.\n"
				+ "Mäng toimub panustamise põhimõttel. Kui soovite mängu lõpetada, panustage 0\n"
				+ "Panus ei tohi olla suurem kui 25. Mis on Teie esimene panus?\n");
		
		while (true) {
			if (kasutajaRaha == 0) break;
			
			System.out.print("Teie panus:");
			panus = TextIO.getlnInt();
			
			if (panus == 0) break;
			while (panus<0 || panus>25 || panus>kasutajaRaha) {
				System.out.print("Panustada soovitud summat ei saa. Proovige uuesti!!!\nTeie panus:");
				panus = TextIO.getlnInt();
			}
			
			System.out.print("Ja mida Te arvate, kas tuleb kull või kiri?\n"
					+ "Teie pakkumine:");
			kasutajaArvab = TextIO.getln().toLowerCase();
			kullKiri = suvalineArv(0,1);
			if (kasutajaArvab.equals("kull") && kullKiri == 0) {
				System.out.println("Tubli, arvasite õigesti. Tuli kull. Teie\n" + kasutajaRaha +
						"-le rahale on lisatud " + 2*panus + " raha.");
				kasutajaRaha = kasutajaRaha + 2*panus;
			} else if (kasutajaArvab.equals("kull") && kullKiri == 1) {
				System.out.println("Kahjuks arvasite valesti. Tuli kiri. Proovige uuesti!!!");
				kasutajaRaha = kasutajaRaha - panus;
			} else if (kasutajaArvab.equals("kiri") && kullKiri == 0) {
				System.out.println("Kahjuks arvasite valesti. Tuli kull. Proovige uuesti!!!");
				kasutajaRaha = kasutajaRaha - panus;
			} else if (kasutajaArvab.equals("kiri") && kullKiri == 1) {
				System.out.println("Tubli, arvasite õigesti. Tuli kiri. Teie\n" + kasutajaRaha +
						"-le rahale on lisatud " + 2*panus + "r aha.");
				kasutajaRaha = kasutajaRaha + 2*panus;
			}
			if (kasutajaRaha != 0)
				System.out.println("Teil on hetkel " + kasutajaRaha + " raha.");
		}
		if (kasutajaRaha == 0)
			System.out.println("Teie raha on kahjuks otsas. Ehk läheb järgmine kord paremini ;)");
		else System.out.println("Oli meeldiv Teiega mängida. Teie lõpusummaks tuli" + kasutajaRaha);
		
	}
		
	public static int suvalineArv(int min, int max) {
		
		return min + (int)(Math.random()*(max - min + 1));
	}

}
