package praktikum9;
import lib.TextIO;
import java.util.ArrayList;

public class Tulpdiagrammid {

	public static void main(String[] args) {
		
		System.out.println("Tere! See programm koostab tulpdiagrammi,\n"
				+ "mille iga tulba suuruse j‰rgnevalt m‰‰rate.\n"
				+ "Sisestuste lıpetamiseks sisestage 0.");
		ArrayList<Integer> tulbad = new ArrayList<Integer>();
		int i = 0;
		while(true) {
			i++;
			System.out.printf("Tulp %d: ", i);
			int tulp = TextIO.getlnInt();
			if (tulp == 0)
				break;
			tulbad.add(tulp);
		}
		for (int j = 0; j<tulbad.size(); j++) {
			StringBuffer buffer = new StringBuffer();
			for (int k=0; k<tulbad.get(j); k++) {
				
				buffer.append("X");
			}
			String iksid = buffer.toString();
			System.out.printf("%d  %s", tulbad.get(j), iksid);
			System.out.println();
		}

	}

}
