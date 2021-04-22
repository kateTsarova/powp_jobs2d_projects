package edu.kis.powp.jobs2d.command.visitor;


import edu.kis.powp.jobs2d.drivers.transformation.Point;

public class Canvas{
    private final Point start;
    private final Point end;

    public Canvas(int height, int width){
        start = new Point(-(width/2), -(height/2));
        end = new Point(width/2, height/2);
    }

    public boolean checkIfPointIsOnCanvas(Point point) {
        return (point.x > start.x && point.x < end.x) && (point.y > start.y && point.y < end.y);
    }
}
