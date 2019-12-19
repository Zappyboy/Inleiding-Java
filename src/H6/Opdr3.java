package H6;

import java.applet.Applet;
import java.awt.*;

public class Opdr3 extends Applet {
    int a, b, result;

    public void init() {
        int a =  2147483647;
        int b = 1;
        result = a + b;
    }

    public void paint(Graphics g) {
        g.drawString("Negatief getal: " + result, 20, 20);
    }
}
