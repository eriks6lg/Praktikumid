package Praktikum7;

public class Massiiv {

	public static int maksimum(int[][] massiiv) {
		int max = 0;
		
		for (int i=0; i<massiiv.length; i++) {
			
			for (int j=0; j<massiiv[i].length; j++)
			
				if (massiiv[i][j]>max)
				max = massiiv[i][j];
		}
		return max;
	}
}
