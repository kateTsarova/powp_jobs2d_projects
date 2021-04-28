package edu.kis.powp.jobs2d.command.visitor;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.ICompoundCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.LinkedList;
import java.util.List;

public class CommandDeepCopyVisitor implements Visitor {

    private final List<DriverCommand> driverCommands = new LinkedList<>();

    @Override
    public void visitOperateToCommand(OperateToCommand operateToCommand) {
        driverCommands.add(operateToCommand.clone());
    }

    @Override
    public void visitSetPositionCommand(SetPositionCommand setPositionCommand) {
        driverCommands.add(setPositionCommand.clone());
    }

    @Override
    public void visitICompoundCommand(ICompoundCommand iCompoundCommand) {
        driverCommands.add(iCompoundCommand.clone());
    }

    public List<DriverCommand> getCopy() {
        return driverCommands;
    }
}
