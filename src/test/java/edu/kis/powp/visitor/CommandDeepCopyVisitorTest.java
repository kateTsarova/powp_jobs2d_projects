package edu.kis.powp.visitor;

import edu.kis.powp.jobs2d.command.*;
import edu.kis.powp.jobs2d.command.visitor.CommandDeepCopyVisitor;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class CommandDeepCopyVisitorTest {

    @Test
    public void testDeepCopy() {
        ComplexCommand commandToCopy = new ComplexCommand.Builder()
                .addCommand(new OperateToCommand(80, 80))
                .addCommand(new SetPositionCommand(10, 10))
                .addCommand(new OperateToCommand(20, 20))
                .build();

        CommandDeepCopyVisitor commandDeepCopyVisitor = new CommandDeepCopyVisitor();
        commandToCopy.accept(commandDeepCopyVisitor);

        ComplexCommand deeplyCopiedCommand = commandDeepCopyVisitor.getCopy();
        Iterator<DriverCommand> originalIterator = commandToCopy.iterator();
        Iterator<DriverCommand> copiedIterator = deeplyCopiedCommand.iterator();

        while (!(originalIterator.hasNext() && copiedIterator.hasNext())) {
            assertEquals("Commands don't match in length!", originalIterator.hasNext(), copiedIterator.hasNext());
            DriverCommand originalCommand = originalIterator.next();
            DriverCommand copiedCommand = copiedIterator.next();
            assertNotEquals(originalCommand, copiedCommand);
        }
    }
}
