package Praktikum7;
import lib.TextIO;

public class Vastupidi {
	
	public static void main(String[] args) {
		
		int arv = 10;
		Integer[] arvud = new Integer[arv];
		
		System.out.printf("Sisestage palun %s arvu!", arv);
		System.out.println();
		
		for (int i=1; i<=arv; i++) {
			
			System.out.printf("Arv %s: ", i);
			arvud[i-1] = TextIO.getlnInt();
		}
		
		for (int i=arv; i>=1; i--) {
			
			System.out.println(arvud[i-1]);
		}
		
	}
	
	

}
