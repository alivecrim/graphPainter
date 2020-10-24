package org.alivecrim.canvasDrawer.states;

import javafx.scene.input.MouseEvent;
import org.alivecrim.canvasDrawer.DrawCanvasController;

public abstract class DrawCanvasState {
    private final DrawCanvasController controller;

    @Override
    public String toString() {
        return "DrawCanvasState{" +
                "name='" + getClass().getName() + '\'' +
                '}';
    }

    public DrawCanvasController getController() {
        return controller;
    }

    public DrawCanvasState(DrawCanvasController drawCanvasController) {
        this.controller = drawCanvasController;
        initState();
    }

    public abstract void canvasClick(MouseEvent mouseEvent);

    public abstract void initState();
    public abstract void revertState();
}
