package edu.kis.powp.jobs2d.events;

import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.MouseFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestMouseListener implements ActionListener {

    private DriverManager driverManager;
    private Application app;
    private boolean listenersAttached = false;

    public SelectTestMouseListener(DriverManager driverManager, Application application) {
        this.app = application;
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (listenersAttached) return;
        new MouseFeature(driverManager, app.getFreePanel()).attachListeners();
        listenersAttached = true;
    }
}
