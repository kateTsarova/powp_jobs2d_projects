package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

/**
 * Implementation of Job2dDriverCommand for setPosition command functionality.
 */
public class SetPositionCommand implements DriverCommand {

	private int posX, posY;

	public SetPositionCommand(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}

	@Override
	public void execute(Job2dDriver driver) {
		driver.setPosition(posX, posY);
	}

	@Override
	public SetPositionCommand clone() {
		SetPositionCommand command = null;
		try {
			command = (SetPositionCommand) super.clone();
		} catch (CloneNotSupportedException e) {
			command = new SetPositionCommand(this.posX, this.posY);
		}
		return command;
	}

}
