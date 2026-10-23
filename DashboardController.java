package application;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class DashboardController {

    @FXML
    private ComboBox<String> optionCombo;

    @FXML
    private TextArea statusArea;

    @FXML
    private void initialize() {
        optionCombo.getItems().addAll("option 1", "option 2");
        optionCombo.setValue("option 1"); 
    }


    @FXML
    private void handleSelect() {
        String selected = optionCombo.getValue();
        if (selected != null) {
            statusArea.appendText(selected + " selected\n");
        }
    }

    @FXML
    private void handleDelete() {
        String selected = optionCombo.getValue();
        if (selected != null) {
            statusArea.appendText(selected + " deleted\n");
        }
    }
}