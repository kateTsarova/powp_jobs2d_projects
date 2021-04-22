package edu.kis.powp.jobs2d.command.visitor;


import edu.kis.powp.jobs2d.drivers.transformation.Point;

public class Canvas{

    private final int startX;
    private final int endX;
    private final int startY;
    private final int endY;

    public Canvas(int height, int width){
        endX = width/2;
        endY = height/2;
        startX = -(width/2);
        startY = -(height/2);
    }

    public boolean checkIfPointIsOnCanvas(Point point) {
        return (point.x > startX && point.x < endX) && (point.y > startY && point.y < endY);
    }
}
