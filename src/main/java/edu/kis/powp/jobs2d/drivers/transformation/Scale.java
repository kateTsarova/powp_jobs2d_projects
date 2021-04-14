package edu.kis.powp.jobs2d.drivers.transformation;

public class Scale implements PointTransformation {
    private double deltaX;
    private double deltaY;

    public Scale(double deltaX, double deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    @Override
    public Point transform(Point point) {
        int newX = (int) (point.x * deltaX);
        int newY = (int) (point.y * deltaY);
        return new Point(newX, newY);
    }
}
