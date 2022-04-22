package ex_4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Ex_4 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 4");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final ListView<String> lvwNames = new ListView<>();
    private final ArrayList<String> names = new ArrayList<>();

    private void initContent(GridPane pane) {
        this.initNames();

        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblNames = new Label("Names:");
        pane.add(lblNames, 0, 0);
        GridPane.setValignment(lblNames, VPos.TOP);
        lvwNames.setPrefSize(200, 200);
        pane.add(lvwNames, 1, 0);
        lvwNames.getItems().setAll(this.initNames());

        Label lblNameBottom = new Label("Name:");
        pane.add(lblNameBottom, 0, 1);
        pane.add(txfName, 1, 1);

        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 2, 1);
        btnAdd.setOnAction(event->this.addAction());


    }
    private ArrayList<String> initNames() {
        names.add("Jane");
        names.add("Eva");
        names.add("Lene");
        names.add("Mette");
        names.add("Tine");
        names.add("Line");
        names.add("Lone");
        names.add("Alberte");
        names.add("Pia");
        return names;
    }

    private void addAction() {
        String name = txfName.getText().trim();
        if (name.length() > 0) {
            names.add(name);
            lvwNames.getItems().setAll(names);
            txfName.clear();
        }
    }

}
