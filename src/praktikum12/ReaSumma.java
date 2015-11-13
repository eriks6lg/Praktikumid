package praktikum12;

public class ReaSumma {
	
	public static void main(String[] args) {
		
		
		int [][] neo = {
				{1, 1, 1},
				{2, 3, 4},
				{3, 4, 5},
				{4, 5, 6},
				{5, 6, 7},
		};
		

		
		
		int[][] maatriks = transponeeri(neo);
		
		tryki(maatriks);
		
	}

	
	public static int[] ridadeSummad(int[][] maatriks) {
		
		int[] ridadeSummad = new int[maatriks.length];
		
		for(int rida=0; rida<maatriks.length; rida++) {
			
			int summa = 0;
			
			for(int tulp=0; tulp<maatriks[rida].length; tulp++) {
				
				summa += maatriks[rida][tulp];
				
			}
			
			ridadeSummad[rida] = summa;	
			
		}
		
		
		
		return ridadeSummad;
	}
	
	public static void tryki(int[][] maatriks) {
		
		for(int rida=0; rida<maatriks.length; rida++) {
			
			for(int tulp=0; tulp<maatriks[rida].length; tulp++) {
				
				System.out.print(maatriks[rida][tulp] + " ");
			}
			System.out.println();
		}
	}
	
	public static void trykiUks(int[] massiiv) {
		
		for (int i=0; i<massiiv.length; i++) {
			
			System.out.printf("%d ",massiiv[i]);
		}
	}

	public static int korvalDiagonaaliSumma(int[][] maatriks) {
		
		int summa = 0;
		
		for (int rida=0; rida<maatriks.length; rida++) {
			
			summa += maatriks[rida][maatriks[rida].length-1-rida];
			
		}
		
		return summa;
	}

	public static int[] ridadeMaksimumid(int[][] maatriks) {
		
		int[] ridadeMaksimumid = new int[maatriks.length];
		
		for (int rida=0; rida<maatriks.length; rida++) {
			
			int reaMaksimum = 0;
			for (int tulp = 0; tulp<maatriks[rida].length; tulp++) {
				
				if (maatriks[rida][tulp] > reaMaksimum) {
					reaMaksimum = maatriks[rida][tulp];
				}
					
			}
			ridadeMaksimumid[rida] = reaMaksimum;
		}
		
		
		return ridadeMaksimumid;
		
	}

	public static int miinimum(int[][] maatriks) {
		
		int miinimum = Integer.MAX_VALUE;
		
		for (int rida=0; rida<maatriks.length; rida++) {
			
			for (int tulp=0; tulp<maatriks[rida].length; tulp++) {
				
				if(maatriks[rida][tulp]<miinimum)
					miinimum = maatriks[rida][tulp];
			}
			
		}
		
		
		return miinimum;
	}

	public static int[][] kahegaJaakMaatriks(int ridu, int veerge) {
		
		int[][] kahegaJaakMaatriks = new int[ridu][veerge];
		
		for (int rida=0; rida<ridu; rida++) {
			
			for (int tulp=0; tulp<veerge; tulp++) {
				
				kahegaJaakMaatriks[rida][tulp] = (rida+tulp)%2;
			}
		}
		
		
		return kahegaJaakMaatriks;
		
		
	}

	public static int[][] transponeeri(int[][] maatriks) {
		
		int[][] transponeeri = new int[maatriks[1].length][maatriks.length];
		
		for (int rida=0; rida<transponeeri.length; rida++) {
			
			for (int tulp=0; tulp<transponeeri[rida].length; tulp++) {
				
				transponeeri[rida][tulp] = maatriks[tulp][rida];
				
				
			}
			
		}
		
		
		return transponeeri;
		
	}
}
