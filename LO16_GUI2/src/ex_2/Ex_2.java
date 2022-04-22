package ex_2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Ex_2 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final TextField txTitle = new TextField();
    private final ListView<String> lvwNames = new ListView<>();
    private final ArrayList<String> names = new ArrayList<>();
    private final CheckBox cbxSenior = new CheckBox();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // Adding label and textfield for Name
        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);
        pane.add(txfName, 1, 0);

        // Adding Label and textfield for title
        Label lblTitle = new Label("Title:");
        pane.add(lblTitle, 0, 1);
        pane.add(txTitle, 1, 1);

        // Adding the checkbox
        pane.add(cbxSenior, 1, 2);
        cbxSenior.setText("Senior");


        // Adding the Add Person button and make it call a method
        Button btnAdd = new Button("Add Person");
        pane.add(btnAdd, 3, 2);
        btnAdd.setOnAction(event -> addAction());

        // Adding Label, listview and scaling of listview
        Label lblPersons = new Label("Persons:");
        pane.add(lblPersons, 0, 3);
        pane.add(lvwNames, 1, 3);
        lvwNames.setPrefWidth(200);
        lvwNames.setPrefHeight(200);


    }

    // The method used for the Add Person Button
    private void addAction() {
        String name = txfName.getText().trim();
        String title = txTitle.getText().trim();

        if (txfName.getText().isEmpty() || txTitle.getText().isEmpty()) {
            txfName.clear();
            txTitle.clear();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Add Person");
            alert.setHeaderText("Missing name or title");
            alert.setContentText("Type the name or title of the person");
            alert.show();
        }
        else if (name.length() > 0 && cbxSenior.isSelected()) {
            names.add(title + " " + name + " " + "(Senior)");
            lvwNames.getItems().setAll(names);
        }  if (name.length() > 0 && !cbxSenior.isSelected()) {
            names.add(title + " " + name);
            lvwNames.getItems().setAll(names);
        }
    }
}

