package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private final List<DriverCommand> commands;

    private ComplexCommand(List<DriverCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute(Job2dDriver driver) {
        commands.forEach(c -> c.execute(driver));
    }

    public static final class Builder {
        private final List<DriverCommand> commands = new ArrayList<>();

        public Builder addCommand(DriverCommand command) {
            commands.add(command);
            return this;
        }

        public ComplexCommand build() {
            return new ComplexCommand(new ArrayList<>(commands));
        }
    }
}
