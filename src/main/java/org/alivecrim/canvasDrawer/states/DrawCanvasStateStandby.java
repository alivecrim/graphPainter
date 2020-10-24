package org.alivecrim.canvasDrawer.states;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import org.alivecrim.canvasDrawer.DrawCanvasController;

public class DrawCanvasStateStandby extends org.alivecrim.canvasDrawer.states.DrawCanvasState {
    public DrawCanvasStateStandby(DrawCanvasController canvasController) {
        super(canvasController);
    }

    @Override
    public void canvasClick(MouseEvent mouseEvent) {
        Node intersectedNode = mouseEvent.getPickResult().getIntersectedNode();
        Parent parent = intersectedNode.getParent();
        if(parent instanceof Group){
            getController().setSelectedNode(parent);
        }

    }

    @Override
    public void initState() {

    }

    @Override
    public void revertState() {

    }
}
