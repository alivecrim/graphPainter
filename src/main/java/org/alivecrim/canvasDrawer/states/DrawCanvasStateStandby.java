package org.alivecrim.canvasDrawer.states;

import javafx.scene.input.MouseEvent;
import org.alivecrim.canvasDrawer.DrawCanvasController;

public class DrawCanvasStateStandby extends org.alivecrim.canvasDrawer.states.DrawCanvasState {
    public DrawCanvasStateStandby(DrawCanvasController canvasController, MouseEvent event ) {
        super(canvasController, event);
    }

    @Override
    public void canvasClick() {
    }
}
