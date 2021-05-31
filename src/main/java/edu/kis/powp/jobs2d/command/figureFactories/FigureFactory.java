package edu.kis.powp.jobs2d.command.figureFactories;

import edu.kis.powp.jobs2d.command.driverCommands.ICompoundCommands.ICompoundCommand;

public interface FigureFactory {
    ICompoundCommand createCompoundCommand();
}