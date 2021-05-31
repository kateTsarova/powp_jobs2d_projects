package edu.kis.powp.jobs2d.command.figureFactories;

import edu.kis.powp.jobs2d.command.driverCommands.ICompoundCommands.ComplexCommand;
import edu.kis.powp.jobs2d.command.driverCommands.ICompoundCommands.ICompoundCommand;
import edu.kis.powp.jobs2d.command.driverCommands.OperateToCommand;
import edu.kis.powp.jobs2d.command.driverCommands.SetPositionCommand;

public class TriangleFigureComplexCommand implements FigureFactory {

    @Override
    public ICompoundCommand createCompoundCommand() {
        return new ComplexCommand.Builder()
                .addCommand(new SetPositionCommand(-120, -120))
                .addCommand(new OperateToCommand(120, -120))
                .addCommand(new OperateToCommand(120, 120))
                .addCommand(new OperateToCommand(-120, -120))
                .build();
    }
}
