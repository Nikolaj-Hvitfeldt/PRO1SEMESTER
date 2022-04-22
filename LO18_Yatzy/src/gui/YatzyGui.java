package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import model.YatzyDice;

public class YatzyGui extends Application {
    private YatzyDice dice = new YatzyDice();

    @Override
    public void start(Stage stage) {
        stage.setTitle("Yatzy");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    // -------------------------------------------------------------------------

    // Shows the face values of the 5 dice.
    private final TextField[] txfValues = new TextField[5];
    // Shows the hold status of the 5 dice.
    private final CheckBox[] cbxHolds = new CheckBox[5];
    // Shows the obtained results.
    // For results not set yet, the possible result of 
    // the actual face values of the 5 dice are shown.
    private final TextField[] txfResults = new TextField[15];
    // Shows points in sums, bonus and total.
    private final TextField txfSumSame = new TextField(), txfBonus = new TextField(),
            txfSumOther = new TextField(), txfTotal = new TextField();

    private final Label lblRolled = new Label();
    private final Button btnRoll = new Button("Throw");

    private void initContent(GridPane pane) {
        // pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        // ---------------------------------------------------------------------

        GridPane dicePane = new GridPane();
        pane.add(dicePane, 0, 0);
        // dicePane.setGridLinesVisible(true);
        dicePane.setPadding(new Insets(10));
        dicePane.setHgap(10);
        dicePane.setVgap(10);
        dicePane.setStyle("-fx-border-color: black");

        // add txfValues, chbHolds, lblRolled and btnRoll

        for (int i = 0; i < txfValues.length; i++) {
            TextField txfdice = new TextField();
            dicePane.add(txfdice, i, 0);
            txfdice.setPrefWidth(125);
            txfdice.setPrefHeight(125);
            txfdice.setFont(Font.font(70));
            txfdice.setEditable(false);
            txfValues[i] = txfdice;
        }

        for (int i = 0; i < cbxHolds.length; i++) {
            CheckBox checkBox = new CheckBox("Hold");
            checkBox.setDisable(true);
            dicePane.add(checkBox, i, 1);
            cbxHolds[i] = checkBox;
        }

        dicePane.add(btnRoll, 3, 2);
        btnRoll.setPrefSize(125, 50);
        btnRoll.setOnAction(event -> rollAction());

        // ---------------------------------------------------------------------

        GridPane scorePane = new GridPane();
        pane.add(scorePane, 0, 1);
        // scorePane.setGridLinesVisible(true);
        scorePane.setPadding(new Insets(10));
        scorePane.setVgap(5);
        scorePane.setHgap(10);
        scorePane.setStyle("-fx-border-color: black");
        int w = 50; // width of the text fields


        // add labels for results, add txfResults,
        // add labels and text fields for sums, bonus and total.
        String[] labelNames = new String[]{
                "1-s:", "2-s:", "3-s:", "4-s:", "5-s:", "6-s:",
                "One pair:", "Two pairs:", "Three Same:",
                "Four Same:", "Full house:",
                "Small Straight:", "Large Straight:",
                "Chance:", "Yatzy:"
        };

        for (int i = 0; i < txfResults.length; i++) {
            TextField result = new TextField();
            scorePane.add(result, 1, i);
            result.setEditable(false);
            result.setPrefWidth(w);
            txfResults[i] = result;
            result.setOnMouseClicked(event -> mouseClicked(event));
        }
        for (int i = 0; i < txfResults.length; i++) {
            Label resultLabel = new Label(labelNames[i]);
            scorePane.add(resultLabel, 0, i);


        }

        Label lblSum1 = new Label("Sum:");
        scorePane.add(lblSum1, 2, 5);
        scorePane.add(txfSumSame, 3, 5);
        txfSumSame.setPrefWidth(75);
        txfSumSame.setEditable(false);

        Label lblBonus = new Label("Bonus:");
        scorePane.add(lblBonus, 2, 6);
        scorePane.add(txfBonus, 3, 6);
        txfBonus.setPrefWidth(w);
        txfBonus.setEditable(false);

        Label lblSum2 = new Label("Sum:");
        scorePane.add(lblSum2, 2, 14);
        scorePane.add(txfSumOther, 3, 14);
        txfSumOther.setPrefWidth(w);
        txfSumOther.setEditable(false);

        Label lblTotal = new Label("Total:");
        scorePane.add(lblTotal, 2, 15);
        scorePane.add(txfTotal, 3, 15);
        txfTotal.setPrefWidth(w);
        txfTotal.setEditable(false);
    }

    // -------------------------------------------------------------------------

    // Create an action method for btnRoll's action.
    // Hint: Create small helper methods to be used in the action method.
    public void rollAction() {
        btnRoll.setText("Throw " + (dice.getThrowCount()));
        if (dice.getThrowCount() == 1) {
            resetCheckbox();
        }

        if (dice.getThrowCount() < 4) {
            dice.throwDice(holdDice());
            for (int i = 0; i < txfValues.length; i++) {
                txfValues[i].setText("" + dice.getValues()[i]);
            }
            if (dice.getThrowCount() == 4) {
                greyCheckbox();
                btnRoll.setDisable(true);
            }
            showResult();
        }
    }


    public boolean[] holdDice() {
        boolean[] holdDie = new boolean[cbxHolds.length];
        for (int i = 0; i < cbxHolds.length; i++) {
            if (cbxHolds[i].isSelected()) {
                holdDie[i] = true;
                cbxHolds[i].setDisable(true);
            }
        }
        return holdDie;
    }

    public void showResult() {
        for (int i = 0; i < txfResults.length; i++) {
            if (!txfResults[i].isDisabled()) {
                txfResults[i].setText("" + dice.getResults()[i]);
            }
        }
    }

    public void getSum1() {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            if (txfResults[i].isDisabled()) {
                sum += Integer.parseInt(txfResults[i].getText().trim());
            }

            txfSumSame.setText("" + sum);
        }
    }

    public void resetCheckbox() {
        for (int i = 0; i < cbxHolds.length; i++) {
            cbxHolds[i].setDisable(false);
            cbxHolds[i].setSelected(false);

        }
    }

    public void greyCheckbox() {
        for (int i = 0; i < cbxHolds.length; i++) {
            cbxHolds[i].setDisable(true);
        }
    }

    public void getBonus() {
        int bonusSum = 0;

        if (Integer.parseInt(txfSumSame.getText()) >= 63) {
            bonusSum = 50;
        }
        txfBonus.setText("" + bonusSum);
    }

    public void getSum2() {
        int sum = 0;
        for (int i = 6; i < 15; i++) {
            if (txfResults[i].isDisabled()) {
                sum += Integer.parseInt(txfResults[i].getText().trim());
            }
            txfSumOther.setText("" + sum);
        }
    }

    public void getTotalSum() {
        int sum = Integer.parseInt(txfBonus.getText()) + Integer.parseInt(txfSumSame.getText()) + Integer.parseInt(txfSumOther.getText());
        txfTotal.setText("" + sum);
    }
    // -------------------------------------------------------------------------

    // Create a method for mouse click on one of the text fields in txfResults.
    // Hint: Create small helper methods to be used in the mouse click method.
    private void mouseClicked(MouseEvent event) {
        if (dice.getThrowCount() != 1) {
            TextField txf = (TextField) event.getSource();
            txf.setStyle("-fx-background-color: yellow");
            txf.setDisable(true);
            btnRoll.setDisable(false);
            dice.resetThrowCount();
            getSum1();
            getSum2();
            getBonus();
            getTotalSum();
        }
    }
}


