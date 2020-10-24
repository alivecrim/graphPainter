package org.alivecrim.canvasDrawer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import org.alivecrim.canvasDrawer.states.DrawCanvasSelectNodeState;
import org.alivecrim.canvasDrawer.states.DrawCanvasState;
import org.alivecrim.canvasDrawer.states.DrawCanvasStateStandby;
import org.alivecrim.canvasDrawer.states.SelectDeviceState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class DrawCanvasController implements Initializable {
    public static Logger logger = LoggerFactory.getLogger(DrawCanvasController.class);
    @FXML
    public AnchorPane canvasPane;

    @FXML
    public Button selectDeviceButton;

    @FXML
    private Group switchCGroup;

    @FXML
    private Group switchTGroup;

    @FXML
    private Group switchRGroup;

    private DrawCanvasState state;
    private List<Device> registry;
    private Parent selectedNode;


    public DrawCanvasController() {
        setState(new DrawCanvasStateStandby(this));
    }

    public void setState(DrawCanvasState state) {
        logger.info(String.format("Change state from %s to %s", this.state, state));
        this.state = state;
    }

    @FXML
    void clickSelectDevice(MouseEvent event) {
        setState(new SelectDeviceState(this));
    }

    @FXML
    public void selectCSwitchAction(MouseEvent mouseEvent) {
    }

    @FXML
    void selectRSwitchAction(MouseEvent event) {

    }

    @FXML
    void selectTSwitchAction(MouseEvent event) {

    }


    public void canvasClick(MouseEvent mouseEvent) {
        this.state.canvasClick(mouseEvent);
    }

    public List<Device> getRegistry() {
        return this.registry;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.registry = new ArrayList<>();
    }

    public void clear(MouseEvent mouseEvent) {
        this.canvasPane.getChildren().clear();
    }

    public void setSelectedNode(Parent parent) {
        this.selectedNode = parent;
        setState(new DrawCanvasSelectNodeState(this));
    }

    public Parent getSelectedNode() {
        return selectedNode;
    }

    public void canvasDragDetected(MouseEvent mouseEvent) {
        System.out.println("canvasDragDetected");
        System.out.println(mouseEvent);
    }

}
