package praktikum11;
import java.applet.Applet;
import java.awt.*;


public class ValgeMust extends Applet {
	
	public void paint(Graphics g) {
		
		g.setColor(new Color(255,255,255));
		g.fillRect(0, 0, getWidth(), getHeight());
		for(int i = 0; i<getHeight(); i++) {
			
			int kood = (i*255/(getHeight()));
			g.setColor(new Color(255-kood, 255-kood, 255-kood));
			g.drawLine(0, i, getWidth(), i);
		}
		
	}

}
