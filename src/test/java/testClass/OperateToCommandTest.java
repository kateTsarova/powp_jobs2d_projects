package testClass;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.DriverCommand;

/**
 * Implementation of Job2dDriverCommand for operateTo command functionality.
 */
public class OperateToCommandTest implements DriverCommand {

    private int posX, posY;

    public OperateToCommandTest(int posX, int posY) {
        super();
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public void execute(Job2dDriver driver) {
        driver.operateTo(posX, posY);
    }

    @Override
    public DriverCommand clone() {
        return new OperateToCommandTest(this.posX, this.posY);
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void move(int x, int y) {
        this.posX = x;
        this.posY = y;
    }
}
