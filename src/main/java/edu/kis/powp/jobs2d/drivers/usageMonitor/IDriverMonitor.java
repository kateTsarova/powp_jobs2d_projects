package edu.kis.powp.jobs2d.drivers.usageMonitor;

import edu.kis.powp.jobs2d.Job2dDriver;

public interface IDriverMonitor extends Job2dDriver
{
   double getHeadDistance();
   double getOperationDistance();
}
