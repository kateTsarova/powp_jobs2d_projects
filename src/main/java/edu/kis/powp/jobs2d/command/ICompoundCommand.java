package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.command.visitor.Visitor;

import java.util.Iterator;

/**
 * Interface extending Job2dDriverCommand to execute more than one command.
 */
public interface ICompoundCommand extends DriverCommand {
    Iterator<DriverCommand> iterator();

    @Override
    default void accept(Visitor visitor) {
        visitor.visitICompoundCommand(this);
    }

    default ICompoundCommand clone() {
        return null;
    }
}
