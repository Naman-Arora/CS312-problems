package completed.february09;

import java.awt.*;
import addons.DrawingPanel;

public class ShowDesign {
    public static void main(String[] args) {
        DrawingPanel dp = new DrawingPanel(200, 200);
        Graphics g = dp.getGraphics();
        g.setColor(Color.BLACK);
        for (int i = 1; i <= 4; i++) {
            int factor = 20 * i;
            g.drawLine(factor, factor, factor, (200 - factor));
            g.drawLine(factor, factor, (200 - factor), factor);
            g.drawLine((200 - factor), factor, (200 - factor), (200 - factor));
            g.drawLine(factor, (200 - factor), (200 - factor), (200 - factor));
        }
    }
}
