package edu.kis.powp.jobs2d.command.visitor;

import edu.kis.powp.jobs2d.drivers.transformation.Point;

public interface Canvas {
    boolean checkIfPointIsOnCanvas(Point point);
}