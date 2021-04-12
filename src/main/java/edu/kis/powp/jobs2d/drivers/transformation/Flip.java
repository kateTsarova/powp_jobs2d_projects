package edu.kis.powp.jobs2d.drivers.transformation;

public class Flip implements PointTransformation {
    private boolean horizontally = false;
    private boolean vertically = false;
    private int h = 1;
    private int v = 1;

    public Flip(boolean horizontally, boolean vertically) {
        this.horizontally = horizontally;
        this.vertically = vertically;
        if(horizontally)
            h = -1;
        if(vertically)
            v = -1;
    }

    @Override
    public Point transform(Point point) {
        int newX = (int) (point.x * h);
        int newY = (int) (point.y * v);
        return new Point(newX, newY);
    }
}
