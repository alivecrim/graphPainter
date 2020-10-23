package org.alivecrim;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import org.alivecrim.pack1.CanvasState;
import org.alivecrim.pack1.CanvasStateInsertDevice;
import org.alivecrim.pack1.CanvasStateStandby;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainSceneController implements Initializable {
    public CanvasState state;
    public Button button;
    public Pane canvasPane;
    public Button printRegistry;
    private Rectangle selectedObject;
    private List<Device> registry;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        state = new CanvasStateStandby(this);
        registry = new ArrayList<>();
    }

    public void bclick1(ActionEvent actionEvent) {
        state = new CanvasStateInsertDevice(this);
        selectedObject = new Rectangle();
    }

    public CanvasState getState() {
        return state;
    }

    public void setState(CanvasState state) {
        this.state = state;
    }

    public void setSelectedObject(Rectangle selectedObject) {
        this.selectedObject = selectedObject;
    }

    public List<Device> getRegistry() {
        return registry;
    }

    public void setRegistry(List<Device> registry) {
        this.registry = registry;
    }

    public void canvasClick(MouseEvent mouseEvent) {
        state.click(mouseEvent.getX(), mouseEvent.getY());

    }

    public void print(ActionEvent actionEvent) {
        registry.forEach(device -> System.out.println(device));
        System.out.println("---------------------------------");
    }

    public void addLine(ActionEvent actionEvent) {

    }

    public Pane getCanvasPane() {
        return canvasPane;
    }

    public Node getSelectedObject() {
        return selectedObject;
    }
}
