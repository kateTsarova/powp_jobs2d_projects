package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.visitor.CommandTypeCounterVisitor;
import edu.kis.powp.jobs2d.features.CommandsFeature;

public class SelectCurrentCommandCounter implements ActionListener {
    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);


    @Override
    public void actionPerformed(ActionEvent e) {
        DriverCommand command = CommandsFeature.getDriverCommandManager().getCurrentCommand();
        CommandTypeCounterVisitor visitor = new CommandTypeCounterVisitor();
        command.accept(visitor);
        logger.info(visitor.toString());
    }

}
