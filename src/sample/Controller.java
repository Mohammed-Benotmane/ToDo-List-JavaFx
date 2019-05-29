package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class Controller extends Application implements Initializable {

    @FXML
    private Button button;

    @FXML
    private DatePicker date;

    @FXML
    private TextField edit;

    @FXML
    private ListView<CheckBoxElement> list;

    ObservableList<CheckBoxElement> observableList= FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Controller.class.getResource("index.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("To Do List");
        primaryStage.show();
    }

    @FXML
    private void ajouter(Event e){
        observableList.add(new CheckBoxElement(new CheckBox(),edit.getText()));
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        date.setValue(LocalDate.now());
        list.setItems(observableList);
        list.setCellFactory(new Callback<ListView<CheckBoxElement>, ListCell<CheckBoxElement>>() {
            @Override
            public ListCell<CheckBoxElement> call(ListView<CheckBoxElement> param) {
                return new ListCellCustom();
            }
        });
    }


}
