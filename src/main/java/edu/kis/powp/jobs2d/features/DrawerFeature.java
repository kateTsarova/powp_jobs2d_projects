package edu.kis.powp.jobs2d.features;

import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.events.SelectClearPanelOptionListener;
import edu.kis.legacy.drawer.panel.DrawPanelController;

public class DrawerFeature implements Feature {

    private static DrawPanelController drawerController;
    private static Application app;

    /**
     * Setup Drawer Plugin and add to application.
     *
     * @param application Application context.
     */
    public DrawerFeature(Application application) {
    	app = application;
    }
    
    public void setup() {
        SelectClearPanelOptionListener selectClearPanelOptionListener = new SelectClearPanelOptionListener();

        drawerController = new DrawPanelController();
        app.addComponentMenu(DrawPanelController.class, "Draw Panel", 0);
        app.addComponentMenuElement(DrawPanelController.class, "Clear Panel", selectClearPanelOptionListener);

        drawerController.initialize(app.getFreePanel());
    }

    /**
     * Get controller of application drawing panel.
     *
     * @return drawPanelController.
     */
    public static DrawPanelController getDrawerController() {
        return drawerController;
    }
}
