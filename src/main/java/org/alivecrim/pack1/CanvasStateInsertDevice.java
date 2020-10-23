package org.alivecrim.pack1;

import javafx.scene.Node;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import org.alivecrim.Device;
import org.alivecrim.MainSceneController;

public class CanvasStateInsertDevice extends CanvasState {


    public CanvasStateInsertDevice(MainSceneController controller) {
        super(controller);
    }

    @Override
    public void click(double x, double y) {
        Node selectedObject = controller.getSelectedObject();
        controller.getCanvasPane().getChildren().add(selectedObject);
        selectedObject.setLayoutX(x);
        selectedObject.setLayoutY(y);
        ((Rectangle) selectedObject).setWidth(60);
        ((Rectangle) selectedObject).setHeight(30);
        ((Rectangle) selectedObject).setFill(Paint.valueOf("gold"));
        controller.getRegistry().add(new Device(x, y, 60,30));
        controller.setState(new CanvasStateStandby(controller));
    }
}
