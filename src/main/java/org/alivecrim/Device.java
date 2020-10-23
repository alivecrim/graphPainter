package org.alivecrim;

import javafx.geometry.Point2D;

public class Device {
    private Point2D inputPort;
    private Point2D outputPort;

    public Device(double x, double y, double width, double height) {
        inputPort = new Point2D(x, y + height / 2);
        outputPort = new Point2D(x + width, y + height / 2);
    }

    public Point2D getInputPort() {
        return inputPort;
    }

    public Point2D getOutputPort() {
        return outputPort;
    }
}
