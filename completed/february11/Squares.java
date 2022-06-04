package completed.february11;

import java.awt.*;
import addons.DrawingPanel;

public class Squares {
    public static void main(String[] args) {
        DrawingPanel dp = new DrawingPanel(300, 200);
        Graphics g = dp.getGraphics();
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 300, 200);
        g.setColor(Color.RED);
        for (int i = 1; i <= 5; i++) {
            int dim = 20 * i;
            g.drawRect(50, 50, dim, dim);
        }
        g.setColor(Color.BLACK);
        g.drawLine(50, 50, 150, 150);
    }
}
