package sample;

import java.time.LocalDate;

public class Evenement {
    private String description;
    private LocalDate localDate;

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

    public Evenement(String description, LocalDate localDate) {
        this.description = description;
        this.localDate = localDate;
    }
    @Override
    public String toString(){
        return "Le: " + this.getLocalDate() + "                                                        " + this.getDescription();
    }
}
