package testClass;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;

/**
 * Implementation of Job2dDriverCommand for setPosition command functionality.
 */
public class SetPositionCommandTest implements DriverCommand {

    private int posX, posY;

    public SetPositionCommandTest(int posX, int posY) {
        super();
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public void execute(Job2dDriver driver) {
        driver.setPosition(posX, posY);
    }

    @Override
    public DriverCommand clone() {
        return new OperateToCommand(this.posX, this.posY);
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
