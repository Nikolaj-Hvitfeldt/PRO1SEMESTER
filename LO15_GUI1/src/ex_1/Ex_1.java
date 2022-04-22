package ex_1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex_1 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 1");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final TextField txfName = new TextField();
    private final TextField txfName1 = new TextField();
    private final TextField txfName2 = new TextField();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label lblFirstName = new Label("First name:");
        pane.add(lblFirstName, 0, 0);

        pane.add(txfName, 0, 1);


        Label lblLastName = new Label("Last name:");
        pane.add(lblLastName, 1, 0);

        pane.add(txfName1, 1, 1);

        Label lbFullName = new Label("Full name:");
        pane.add(lbFullName, 0, 2, 1, 1);

        pane.add(txfName2, 0, 3, 2, 1);

        Button btnCombine = new Button("Combine");
        pane.add(btnCombine, 1, 4);
        
        btnCombine.setOnAction(event -> this.combineAction());


    }
    private void combineAction(){
     String name = txfName.getText().trim();
     String name1 = txfName1.getText().trim();
     txfName2.setText(name+ " " + name1);
    }
}
