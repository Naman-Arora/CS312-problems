package completed.february09;

import java.awt.*;
import addons.DrawingPanel;

public class MickeyBox {
    public static void main(String[] args) {
        DrawingPanel dp = new DrawingPanel(220, 150);
        Graphics g = dp.getGraphics();
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 220, 150);
        g.setColor(Color.BLUE);
        g.fillOval(50, 25, 40, 40);
        g.fillOval(130, 25, 40, 40);
        g.setColor(Color.RED);
        g.fillRect(70, 45, 80, 80);
        g.setColor(Color.BLACK);
        g.drawLine(70, 85, 150, 85);
    }
}
