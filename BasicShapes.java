import javax.swing.*;
import java.awt.*;

public class BasicShapes extends JPanel {

    public void paint(Graphics g) {

        super.paint(g);

        // Background
        setBackground(Color.WHITE);

        // LINE
        g.drawLine(50, 50, 200, 50);

        // RECTANGLE
        g.setColor(Color.RED);
        g.drawRect(50, 80, 120, 80);

        // FILLED RECTANGLE
        g.setColor(Color.BLUE);
        g.fillRect(220, 80, 120, 80);

        // CIRCLE
        g.setColor(Color.GREEN);
        g.drawOval(50, 200, 100, 100);

        // FILLED CIRCLE
        g.setColor(Color.ORANGE);
        g.fillOval(220, 200, 100, 100);

        // TRIANGLE
        g.setColor(Color.BLACK);

        int x[] = {400, 450, 350};
        int y[] = {200, 300, 300};

        g.drawPolygon(x, y, 3);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("CGP Basic Shapes");

        BasicShapes panel = new BasicShapes();

        frame.add(panel);

        frame.setSize(600, 450);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}