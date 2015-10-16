package praktikum6;
import lib.TextIO;

public class ArvamisM2ng {
	
	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		
		
		int arv = suvalineArv(min, max);
		System.out.printf("See on äraarvamisemäng. Arvuti genereeris arvu %dst %dni.\n"
				+ "Sinu ülesanne on see arv ära arvata.\nSinu pakkumine:", min, max);
		int pakkumine = TextIO.getlnInt();
		
		
		while (pakkumine!= arv) {
			if (pakkumine > max || pakkumine < min) {
				System.out.print("Arv pole nõutavas vahemikus. Proovi uuesti!!!\nSinu pakkumine:");
			} else if (pakkumine>arv) {
				System.out.print("Sinu pakkumine on liiga kõrge. Proovi uuesti!!!\nSinu pakkumine:");
			} else if (pakkumine<arv) {
				System.out.print("Sinu pakkumine on liiga madal. Proovi uuesti!!!\nSinu pakkumine:");
			}
			pakkumine = TextIO.getlnInt();
			if (pakkumine == arv) break;
			}
		
		
		System.out.printf("Tubli. Arvasid õigesti. Õige arv oligi %d.", arv);
		
		
		
		
	
}
	public static int suvalineArv(int min, int max) {
		
		return min + (int)(Math.random()*(max - min + 1));
	}

}
