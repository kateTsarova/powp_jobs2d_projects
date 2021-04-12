package edu.kis.powp.jobs2d.drivers.transformation;

public class Rotate implements PointTransformation {
    private double delta;

    public Rotate(double deltaX) {
        this.delta = delta;
    }

    @Override
    public Point transform(Point point) {
        int newX = (int) (point.x * Math.cos(delta) - point.y * Math.sin(delta));
        int newY = (int) (point.y * Math.cos(delta) + point.x * Math.sin(delta));
        return new Point(newX, newY);
    }
}
