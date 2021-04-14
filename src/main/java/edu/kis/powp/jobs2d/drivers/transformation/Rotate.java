package edu.kis.powp.jobs2d.drivers.transformation;

public class Rotate implements PointTransformation {
    private double angle;

    public Rotate(double angle) {
        this.angle = angle;
    }

    @Override
    public Point transform(Point point) {
        int newX = (int) (point.x * Math.cos(angle) - point.y * Math.sin(angle));
        int newY = (int) (point.y * Math.cos(angle) + point.x * Math.sin(angle));
        return new Point(newX, newY);
    }
}
