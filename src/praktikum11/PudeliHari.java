package praktikum11;

import java.applet.Applet;
import java.awt.*;

public class PudeliHari extends Applet {
    /*
     * Ringjoone vo~rrand parameetrilisel kujul
     * x = r * cos(t)
     * y = r * sin(t)
     * t = -PI..PI
     */
    public void paint(Graphics g) {
        int x0 = 150; // Keskpunkt
        int y0 = 150;
        int r = 100; // Raadius
        int x, y;
        double t;

        // Kysime kui suur aken on?
        int w = getWidth();
        int h = getHeight();
        x0 = w/2;
        y0 = h/2;
        // Ta"idame tausta
        g.setColor(Color.red);
        g.fillRect(0, 0, w, h);

        // Joonistame
        g.setColor(Color.black);

        for (t = -Math.PI; t < Math.PI; t = t + Math.PI / 16) {
            x = (int) (r * Math.cos(t) + x0);
            y = (int) (r * Math.sin(t) + y0);
            g.drawLine(x0, y0, x, y);
        }
    }
}