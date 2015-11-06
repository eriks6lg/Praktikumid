package praktikum10;
import java.io.File;
import java.util.Arrays;

public class Failinimekiri {

	public static void trykiFailid(String kataloogiTee) {

        File kataloog = new File(kataloogiTee);
        File[] failid = kataloog.listFiles();
        Arrays.sort(failid);
        
        

        for (File file : failid) {
        	String uusTee = kataloogiTee + "/" + file.getName();
        	
            if (file.isDirectory()) {
                System.out.print("Kataloog: ");
                trykiFailid(uusTee);
            }
            else {
                System.out.print("Fail:     ");
            }
            System.out.println(file.getAbsoluteFile());
            
        }
        
    }
	public static void main(String[] args) {
        trykiFailid("/");
    }
}
