package org.alivecrim.canvasDrawer.states;

import javafx.scene.input.MouseEvent;
import org.alivecrim.canvasDrawer.DrawCanvasController;

public abstract class DrawCanvasState {
    private final DrawCanvasController controller;
    private final MouseEvent event;

    @Override
    public String toString() {
        return "DrawCanvasState{" +
                "name='" + getClass().getName() + '\'' +
                '}';
    }

    public DrawCanvasController getController() {
        return controller;
    }

    public MouseEvent getEvent() {
        return event;
    }

    public DrawCanvasState(DrawCanvasController drawCanvasController, MouseEvent event) {
        this.controller = drawCanvasController;
        this.event = event;
    }

    public abstract void canvasClick();
}
