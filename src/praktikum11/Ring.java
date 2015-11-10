package praktikum11;

import java.awt.*;
import java.applet.Applet;


public class Ring extends Applet {
	

    private Graphics g;
    
    public void paint(Graphics g) {
        this.g = g;
        joonistaTaust();
        joonistaRing();
    }
    
    /**
     * Katab tausta valgega
     */
    public void joonistaTaust() {
        int w = getWidth();
        int h = getHeight();
        g.setColor(Color.white);
        g.fillRect(0, 0, w, h);
    }
    
    /**
     * Joonistab ringi
     */
    public void joonistaRing() {
        g.setColor(Color.black);
        int keskkohtX = getWidth() / 2;
        int keskkohtY = getHeight() / 2;
        int raadius = 50;
        
        for (int i = 0; i<100; i=i+2) {
        	
        	
        	for (double nurk = 0; nurk <= Math.PI * 2; nurk = nurk + .03) {
        		int x = (int) ((raadius-i*2) * Math.cos(nurk));
        		int y = (int) ((raadius-i*2) * Math.sin(nurk));
        		g.fillRect(keskkohtX + ((x-(int)nurk)), keskkohtY + ((y-(int)nurk)), 2, 2);
        	}
        }
    }

}
