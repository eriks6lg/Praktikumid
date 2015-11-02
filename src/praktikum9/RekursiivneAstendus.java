package praktikum9;

public class RekursiivneAstendus {

	public static void main(String[] args) {
		
		System.out.println(astenda(2,3));
	}
	
	public static int astenda(int arv, int aste) {
		
		if (aste==1)
			return arv;
		else {
			return arv*astenda(arv, aste-1);
		}
		
	}
}
