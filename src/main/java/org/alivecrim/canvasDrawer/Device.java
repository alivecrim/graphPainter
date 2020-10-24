package org.alivecrim.canvasDrawer;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;

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

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    private void initShape() {
        Rectangle rectangle = new Rectangle();
        rectangle.setArcHeight(5.0);
        rectangle.setFill(Paint.valueOf("#7f8a94"));
        rectangle.setHeight(40.0);
        rectangle.setWidth(100.0);
        rectangle.setStroke(Paint.valueOf("black"));
        rectangle.setStrokeType(StrokeType.valueOf("INSIDE"));
        Label label = new Label(this.name);
        label.setLayoutX(-10.0);
        label.setLayoutY(-40.0);
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
        inPort.setStrokeType(StrokeType.valueOf("INSIDE"));
        outPort.setStroke(Paint.valueOf("black"));
        outPort.setStrokeType(StrokeType.valueOf("INSIDE"));
        schemeShape = new Group(rectangle, label, inPort, outPort);
    }

    public Group getShape() {
        return schemeShape;
    }

    @Override
    public String toString() {
        return "Device{" +
                "x=" + x +
                ", y=" + y +
                ", schemeShape=" + schemeShape +
                ", name='" + name + '\'' +
                '}';
    }
}
