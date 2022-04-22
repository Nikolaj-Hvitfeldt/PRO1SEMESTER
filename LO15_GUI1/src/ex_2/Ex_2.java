package ex_2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

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

    private final TextField txfName = new TextField();


    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(0);
        // set vertical gap between components
        pane.setVgap(0);

        Label lblnumber = new Label("Number:   ");
        pane.add(lblnumber, 0, 1);
        pane.add(txfName, 1, 1);
        txfName.setPrefWidth(60);

        Button btnInc = new Button("Inc");
        pane.add(btnInc, 2, 0);
        GridPane.setMargin(btnInc, new Insets(0, 30, 0, 0));

        Button btnDec = new Button("Dec");
        pane.add(btnDec, 2, 2);
        GridPane.setMargin(btnDec, new Insets(0, 0, 0, 0));

        btnInc.setOnAction(event -> this.incAction());
        btnDec.setOnAction(event -> this.decAction());
    }

    private void incAction() {
        int value = Integer.parseInt(txfName.getText());
        value++;
        txfName.setText("" + value);

    }

    private void decAction() {
        int value = Integer.parseInt(txfName.getText());
        value--;
        txfName.setText("" + value);
    }
}
