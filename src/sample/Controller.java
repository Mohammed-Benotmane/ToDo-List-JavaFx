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
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    private ListView<Evenement> list;

    ObservableList<Evenement> observableList= FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Controller.class.getResource("index.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("To Do List");
        primaryStage.show();
    }

    @FXML
    private void ajouter(Event e){
        observableList.add(new Evenement(edit.getText(),date.getValue()));
        list.setItems(observableList);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        date.setValue(LocalDate.now());
    }


}
