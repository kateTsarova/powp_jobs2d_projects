package testClass;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.ICompoundCommand;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CompoundCommandTest implements ICompoundCommand {
    String name;
    List<DriverCommand> driverCommands;

    public CompoundCommandTest(List<DriverCommand> driverCommands, String name) {
        this.driverCommands = driverCommands;
        this.name = name;
    }

    public CompoundCommandTest(List<DriverCommand> driverCommands) {
        this.driverCommands = driverCommands;
    }

    private CompoundCommandTest() {
    }

    @Override
    public void execute(Job2dDriver driver) {
        driverCommands.forEach((c) -> c.execute(driver));
    }

    @Override
    public Iterator<DriverCommand> iterator() {
        return driverCommands.iterator();
    }

    @Override
    public ICompoundCommand clone() {
        CompoundCommandTest cloneCompoundCommand = new CompoundCommandTest();
        cloneCompoundCommand.driverCommands = new LinkedList<>();

        this.driverCommands.forEach((e) -> cloneCompoundCommand.driverCommands.add(e.clone()));
        cloneCompoundCommand.name = this.name;
        return cloneCompoundCommand;

    }

    public List<DriverCommand> getDriverCommands() {
        return driverCommands;
    }

    @Override
    public String toString() {
        return name;
    }
}
