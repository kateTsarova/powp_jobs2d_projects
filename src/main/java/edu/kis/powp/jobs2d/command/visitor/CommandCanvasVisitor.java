package edu.kis.powp.jobs2d.command.visitor;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.ICompoundCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.transformation.Point;

import java.util.Iterator;

public class CommandCanvasVisitor implements Visitor {

    private final RectangleCanvas rectangleCanvas;
    private boolean allPointsOnCanvas = true;

    public CommandCanvasVisitor(RectangleCanvas rectangleCanvas) {
        this.rectangleCanvas = rectangleCanvas;
    }

    @Override
    public void visitOperateToCommand(OperateToCommand operateToCommand) {
        Point pointToCheck = new Point(operateToCommand.getPosX(), operateToCommand.getPosY());
        if(!rectangleCanvas.checkIfPointIsOnCanvas(pointToCheck))
            allPointsOnCanvas = false;
    }

    @Override
    public void visitSetPositionCommand(SetPositionCommand setPositionCommand) {
        Point pointToCheck = new Point(setPositionCommand.getPosX(), setPositionCommand.getPosY());
        if(!rectangleCanvas.checkIfPointIsOnCanvas(pointToCheck))
            allPointsOnCanvas = false;
    }

    @Override
    public void visitICompoundCommand(ICompoundCommand iCompoundCommand) {
        Iterator<DriverCommand> iterator = iCompoundCommand.iterator();
        while (iterator.hasNext()) {
            DriverCommand driverCommand = iterator.next();
            driverCommand.accept(this);
        }
    }

    public boolean checkIfAllPointsOnCanvas(){
        return allPointsOnCanvas;
    }

}
