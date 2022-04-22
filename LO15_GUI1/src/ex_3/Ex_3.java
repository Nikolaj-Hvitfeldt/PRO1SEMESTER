package ex_3;

import com.sun.javafx.scene.control.LabeledText;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

    public class Ex_3 extends Application {

        @Override
        public void start(Stage stage) {
            stage.setTitle("Exercise 3");
            GridPane pane = new GridPane();
            this.initContent(pane);
            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.show();
        }

        private final TextField txfName1 = new TextField();
        private final TextField txfName2 = new TextField();
        private final TextField txfName3 = new TextField();
        private final TextField txfName4 = new TextField();


        private void initContent(GridPane pane) {
            // show or hide grid lines
            pane.setGridLinesVisible(false);

            // set padding of the pane
            pane.setPadding(new Insets(20));
            // set horizontal gap between components
            pane.setHgap(5);
            // set vertical gap between components
            pane.setVgap(5);

            Label lblInvestment = new Label("Investment:");
            pane.add(lblInvestment,0,0);
            pane.add(txfName1,1,0);

            Label lblYears = new Label("Years:");
            pane.add(lblYears,0,1);
            pane.add(txfName2,1,1);

            Label lblInterest = new Label("Interest (%):");
            pane.add(lblInterest,0,2);
            pane.add(txfName3,1,2);

            Label lblFutureValue = new Label("Future Value:");
            pane.add(lblFutureValue,0,5);
            pane.add(txfName4,1,5);

            Button btnCalculate = new Button("Calculate");
            pane.add(btnCalculate,1,3);
//            GridPane.setMargin(btnCalculate, new Insets(0, 0, 0, 50));
            GridPane.setHalignment(txfName3, HPos.CENTER);
            btnCalculate.setOnAction(event -> this.calculateAction());

        }
        private void calculateAction(){
            double principal = Integer.parseInt(txfName1.getText().trim());
            int time = Integer.parseInt(txfName2.getText().trim());
            double rate = Integer.parseInt(txfName3.getText().trim());
            double interest = principal * (Math.pow((1 + rate/100),time));
            txfName4.setText("" + interest);

        }
    }
