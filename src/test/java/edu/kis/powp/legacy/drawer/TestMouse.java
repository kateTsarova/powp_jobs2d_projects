package edu.kis.powp.legacy.drawer;

import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;

import org.w3c.dom.events.MouseEvent;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;

/**
 * Mouse test.
 *
 * @author Wiktor & Mateusz
 */
public class TestMouse {
    /**
     * Mouse test.
     */

    private static int lineStartX = 0;
    private static int lineStartY = 0;
    private static boolean lineStarted = false;
    private static DefaultDrawerFrame frame = DefaultDrawerFrame.getDefaultDrawerFrame();

    public static void main(String[] args) {
        DrawPanelController controller = new DrawPanelController();
        frame.setVisible(true);

        frame.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {}

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
              int width = frame.getWidth();
              int height = frame.getHeight();
                if (!lineStarted) {
                    lineStartX = e.getX() - width / 2;
                    lineStartY = e.getY() - height / 2;
                    lineStarted = true;
                } else {
                    ILine line = LineFactory.getBasicLine();
                    line.setStartCoordinates(lineStartX, lineStartY);
                    line.setEndCoordinates(e.getX() - width / 2, e.getY() - height / 2);
                    controller.drawLine(line);
                    lineStarted = false;
                }
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {}

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {}

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {}

            @Override
            public void mouseDragged(java.awt.event.MouseEvent e) {}

            @Override
            public void mouseMoved(java.awt.event.MouseEvent e) {}
        });
    }
}
