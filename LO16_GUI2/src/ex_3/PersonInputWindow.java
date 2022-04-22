package ex_3;

import demotwowindows.MovieInputWindow;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.awt.*;

public class PersonInputWindow extends Stage {

    PersonInputWindow(String name, Stage owner) {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);

        this.setTitle(name);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();
    private final CheckBox cbxSenior = new CheckBox("Senior");
    private Person actualPerson = null;


    private void initContent(GridPane pane) {
//        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);


        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);
        pane.add(txfName, 1, 0);

        Label lblTitle = new Label("Title:");
        pane.add(lblTitle, 0, 1);
        pane.add(txfTitle, 1, 1);

        pane.add(cbxSenior, 1, 2);

        Button btnCancel = new Button("Cancel");
        btnCancel.setOnAction(event -> this.cancelAction());

        Button btnOK = new Button("OK");
        btnOK.setOnAction(event -> this.okAction());

        HBox boxButton = new HBox(20, btnOK, btnCancel);
        pane.add(boxButton, 1, 3);
        btnCancel.setPrefWidth(80);
        btnOK.setPrefWidth(80);

    }

    private void cancelAction() {
        txfName.clear();
        txfName.requestFocus();
        txfTitle.clear();
        actualPerson = null;
        PersonInputWindow.this.hide();
    }

    private void okAction() {
        String n = txfName.getText().trim();
        String t = txfTitle.getText().trim();
        var s = cbxSenior.isSelected();
        if (n.length() > 0 && t.length() > 0) {
            actualPerson = new Person(n,t,s);
            txfName.clear();
            txfTitle.clear();
            txfName.requestFocus();
            if(cbxSenior.isSelected()){
                actualPerson.isSenior();}
            PersonInputWindow.this.hide();

        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Add Person");
            alert.setHeaderText("Information missing");
            alert.setContentText("Type name and title");
            alert.show();
        }
    }


    public Person getActualPerson() {
        return actualPerson;
    }

    public void clearActualPerson() {
        actualPerson = null;
    }

}