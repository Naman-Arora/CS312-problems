package completed.february11;

import java.awt.*;
import addons.DrawingPanel;

public class Triangle {
    public static void main(String[] args) {
        DrawingPanel dp = new DrawingPanel(600, 200);
        Graphics g = dp.getGraphics();
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 600, 200);
        g.setColor(Color.BLUE);
        g.drawLine(0, 0, 300, 200);
        g.drawLine(600, 0, 300, 200);
        for (int i = 1; i <= 19; i++) {
            int firstX = 15 * i;
            int secondX = 600 - (15 * i);
            int coordY = 10 * i;

            g.drawLine(firstX, coordY, secondX, coordY);
        }
    }
}
