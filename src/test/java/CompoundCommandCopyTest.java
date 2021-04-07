import edu.kis.powp.jobs2d.command.DriverCommand;
import org.junit.Test;
import testClass.CompoundCommandTest;
import testClass.OperateToCommandTest;

import java.util.ArrayList;
import java.util.List;

public class CompoundCommandCopyTest {

    @Test
    public void cloneTest() {

        OperateToCommandTest first = new OperateToCommandTest(-20, -50);
        OperateToCommandTest second = new OperateToCommandTest(-20, -50);

        List<DriverCommand> commands = new ArrayList<DriverCommand>();
        commands.add(first);
        commands.add(second);

        CompoundCommandTest orginalCompoudCommand = new CompoundCommandTest(commands);


        CompoundCommandTest copyCompoudCommand = (CompoundCommandTest) orginalCompoudCommand.clone();
        first.move(1, 1);
        second.move(1, 1);

        List<DriverCommand> copyCommands = copyCompoudCommand.getDriverCommands();

        for (DriverCommand driverCommand : copyCommands) {
            OperateToCommandTest temp = (OperateToCommandTest) driverCommand;
            assert (temp.getPosX() != 1 && temp.getPosY() != 1);
        }

    }
}
