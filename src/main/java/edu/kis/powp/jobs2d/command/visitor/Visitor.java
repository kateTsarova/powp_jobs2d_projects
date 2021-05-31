package edu.kis.powp.jobs2d.command.visitor;

import edu.kis.powp.jobs2d.command.driverCommands.ICompoundCommands.ICompoundCommand;
import edu.kis.powp.jobs2d.command.driverCommands.OperateToCommand;
import edu.kis.powp.jobs2d.command.driverCommands.SetPositionCommand;

public interface Visitor {
    void visitOperateToCommand(OperateToCommand operateToCommand);
    void visitSetPositionCommand(SetPositionCommand setPositionCommand);
    void visitICompoundCommand(ICompoundCommand iCompoundCommand);
}
