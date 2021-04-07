package edu.kis.powp.legacy.drawer;

import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;

import org.w3c.dom.events.MouseEvent;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;

/**
 * Drawer test.
 *
 * @author Dominik
 */
public class TestDrawer {
    /**
     * Drawer test.
     */
    public static void main(String[] args) {
        DrawPanelController controller = new DrawPanelController();
        DefaultDrawerFrame.getDefaultDrawerFrame().setVisible(true);
        ILine line = LineFactory.getBasicLine();
        line.setStartCoordinates(-100, -60);
        line.setEndCoordinates(60, 130);
        controller.drawLine(line);

        DefaultDrawerFrame.getDefaultDrawerFrame().addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.println(e);
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.println(e);
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.println(e);
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.println(e);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.println(e);
            }

            @Override
            public void mouseDragged(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.println(e);
            }

            @Override
            public void mouseMoved(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.println(e);
            }
        });
    }
}
