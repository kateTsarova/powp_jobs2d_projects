package edu.kis.powp.jobs2d;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.adapter.LineDriverAdapter;
import edu.kis.powp.jobs2d.drivers.composite.DriverComposite;
import edu.kis.powp.jobs2d.drivers.composite.IDriverComposite;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.util.logging.Logger;

/**
 * Test of DriverComposite behaviour.
 * Expect to draw figure in panel and log drawing operations.
 */
public class DriverCompositeTest {

    public static void main(String[] args) {
        Application app = new Application("Driver Test App");
        DrawPanelController controller = new DrawPanelController();
        controller.initialize(app.getFreePanel());
        app.setVisibility(true);

        IDriverComposite driverComposite = new DriverComposite();
        driverComposite.add(new LogStubDriver());
        driverComposite.add(new LineDriverAdapter(controller, LineFactory.getBasicLine(), "Test line drawer."));

        FiguresJoe.figureScript1(driverComposite);
    }

    private static class LogStubDriver implements Job2dDriver {
        Logger logger = Logger.getLogger("global");

        @Override
        public void operateTo(int x, int y) {
            this.logger.info("Driver operate to: " + x + ", " + y);
        }

        @Override
        public void setPosition(int x, int y) {
            this.logger.info("Driver set position to: " + x + ", " + y);
        }
    }
}
