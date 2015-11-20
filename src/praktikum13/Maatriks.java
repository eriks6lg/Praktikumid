package praktikum13;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Maatriks {
	
	public static void main(String[] args) {
		
		String kataloogitee = Sorteerija.class.getResource(".").getPath();
	    
		System.out.println(kataloogitee);
	
		File file = new File(kataloogitee + "kala.txt");
	
		ArrayList<String> arvud = new ArrayList<String>();
		
		try {
		
			BufferedReader in = new BufferedReader(new FileReader(file));

			String arv;
			
			while ((arv = in.readLine()) != null) {
				arvud.add(arv);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Faili ei leitud: \n" + e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println("Error, jee, mingi muu error: " + e.getMessage());
		}
		
		int[][] maatriks = new int[arvud.size()][arvud.get(0).length()];
		
		for (int rida = 0; rida<maatriks.length; rida++ ) {
			
			for (int tulp = 0; tulp<arvud.get(rida).length(); tulp++) {
				char kindelArv = arvud.get(rida).charAt(tulp);
				String kindelArvString = String.valueOf(kindelArv);
				int arvInt = Integer.parseInt(kindelArvString);
				maatriks[rida][tulp] = arvInt;
				
//				System.out.println((int)(arvud.get(rida).charAt(tulp)));
			}
		}
		
		
		
		int[][] transponeeritud = transponeeri(maatriks);
		
		tryki(transponeeritud);
		
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
	public static void tryki(int[][] maatriks) {
		
		for(int rida=0; rida<maatriks.length; rida++) {
			
			for(int tulp=0; tulp<maatriks[rida].length; tulp++) {
				
				System.out.print(maatriks[rida][tulp] + " ");
			}
			System.out.println();
		}
	}

}
