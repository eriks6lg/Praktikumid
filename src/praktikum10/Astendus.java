package praktikum10;

public class Astendus {
	
	public static int astenda(int arv, int aste) {
		
		if (aste == 1)
			return arv;
		else {
			return arv*astenda(arv, aste-1);
		}
	}

}
