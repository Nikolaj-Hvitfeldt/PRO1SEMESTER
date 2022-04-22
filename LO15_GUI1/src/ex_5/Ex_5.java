package ex_5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex_5 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 5");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final TextField txfName1 = new TextField();
    private final TextArea txaName = new TextArea();


    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(5);
        // set vertical gap between components
        pane.setVgap(5);

        Label lblName = new Label("Name: ");
        pane.add(lblName,0,0);
        pane.add(txfName1,0,1,2,2);

        Button btnAdd = new Button("Add");
        pane.add(btnAdd,0,3);
        GridPane.setMargin(btnAdd, new Insets(0, 0, 0, 80));
        btnAdd.setOnAction(event -> addAction());

        pane.add(txaName,0,4);
        txaName.setPrefRowCount(7);
        txaName.setPrefWidth(200);
        txaName.setEditable(false);
    }

    private void addAction(){
        String name = txfName1.getText();
        txaName.appendText(name + "\n");

    }
}
