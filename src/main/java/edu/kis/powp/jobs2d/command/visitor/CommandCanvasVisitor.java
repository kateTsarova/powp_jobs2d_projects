package edu.kis.powp.jobs2d.command.visitor;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.ICompoundCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.transformation.Point;

import java.util.Iterator;

public class CommandCanvasVisitor implements Visitor {

    private final Canvas canvas;
    private boolean allPointsOnCanvas = true;

    public CommandCanvasVisitor(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void visitOperateToCommand(OperateToCommand operateToCommand) {
        Point pointToCheck = new Point(operateToCommand.getPosX(), operateToCommand.getPosY());
        allPointsOnCanvas = canvas.checkIfPointIsOnCanvas(pointToCheck);
    }

    @Override
    public void visitSetPositionCommand(SetPositionCommand setPositionCommand) {
        Point pointToCheck = new Point(setPositionCommand.getPosX(), setPositionCommand.getPosY());
        allPointsOnCanvas = canvas.checkIfPointIsOnCanvas(pointToCheck);
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
