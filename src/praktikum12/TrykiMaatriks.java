package praktikum12;

public class TrykiMaatriks {
	
	public static void main(String[] args) {
		
		int [][] neo = {
				{1, 1, 1, 1, 1},
				{2, 3, 4, 5, 6},
				{3, 4, 5, 6, 7},
				{4, 5, 6, 7, 8},
				{5, 6, 7, 8, 9},
		};
		tryki(neo);
		
	}
	
	
	public static void tryki(int[][] maatriks) {
		
		
		
		for(int rida=0; rida<maatriks.length; rida++) {
			
			for(int tulp=0; tulp<maatriks[rida].length; tulp++) {
				
				System.out.print(maatriks[rida][tulp] + " ");
			}
			System.out.println();
		}
	}

}
