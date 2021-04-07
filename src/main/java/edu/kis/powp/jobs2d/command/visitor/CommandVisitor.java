package edu.kis.powp.jobs2d.command.visitor;

import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class CommandVisitor implements Visitor {

    private long operateToCounter;
    private long setPositionCounter;

    @Override
    public void visitOperateToCommand(OperateToCommand operateToCommand) {
        System.out.println("Operate to counter: " + operateToCounter++);
    }

    @Override
    public void visitSetPositionCommand(SetPositionCommand setPositionCommand) {
        System.out.println("Set position counter: " + setPositionCounter++);
    }

    public long getOperateToCounter() {
        return operateToCounter;
    }

    public long getSetPositionCounter() {
        return setPositionCounter;
    }

    public String toString() {
        return "Operate to: " + operateToCounter + " set position: " + setPositionCounter + " .";
    }
}
