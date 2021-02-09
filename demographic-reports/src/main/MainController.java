package main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import ui.RecordsTable;

public class MainController {

    @FXML
    private Label label;

    private RecordsTable recordsTable;

    @FXML
    public void initialize() {
    	recordsTable = RecordsTable.getInstance();
    	container_RecordsTable.getChildren().add(recordsTable);
    }
    
    @FXML
    private Pane container_RecordsTable;
}