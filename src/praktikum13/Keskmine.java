package praktikum13;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Keskmine {
	
	public static void main(String[] args) {
		
		String kataloogitee = Sorteerija.class.getResource(".").getPath();
	    
		System.out.println(kataloogitee);
	
		File file = new File(kataloogitee + "kala.txt");
	
		ArrayList<Double> arvud = new ArrayList<Double>();
		
		try {
		
			BufferedReader in = new BufferedReader(new FileReader(file));

			String arv;
			
			while ((arv = in.readLine()) != null) {
				double parisArv = Double.parseDouble(arv);
				arvud.add(parisArv);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Faili ei leitud: \n" + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Error, jee, mingi muu error: " + e.getMessage());
		}
		
		double summa = 0;
		
		for (double arv: arvud) {
			summa += arv;
			
		}
		
		double keskmine =  summa / arvud.size();
		System.out.println(keskmine);
	}

}
