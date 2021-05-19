package edu.kis.powp.jobs2d.command.visitor;

import edu.kis.powp.jobs2d.command.*;

import java.util.Iterator;

public class CommandDeepCopyVisitor implements Visitor {

    private ComplexCommand copiedCommands;

    @Override
    public void visitOperateToCommand(OperateToCommand operateToCommand) {
        copiedCommands = new ComplexCommand.Builder()
                .addCommand(new OperateToCommand(operateToCommand.getPoint().x, operateToCommand.getPoint().y))
                .build();
    }

    @Override
    public void visitSetPositionCommand(SetPositionCommand setPositionCommand) {
        copiedCommands = new ComplexCommand.Builder()
                .addCommand(new OperateToCommand(setPositionCommand.getPoint().x, setPositionCommand.getPoint().y))
                .build();
    }

    @Override
    public void visitICompoundCommand(ICompoundCommand iCompoundCommand) {
        Iterator<DriverCommand> commandIterator = iCompoundCommand.iterator();
        ComplexCommand.Builder builder = new ComplexCommand.Builder();

        while (commandIterator.hasNext()) {
            CommandDeepCopyVisitor temporaryVisitor = new CommandDeepCopyVisitor();
            commandIterator.next().accept(temporaryVisitor);
            builder.addCommand(temporaryVisitor.getCopy());
        }
        copiedCommands = builder.build();
    }

    public ComplexCommand getCopy() {
        return copiedCommands;
    }
}
