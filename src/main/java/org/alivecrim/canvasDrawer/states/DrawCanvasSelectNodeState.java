package org.alivecrim.canvasDrawer.states;

import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import org.alivecrim.canvasDrawer.Device;
import org.alivecrim.canvasDrawer.DrawCanvasController;

public class DrawCanvasSelectNodeState extends DrawCanvasState {
    public DrawCanvasSelectNodeState(DrawCanvasController drawCanvasController) {
        super(drawCanvasController);
    }

    @Override
    public void canvasClick(MouseEvent mouseEvent) {
        Parent selectedNode = getController().getSelectedNode();
        Device device;
        device = getController().getRegistry().stream().filter(device1 -> device1.getShape().equals(selectedNode)).findFirst().get();
        System.out.println(device);
        AnchorPane.setLeftAnchor(selectedNode, mouseEvent.getX());
        AnchorPane.setTopAnchor(selectedNode, mouseEvent.getY());
        getController().setState(new DrawCanvasStateStandby(getController()));
    }

    @Override
    public void initState() {

    }

    @Override
    public void revertState() {

    }
}
