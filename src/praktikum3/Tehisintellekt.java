package praktikum3;

import lib.TextIO;


public class Tehisintellekt {

		public static void main(String[] args) {
			
			System.out.print("Tervist! Küsin teie käest Teie käest kaks vanust!\n1:");
			int vanus1 = TextIO.getlnInt();
			while (vanus1<0) {
				System.out.print("Vanus ei saa olla negatiivne arv!!!\n1:");
				vanus1 = TextIO.getlnInt();
			}
			System.out.print("2:");
			int vanus2 = TextIO.getlnInt();
			while (vanus2<0) {
				System.out.print("Vanus ei saa olla negatiivne arv!!!\n1:");
				vanus2 = TextIO.getlnInt();
			}
			int vahe;
			if (vanus1>vanus2) {
				vahe = vanus1-vanus2;
				if (vahe>5 && vahe<11) {
					System.out.println("Vanusevahe päris suur. Mõtle selle peale");
					
				}
				if (vahe>10) {
					System.out.println("Vanusevahe liiga suur. Ei saa sinust aru");
				}
				if (vahe<5) {
					System.out.println("Vanusevahe sobib. Oled tubli :)");
				}
			}
			if (vanus2>vanus1) {
				vahe = vanus2-vanus1;
				if (vahe>5 && vahe<11) {
					System.out.println("Vanusevahe päris suur. Mõtle selle peale");
					
				}
				if (vahe>10) {
					System.out.println("Vanusevahe liiga suur. Ei saa sinust aru");
				}
				if (vahe<5) {
					System.out.println("Vanusevahe sobib. Oled tubli :)");
				}
			}
		}
}