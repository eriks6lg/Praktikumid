package praktikum4;

import lib.TextIO;

public class Ex5 {

	public static void main(String[] args) {

System.out.println("Sisestage positiivne t‰isarv, millest saab ka kasti suuruse m‰‰raja.");
		int suurus = TextIO.getlnInt();
		int tulp;
		for (int rida = 1; rida <= suurus + 2; rida++) {
			
			if ((rida == 1) || (rida == suurus + 2)) {
				for (tulp = 1; tulp <= suurus + 2; tulp++) {
					System.out.print("--");
				}
				System.out.println();
			} else {
			for ( tulp = 1; tulp <= suurus + 2; tulp++ ) {
				int zero  = 0;
				int one = 1;
				if ((tulp == 1) || (tulp == suurus + 2)) {
					System.out.printf("| ");
				}
				else if ((tulp == rida  ) || (tulp-3 == (suurus - rida ))) {
					System.out.printf("x ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();	
			
		} }
	}
}
