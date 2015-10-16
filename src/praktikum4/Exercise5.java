package praktikum4;

import lib.TextIO;

public class Exercise5 {

	public static void main(String[] args) {

		System.out.println("Sisestage positiivne t‰isarv, millest saab ka kasti suuruse m‰‰raja.");
		int suurus = TextIO.getlnInt();

		for (int rida = 1; rida <= suurus; rida++) {

			for (int tulp = 1; tulp <= suurus; tulp++) {
				String printija;
				if((tulp == 1) || (tulp == suurus)) {
					printija = "| ";
				} else {
					if ((tulp == rida) || (tulp == (rida - tulp))) {
						printija = "x";
					} else {
						printija = "0";
					}
				}
				System.out.printf("%s", printija);
			}
			System.out.println();

		}
	}
}
