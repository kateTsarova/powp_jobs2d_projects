package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.MouseControlsFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class SelectTestMouseListener implements ActionListener {

    private MouseControlsFeature feature = null;

    public SelectTestMouseListener(DriverManager driverManager, JPanel panel) {
        this.feature = new MouseControlsFeature(driverManager, panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        feature.attachListeners();
    }
}
