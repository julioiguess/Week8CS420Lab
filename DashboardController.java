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
        optionCombo.getItems().addAll("Overview", "Farm Map", "Soil Moisture", "Crop Growth","Harvest","Equipment", "Drone Missions", "Alerts");
        optionCombo.setValue("Select Option");
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

    @FXML
    private void handleWaterZone1() {
        logAction("Water - Zone 1");
    }

    @FXML
    private void handleWaterZone2() {
        logAction("Water - Zone 2");
    }

    @FXML
    private void handleFieldZone1() {
        logAction("Field - Zone 1");
    }

    @FXML
    private void handleFieldZone2() {
        logAction("Field - Zone 2");
    }

    private void logAction(String action) {
        statusArea.appendText(action + " action selected\n");
    }
}