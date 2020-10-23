package org.alivecrim.pack1;


import org.alivecrim.MainSceneController;

public abstract class CanvasState {
    protected final MainSceneController controller;

    public CanvasState(MainSceneController controller) {
        this.controller = controller;
    }

    public abstract void click(double x, double y);
}
