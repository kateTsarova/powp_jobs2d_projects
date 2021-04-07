package edu.kis.powp.jobs2d.events;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import javax.swing.event.MouseInputListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestMouseListener implements ActionListener {

    private DriverManager driverManager;
    private Application application;

    public SelectTestMouseListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    public SelectTestMouseListener(DriverManager driverManager, Application application) {
        this.driverManager = driverManager;
        this.application = application;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        application.getFreePanel().addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                int width = application.getFreePanel().getWidth();
                int height = application.getFreePanel().getHeight();
                if(e.getButton() == 1){
                    driverManager.getCurrentDriver().operateTo(e.getX() - width / 2, e.getY() - height / 2);
                    driverManager.getCurrentDriver().setPosition(e.getX() - width / 2, e.getY() - height / 2);
                }
                else if(e.getButton() == 3){
                    driverManager.getCurrentDriver().setPosition(e.getX() - width / 2, e.getY() - height / 2);
                }
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
            }

            @Override
            public void mouseDragged(java.awt.event.MouseEvent e) {
            }

            @Override
            public void mouseMoved(java.awt.event.MouseEvent e) {
            }
        });
    }
}
