package ui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;

public class RecordsTable extends Pane {
	
	private static RecordsTable instance;
	
	public static RecordsTable getInstance() {
		if(instance == null) {
			instance = new RecordsTable();
		}
		return instance;
	}
	
	private RecordsTable() {
    	ScrollPane newLoadedPane;
		try {
			newLoadedPane = FXMLLoader.load(getClass().getResource("resources/fxml/table.fxml"));
			this.getChildren().add(newLoadedPane);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}