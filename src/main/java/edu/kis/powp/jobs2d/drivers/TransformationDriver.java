package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.transformation.Point;
import edu.kis.powp.jobs2d.drivers.transformation.PointTransformation;

public class TransformationDriver implements Job2dDriver {
    private final PointTransformation transformation;
    private final Job2dDriver driver;

    public TransformationDriver(PointTransformation transformation, Job2dDriver job2dDriver) {
        this.transformation = transformation;
        this.driver = job2dDriver;
    }

    @Override
    public void setPosition(int x, int y) {
        Point transformPoint = transformation.transform(new Point(x, y));
        driver.setPosition(transformPoint.x, transformPoint.y);
    }

    @Override
    public void operateTo(int x, int y) {
        Point transformPoint = transformation.transform(new Point(x, y));
        driver.operateTo(transformPoint.x, transformPoint.y);
    }
}