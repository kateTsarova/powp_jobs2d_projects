package edu.kis.powp.jobs2d.command.visitor;

import edu.kis.powp.jobs2d.command.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CommandDeepCopyVisitor implements Visitor {

    private final List<DriverCommand> driverCommands = new LinkedList<>();

    @Override
    public void visitOperateToCommand(OperateToCommand operateToCommand) {
        driverCommands.add(new OperateToCommand(operateToCommand.getPosX(), operateToCommand.getPosY()));
    }

    @Override
    public void visitSetPositionCommand(SetPositionCommand setPositionCommand) {
        driverCommands.add(new OperateToCommand(setPositionCommand.getPosX(), setPositionCommand.getPosY()));
    }

    @Override
    public void visitICompoundCommand(ICompoundCommand iCompoundCommand) {
        Iterator<DriverCommand> commandIterator = iCompoundCommand.iterator();
        List<DriverCommand> commandHandler = new LinkedList<>();

        while (commandIterator.hasNext()) {
            DriverCommand item = commandIterator.next();
            commandHandler.add(item);
        }

        driverCommands.add(new CompoundCommand(commandHandler));
    }

    public List<DriverCommand> getCopy() {
        return driverCommands;
    }
}
