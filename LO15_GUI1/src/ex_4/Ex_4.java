package ex_4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

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

    private final TextField txfName1 = new TextField();
    private final TextField txfName2 = new TextField();
    private final TextField txfName3 = new TextField();



    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(5);
        // set vertical gap between components
        pane.setVgap(5);

        Label lbltemp = new Label("Temperature: ");
        pane.add(lbltemp,0,0);
        pane.add(txfName1,1,0);

        pane.add(txfName2,0,1,2,2);

        Button btnConvertToF = new Button("Convert to Fahrenheit");
        pane.add(btnConvertToF,0,3);
        Button btnCovertToC = new Button("Covert to Celsius");
        pane.add(btnCovertToC,1,3);

        btnConvertToF.setOnAction(event -> this.convertFAction());
        btnCovertToC.setOnAction(event-> this.convertCAction());

    }
    private void convertFAction(){
        double fTemp = 0;
        double cTemp = Integer.parseInt(txfName1.getText().trim());
        fTemp = cTemp * 9 / 5 + 32;
        txfName2.setText("" + fTemp);

    }
    private void convertCAction(){
        double cTemp = 0;
        double fTemp = Integer.parseInt(txfName1.getText().trim());
        cTemp = (fTemp - 32) * 5 / 9;
        txfName2.setText("" + cTemp);
    }
}
