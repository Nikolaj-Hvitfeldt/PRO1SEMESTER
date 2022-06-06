package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Arrangement;
import model.Tutor;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Gui extends Application {

    public void start(Stage stage){
        stage.setTitle("Adminstration af Tutorer og Arrangemeneter");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    //----------------------------------------------------------------------------------------

    private final ListView<Tutor> lsvtutor = new ListView<>();
    private final ListView<Arrangement> lvwArrangementer = new ListView<>();
    private final ListView<Arrangement> lsvMuligeArrangementer = new ListView<>();
    private final TextField txfNavn = new TextField();
    private final TextField txfEmail = new TextField();
    private ArrayList<Arrangement> alleArrangementer = Controller.getArrangementer();
    private ArrayList<Arrangement> tutorArrangementer = new ArrayList<>();

    private void initContent(GridPane pane){
        Controller.initStorage();
        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lbltutor = new Label("Tutor:");
        pane.add(lbltutor,0,0);
        pane.add(lsvtutor,0,1,1,4);
        lsvtutor.getItems().setAll(Controller.getTutorer());
        lsvtutor.setPrefWidth(380);
        ChangeListener<Tutor> listener =
                (obs, o, n) -> this.tutorSelectionChanged();
        lsvtutor.getSelectionModel().selectedItemProperty().addListener(listener);

        Label lblNavn = new Label("Navn:");
        pane.add(lblNavn,1,0);
        pane.add(txfNavn,2,0);
        txfNavn.setEditable(false);

        Label lblEmail = new Label("Email:");
        pane.add(lblEmail,1,1);
        pane.add(txfEmail,2,1);
        txfEmail.setEditable(false);

        Label lblArrangement = new Label("Arrangementer:");
        pane.add(lblArrangement,1,2);
        GridPane.setValignment(lblArrangement, VPos.TOP);
        pane.add(lvwArrangementer,2,2);
        lvwArrangementer.prefHeight(150);

        Button btnFjern = new Button("Fjern");
        pane.add(btnFjern,2,3);
        btnFjern.setOnAction(event -> this.fjernAction());


        Label lblAlleMuligeArrangementer = new Label("Alle mulige Arrangementer");
        pane.add(lblAlleMuligeArrangementer,3,1);
        pane.add(lsvMuligeArrangementer,3,2);
        lsvMuligeArrangementer.prefHeight(150);
        lsvMuligeArrangementer.getItems().setAll(alleArrangementer);

        Button btnTilføj = new Button("Tilføj");
        pane.add(btnTilføj,3,3);
//        btnTilføj.setOnAction(event -> this.tilføjAction);
    }

    private void fjernAction() {
        Arrangement arrangement = lvwArrangementer.getSelectionModel().getSelectedItem();
        if (arrangement != null) {
            tutorArrangementer.remove(arrangement);
        }
        lvwArrangementer.getItems().setAll(tutorArrangementer);
    }

    private void tilføjAction(){
        Arrangement arrangement = lsvMuligeArrangementer.getSelectionModel().getSelectedItem();
        if(arrangement != null){
           alleArrangementer.remove(arrangement);
           tutorArrangementer.add(arrangement);
        }
        lsvMuligeArrangementer.getItems().setAll(alleArrangementer);
        lvwArrangementer.getItems().setAll(tutorArrangementer);
    }

    private void fillFields(Tutor tutor) {
        txfNavn.clear();
        txfNavn.setText(tutor.getNavn());
        txfEmail.clear();
        txfEmail.setText(tutor.getEmail());
        tutorArrangementer = tutor.getArrangementer();
        lvwArrangementer.getItems().setAll(tutorArrangementer);
        }

    private void tutorSelectionChanged(){
        Tutor selected = lsvtutor.getSelectionModel().getSelectedItem();
        if (selected != null)
            this.fillFields(selected);
    }
}
