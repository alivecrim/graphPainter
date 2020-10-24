package org.alivecrim.canvasDrawer.states;

import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import org.alivecrim.canvasDrawer.Device;
import org.alivecrim.canvasDrawer.DrawCanvasController;

public class SelectDeviceState extends DrawCanvasState {
    public SelectDeviceState(DrawCanvasController drawCanvasController) {
        super(drawCanvasController);
    }

    @Override
    public void canvasClick(MouseEvent mouseEvent) {
        Device v = new Device(mouseEvent.getX(), mouseEvent.getY(), "V");
        Group shape = v.getShape();
        getController().getRegistry().add(v);
        AnchorPane.setLeftAnchor(shape,mouseEvent.getX());
        AnchorPane.setTopAnchor(shape,mouseEvent.getY());
        getController().canvasPane.getChildren().add(shape);
        revertState();

    }

    @Override
    public void initState() {
        getController().selectDeviceButton.setTextFill(Paint.valueOf("GREEN"));
    }

    @Override
    public void revertState() {
        getController().selectDeviceButton.setTextFill(Paint.valueOf("BLACK"));
        getController().setState(new DrawCanvasStateStandby(getController()));
    }

}
