package edu.kis.powp.jobs2d.command.visitor;

import edu.kis.powp.jobs2d.command.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CommandDeepCopyVisitor implements Visitor {

    private final List<DriverCommand> driverCommands = new LinkedList<>();

    @Override
    public void visitOperateToCommand(OperateToCommand operateToCommand) {
        driverCommands.add(new OperateToCommand(operateToCommand.getPoint().x, operateToCommand.getPoint().y));
    }

    @Override
    public void visitSetPositionCommand(SetPositionCommand setPositionCommand) {
        driverCommands.add(new OperateToCommand(setPositionCommand.getPoint().x, setPositionCommand.getPoint().y));
    }

    @Override
    public void visitICompoundCommand(ICompoundCommand iCompoundCommand) {
        Iterator<DriverCommand> commandIterator = iCompoundCommand.iterator();
        while (commandIterator.hasNext()) {
            commandIterator.next().accept(this);
        }
    }

    public List<DriverCommand> getCopy() {
        return driverCommands;
    }
}
