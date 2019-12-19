package H2;

import java.awt.*;
import java.applet.*;

public class Opdr2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Zapp", 50, 60 );

        g.setColor(Color.red);
        g.drawString("Flick", 50, 70 );
    }

}