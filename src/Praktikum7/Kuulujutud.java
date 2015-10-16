package Praktikum7;

public class Kuulujutud {
	
	public static void main(String[] args) {
		
		String[] naised = {"Maarika", "Jessica", "Sandra", "Johanna", "Liisa"};
		String[] mehed = {"Johannest", "Marti", "Jürit", "Juhanit", "Joosepit"};
		String[] teod = {"armastab", "petab", "jumaldab", "kardab", "vihkab"};
		
		System.out.println(suvaline(naised) + " " + suvaline(teod) + " "
				+ suvaline(mehed));

	}
	public static String suvaline(String[] kogum) {
		String valik = kogum[(int)(Math.random()*(kogum.length))];
		return valik;
	}

}
