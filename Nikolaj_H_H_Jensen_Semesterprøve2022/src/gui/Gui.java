package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Medarbejder;
import model.Vagt;

public class Gui extends Application {

    public void start(Stage stage) {
        stage.setTitle("Adminstration af køkken timeplan");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    //------------------------------------------------------------------------------------------------------------

    private final ListView<Medarbejder> lvwMedarbejdere = new ListView<>();
    private final ListView<Vagt> lvwVagter = new ListView<>();
    private final TextArea txaValgtVagt = new TextArea();


    private void initContent(GridPane pane) {
        Controller.initStorage();
        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblMedarbejdere = new Label("Alle medarbejdere");
        pane.add(lblMedarbejdere,0,0);

        pane.add(lvwMedarbejdere,0,1);
        lvwMedarbejdere.setPrefWidth(300);
        lvwMedarbejdere.getItems().setAll(Controller.getMedarbejdere());

        Label lblVagter = new Label("Alle vagter");
        pane.add(lblVagter,1,0);

        pane.add(lvwVagter,1,1);
        lvwVagter.setPrefWidth(300);
        lvwVagter.getItems().setAll(Controller.getVagter());
        ChangeListener<Vagt> listener = (ov, o, n) -> this.valgtVagtSkift();
        lvwVagter.getSelectionModel().selectedItemProperty().addListener(listener);

        Label lblValgtVagt = new Label("Valgt vagt");
        pane.add(lblValgtVagt,2,0);

        pane.add(txaValgtVagt,2,1);
        txaValgtVagt.setEditable(false);
        txaValgtVagt.setPrefWidth(400);

        Button btnTildelVagt = new Button("Tildel vagt");
        pane.add(btnTildelVagt,1,2);

        Button btnUdskrivFil = new Button("Udskriv vagt til fil");
        pane.add(btnUdskrivFil,2,2);
    }

    private void valgtVagtSkift() {
        this.updateControls();
    }

    public void updateControls() {
        Vagt vagt = lvwVagter.getSelectionModel().getSelectedItem();
        if(vagt != null) {
            txaValgtVagt.appendText(vagt.valgtVagtToString());
        }
    }
}
