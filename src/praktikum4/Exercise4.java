package praktikum4;

public class Exercise4 {

	public static void main(String[] args) {
		
		for (int rida = 1; rida <= 7; rida++) {
			
			for (int tulp = 1; tulp <= 7; tulp++ ) {
				int zero = 0;
				int one = 1;
				if (tulp == rida) {
					System.out.printf("%s ", one);
				}
				else {
					System.out.printf("%s ", zero);
				}
			}
			System.out.println();	
			
		}
	}
}
