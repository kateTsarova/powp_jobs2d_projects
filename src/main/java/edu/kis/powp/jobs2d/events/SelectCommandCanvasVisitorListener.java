package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.visitor.RectangleCanvas;
import edu.kis.powp.jobs2d.command.visitor.CommandCanvasVisitor;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.CommandsFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

public class SelectCommandCanvasVisitorListener implements ActionListener {

    private Logger logger = Logger.getLogger("global");
    private DriverManager driverManager ;
    private RectangleCanvas rectangleCanvas;

    public SelectCommandCanvasVisitorListener(DriverManager driverManager, RectangleCanvas rectangleCanvas) {
        this.driverManager = driverManager;
        this.rectangleCanvas = rectangleCanvas;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        logger.info("Testing Visitor for CommandCanvasVisitor");

        DriverCommand command = CommandsFeature.getDriverCommandManager().getCurrentCommand();
        if(command==null){
            logger.info("No command loaded");
        }else {
            CommandCanvasVisitor visitor = new CommandCanvasVisitor(rectangleCanvas);

            command.accept(visitor);

            if(visitor.checkIfAllPointsOnCanvas())
                logger.info("Not all points are on canvas");
            else
                logger.info("All points are on canvas");
        }
    }
}
