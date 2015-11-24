package praktikum14;
import java.awt.*;
import java.applet.Applet;


public class Graafiline extends Applet {
	
    Graphics gr;
    
    public void paint(Graphics g) {
     
       g.setColor(new Color(255, 255, 255));
       g.fillRect(0, 0, getWidth(), getHeight());
       
    }
    
    public void joonistaPunkt(Punkt punkt) {
    	this.paint(gr);
    	gr.setColor(Color.BLACK);
    	gr.fillOval(punkt.x, punkt.y, 1, 1);
    	
    	
    }

}
