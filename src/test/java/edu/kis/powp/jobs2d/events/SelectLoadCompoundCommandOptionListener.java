package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.*;
import edu.kis.powp.jobs2d.command.manager.DriverCommandManager;
import edu.kis.powp.jobs2d.features.CommandsFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SelectLoadCompoundCommandOptionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ICompoundCommand command = new TriangleFigureComplexCommand().createCompoundCommand();
        CommandsFeature.getDriverCommandManager().setCurrentCommand(command);
    }
}
