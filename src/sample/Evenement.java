package sample;

import javafx.scene.control.CheckBox;

import java.time.LocalDate;

public class Evenement {
    private String description;
    private LocalDate localDate;
    private CheckBox checkBox;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public CheckBox getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(CheckBox checkBox) {
        this.checkBox = checkBox;
    }

    public Evenement(CheckBox checkBox,String description, LocalDate localDate) {
        this.description = description;
        this.localDate = localDate;
        this.checkBox = checkBox;
    }

    @Override
    public String toString(){
        CheckBox checkBox = new CheckBox();
        return ("Le: " + this.getLocalDate() + "                                                   " + this.getDescription());
    }
}
