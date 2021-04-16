import edu.kis.powp.jobs2d.command.CompoundCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompoundCommandCopyTest {

    @Test
    public void cloneTest() {

        DriverCommand c1 = new SetPositionCommand(0, 0);
        OperateToCommand c2 = new OperateToCommand(-20, -50);
        DriverCommand c3 = new OperateToCommand(50, 0);

        List<DriverCommand> ncl1 = new ArrayList<DriverCommand>();
        ncl1.add(c1);
        ncl1.add(c2);
        ncl1.add(c3);

        CompoundCommand ncc1 = new CompoundCommand(ncl1);

        DriverCommand c4 = new SetPositionCommand(0, 0);
        OperateToCommand c5 = new OperateToCommand(20, 50);

        List<DriverCommand> ncl2 = new ArrayList<DriverCommand>();
        ncl2.add(ncc1);
        ncl2.add(c4);
        ncl2.add(c5);

        CompoundCommand originalCompoundCommand = new CompoundCommand(ncl2);


        CompoundCommand copyCompoundCommand = (CompoundCommand) originalCompoundCommand.clone();

        Iterator<DriverCommand> copyIterator = copyCompoundCommand.iterator();
        Iterator<DriverCommand> originalIterator = originalCompoundCommand.iterator();

        assert(isDifferent(copyIterator,originalIterator)==true);

    }

    boolean isDifferent(Iterator<DriverCommand> cl1,  Iterator<DriverCommand> cl2){

        while (cl1.hasNext() && cl2.hasNext()){

            DriverCommand object1 = cl1.next();
            DriverCommand object2 = cl2.next();

            if(object1 instanceof CompoundCommand && object2 instanceof CompoundCommand){

                boolean result = isDifferent(((CompoundCommand) object1).iterator(), ((CompoundCommand) object2).iterator());

                if(!result)return false;


            }else if(object1 instanceof DriverCommand && object2 instanceof DriverCommand ){
                if(object1==object2)return false;
            }else
                return false;

        }

        return true;
    }

}
