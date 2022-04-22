package ex_3;

import demotwowindows.MovieInputWindow;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Ex_3 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 3");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        personWindow = new PersonInputWindow ("Add a Person", stage);
    }


    // -------------------------------------------------------------------------

    private final TextArea txtArea = new TextArea();
    private PersonInputWindow personWindow;


    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label lblPersons = new Label("Persons:");
        pane.add(lblPersons,0,0);

        pane.add(txtArea,0,1);
        txtArea.setPrefWidth(225);
        txtArea.setEditable(false);

        Button btnAddPerson = new Button("Add Person");
        pane.add(btnAddPerson,1,1);
        GridPane.setValignment(btnAddPerson, VPos.TOP);
        GridPane.setMargin(btnAddPerson,new Insets(20,0,0,0));
        btnAddPerson.setOnAction(event -> this.addPersonAction());
    }
    private void addPersonAction(){
        personWindow.showAndWait();
//      Wait for window to close
        if (personWindow.getActualPerson() != null) {
            Person person = personWindow.getActualPerson();
            txtArea.appendText(person.toString());
        }

    }
}
