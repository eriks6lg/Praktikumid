package praktikumm13;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Sorteerija {
	
	public static void main(String[] args) {
		
		String kataloogitee = Sorteerija.class.getResource(".").getPath();
	    
		System.out.println(kataloogitee);
	
		File file = new File(kataloogitee + "kala.txt");
	
		ArrayList<String> sonad = new ArrayList<String>();
		
		try {
		
			BufferedReader in = new BufferedReader(new FileReader(file));

			String rida;
			
			while ((rida = in.readLine()) != null) {
				sonad.add(rida);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Faili ei leitud: \n" + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Error, jee, mingi muu error: " + e.getMessage());
		}
		
		Collections.sort(sonad);
		
		for(String sona: sonad) {
			System.out.println(sona);
		}
	}

}
