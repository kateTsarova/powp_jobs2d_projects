package edu.kis.powp.jobs2d.command.visitor;

import edu.kis.powp.jobs2d.command.ICompoundCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public interface Visitor {
    void visitOperateToCommand(OperateToCommand operateToCommand);
    void visitSetPositionCommand(SetPositionCommand setPositionCommand);
    void visitICompoundCommand(ICompoundCommand iCompoundCommand);
}
