package edu.kis.powp.jobs2d.command;

public class TriangleFigureComplexCommand implements FigureComplexCommandFactory {

    @Override
    public ComplexCommand createComplexCommand() {
        return new ComplexCommand.Builder()
                .addCommand(new SetPositionCommand(-120, -120))
                .addCommand(new OperateToCommand(120, -120))
                .addCommand(new OperateToCommand(120, 120))
                .addCommand(new OperateToCommand(-120, -120))
                .build();
    }
}
