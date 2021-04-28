package edu.kis.powp.jobs2d.command.visitor;

public class CanvasFactory {
    public static Canvas getCanvas(String canvasType){
        if(canvasType == null)
            return null;

        if(canvasType.equalsIgnoreCase("A4"))
            return new RectangleCanvas(210,297);
        else if(canvasType.equalsIgnoreCase("A5"))
            return new RectangleCanvas(148, 210);

        return null;
    }
}
