package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.observer.Subscriber;

/**
 * This class subscribes to the DriverManager's changes (invoked by setCurrentDriver())
 */

public class DriverChangeEventSubscriber implements Subscriber {
  public void update() {
    DriverFeature.updateDriverInfo();
  }
}
