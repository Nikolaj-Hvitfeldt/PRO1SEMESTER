package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.ListView;
import model.Arrangement;
import model.Tutor;

import java.awt.event.MouseEvent;

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
    private final ListView<Arrangement> lsvArrangementer = new ListView<>();
    private final ListView<Arrangement> lsvMuligeArrangementer = new ListView<>();
    private final TextField txfNavn = new TextField();
    private final TextField txfEmail = new TextField();

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
        pane.add(lsvArrangementer,2,2);
        lsvArrangementer.prefHeight(150);

        Button btnFjern = new Button("Fjern");
        pane.add(btnFjern,2,3);
//        btnFjern.setOnAction(event -> this.fjernAction);


        Label lblAlleMuligeArrangementer = new Label("Alle mulige Arrangementer");
        pane.add(lblAlleMuligeArrangementer,3,1);
        pane.add(lsvMuligeArrangementer,3,2);
        lsvMuligeArrangementer.prefHeight(150);
        lsvMuligeArrangementer.getItems().setAll(Controller.getArrangementer());

        Button btnTilføj = new Button("Tilføj");
        pane.add(btnTilføj,3,3);
//        btnTilføj.setOnAction(event -> this.tilføjAction);
    }

    private void fjernAction(){

    }

    private void fillFields(Tutor tutor) {
        txfNavn.clear();
        txfNavn.setText(tutor.getNavn());
        txfEmail.clear();
        txfEmail.setText(tutor.getEmail());
    }
//
//    private void fillTutorArrangementer(){
//     Tutor selected = lsvtutor.getSelectionModel().getSelectedItem();
//     lsvtutor.getItems().setAll((Tutor) Controller.guiTutorArrangement(selected));
//    }

    private void tutorSelectionChanged(){
        Tutor selected = lsvtutor.getSelectionModel().getSelectedItem();
        if (selected != null)
            this.fillFields(selected);
    }

}
