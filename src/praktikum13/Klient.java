package praktikum13;
import java.io.*;

public class Klient {
	
	String nimi;
	int vanus;
	int kinganumber;
	
	public Klient(String nimi, int vanus, int kinganumber) {
		this.nimi = nimi;
		this.vanus = vanus;
		this.kinganumber = kinganumber;
		
	}
	
	public static void main(String[] args) {
		
		
	}
	
	public String getNimi() {
		return this.nimi;
	}
	public int getVanus() {
		return this.vanus;
	}
	public int getKinganumber() {
		return this.kinganumber;
	}
	
	public void trykiKliendid() {
		
		
	}
	public void lisaKlient(Object o) {
		
		String kataloogitee = Klient.class.getResource(".").getPath();
		FileOutputStream fileOut = new FileOutputStream(kataloogitee + "kliendid.ser");
		
		
	}
	public void kustutaKlient() {
		
		
	}

}
