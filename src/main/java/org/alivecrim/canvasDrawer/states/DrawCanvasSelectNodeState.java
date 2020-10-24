package org.alivecrim.canvasDrawer.states;

import javafx.geometry.Bounds;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import org.alivecrim.canvasDrawer.Device;
import org.alivecrim.canvasDrawer.DrawCanvasController;

public class DrawCanvasSelectNodeState extends DrawCanvasState {
    public DrawCanvasSelectNodeState(DrawCanvasController drawCanvasController) {
        super(drawCanvasController);
    }
    Rectangle rectangle;
    @Override
    public void canvasClick(MouseEvent mouseEvent) {
        Parent selectedNode = getController().getSelectedNode();
        Device device;
        device = getController().getRegistry().stream().filter(device1 -> device1.getShape().equals(selectedNode)).findFirst().get();
        device.setX(mouseEvent.getX());
        device.setY(mouseEvent.getY());
        System.out.println(device);
        AnchorPane.setLeftAnchor(selectedNode, mouseEvent.getX()-selectedNode.getLayoutBounds().getCenterX());
        AnchorPane.setTopAnchor(selectedNode, mouseEvent.getY()-selectedNode.getLayoutBounds().getMaxY());
        getController().setState(new DrawCanvasStateStandby(getController()));
        revertState();
    }

    @Override
    public void initState() {
        Parent selectedNode = getController().getSelectedNode();
        Bounds layoutBounds = selectedNode.getBoundsInParent();
        rectangle = new Rectangle();
        rectangle.setHeight(layoutBounds.getHeight()+10);
        rectangle.setWidth(layoutBounds.getWidth()+10);
        AnchorPane.setLeftAnchor(rectangle, layoutBounds.getMinX()-5);
        AnchorPane.setTopAnchor(rectangle, layoutBounds.getMinY()-5);
        rectangle.setOpacity(0.1);
        rectangle.setFill(Paint.valueOf("green"));
        getController().canvasPane.getChildren().add(rectangle);
    }

    @Override
    public void revertState() {
        getController().canvasPane.getChildren().removeIf(node -> node instanceof Rectangle);

    }
}
