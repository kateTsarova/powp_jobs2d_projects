package edu.kis.powp.jobs2d.events;

import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.MouseControlsFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestMouseListener implements ActionListener {

    private MouseControlsFeature feature = null;

    public SelectTestMouseListener(DriverManager driverManager, Application application) {
        this.feature = new MouseControlsFeature(driverManager, application.getFreePanel());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        feature.attachListeners();
    }
}
