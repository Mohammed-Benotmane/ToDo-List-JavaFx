package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;

import java.net.URL;
import java.util.ResourceBundle;

public class CheckBoxElement implements Initializable{
    private CheckBox checkBox1;
    private String checkBox;

    public String getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(String checkBox) {
        this.checkBox = checkBox;
    }

    public CheckBoxElement(CheckBox checkBox1, String checkBox) {
        this.checkBox1 = checkBox1;
        this.checkBox = checkBox;
    }

    public CheckBox getCheckBox1() {
        return checkBox1;
    }

    public void setCheckBox1(CheckBox checkBox1) {
        this.checkBox1 = checkBox1;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
