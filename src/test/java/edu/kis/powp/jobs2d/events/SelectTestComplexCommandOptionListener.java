package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.TriangleFigureComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestComplexCommandOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestComplexCommandOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new TriangleFigureComplexCommand().createCompoundCommand().execute(driverManager.getCurrentDriver());
    }
}
