package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListCell;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ListCellCustom extends ListCell<CheckBoxElement> implements Initializable {

    @FXML
    private CheckBox checkBox;

    @Override
    protected void updateItem(CheckBoxElement checkBoxElement, boolean empty) {
        super.updateItem(checkBoxElement, empty);
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("checkBoxLayout.fxml"));
        fxmlLoader.setController(CheckBoxElement.class);
        checkBoxElement = new CheckBoxElement(new CheckBox(),"n'importe quoi");
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        checkBox.setText(
                checkBoxElement.getCheckBox());

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
