package edu.kis.powp.jobs2d.command;

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
