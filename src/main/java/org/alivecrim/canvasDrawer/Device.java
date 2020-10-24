package org.alivecrim.canvasDrawer;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;


//<Group fx:id="deviceGroup">
//<Rectangle arcWidth="5.0" fill="#7f8a94" height="40.0" onMouseClicked="#selectDeviceAction" stroke="BLACK" strokeType="INSIDE" width="100.0" />
//<Ellipse fill="#ff21df8c" layoutY="20.0" radiusX="5.0" radiusY="5.0" stroke="BLACK" strokeType="INSIDE" />
//<Ellipse fill="#ff21dfb5" layoutX="100.0" layoutY="20.0" radiusX="5.0" radiusY="5.0" stroke="BLACK" strokeType="INSIDE" />
//<Label layoutX="1.0" layoutY="-20.0" text="Device #1" />
//</Group>
public class Device {
    private double x;
    private double y;
    Group schemeShape;
    private String name;

    public Device(double x, double y, String name) {
        this.name = name;
        this.x = x;
        this.y = y;
        initShape();
    }

    private void initShape() {
        Rectangle rectangle = new Rectangle();
        rectangle.setArcHeight(5.0);
        rectangle.setFill(Paint.valueOf("#7f8a94"));
        rectangle.setHeight(40.0);
        rectangle.setWidth(100.0);
        rectangle.setStroke(Paint.valueOf("black"));
        rectangle.setStrokeType(StrokeType.valueOf("inside"));
        Label label = new Label(this.name);
        Ellipse inPort = new Ellipse();
        Ellipse outPort = new Ellipse();
        inPort.setFill(Paint.valueOf("#ff21df8c"));
        outPort.setFill(Paint.valueOf("#ff21df8c"));
        inPort.setLayoutX(0.0);
        outPort.setLayoutX(100.0);
        inPort.setLayoutY(20.0);
        outPort.setLayoutY(20.0);
        inPort.setRadiusX(5.0);
        inPort.setRadiusY(5.0);
        outPort.setRadiusX(5.0);
        outPort.setRadiusY(5.0);
        inPort.setStroke(Paint.valueOf("black"));
        inPort.setStrokeType(StrokeType.valueOf("inside"));
        outPort.setStroke(Paint.valueOf("black"));
        outPort.setStrokeType(StrokeType.valueOf("inside"));
        schemeShape = new Group(rectangle, label, inPort, outPort);
    }
}
