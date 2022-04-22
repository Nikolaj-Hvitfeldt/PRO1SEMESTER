package ex_5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;

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

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final ListView<String> lvwNames = new ListView<>();
    private final ArrayList<String> namesBoys = new ArrayList<>();
    private final ArrayList<String> namesGirls = new ArrayList<>();
    private final ToggleGroup group = new ToggleGroup();
    private final RadioButton rdbBoy = new RadioButton("Boy");
    private final RadioButton rdbGirl = new RadioButton("Girl");

    private void initContent(GridPane pane) {
        this.initNamesGirls();
        this.initNamesBoys();

        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        HBox box = new HBox();
        pane.add(box, 1, 0);

        box.getChildren().add(rdbBoy);
        box.getChildren().add(rdbGirl);
        rdbBoy.setSelected(true);
        rdbBoy.setToggleGroup(group);
        rdbGirl.setToggleGroup(group);
        rdbBoy.setOnAction(event -> this.setBoyList());
        rdbGirl.setOnAction(event -> this.setGirlList());

        Label lblNames = new Label("Names:");
        pane.add(lblNames, 0, 1);
        GridPane.setValignment(lblNames, VPos.TOP);
        lvwNames.setPrefSize(200, 200);
        pane.add(lvwNames, 1, 1);

        Label lblNameBottom = new Label("Name:");
        pane.add(lblNameBottom, 0, 2);
        pane.add(txfName, 1, 2);

        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 2, 2);
        btnAdd.setOnAction(event -> this.addAction());


    }

    private ArrayList<String> initNamesGirls() {
        namesGirls.add("Jane");
        namesGirls.add("Eva");
        namesGirls.add("Lene");
        namesGirls.add("Mette");
        namesGirls.add("Tine");
        namesGirls.add("Line");
        namesGirls.add("Lone");
        namesGirls.add("Alberte");
        namesGirls.add("Pia");
        return namesGirls;
    }

    private ArrayList<String> initNamesBoys() {
        namesBoys.add("Mogens");
        namesBoys.add("Gilbert");
        namesBoys.add("Fede");
        namesBoys.add("Lede");
        namesBoys.add("Slambert");
        namesBoys.add("Herman");
        namesBoys.add("Klunk");
        namesBoys.add("Mandingo");
        namesBoys.add("Keiran Lee");
        return namesBoys;
    }

    private void setBoyList() {

        if (rdbBoy.isSelected()) {
            lvwNames.getItems().clear();
            lvwNames.getItems().setAll(namesBoys);
        }
    }

    private void setGirlList() {
        if (rdbGirl.isSelected()) {
            lvwNames.getItems().clear();
            lvwNames.getItems().setAll(namesGirls);
        }
    }

    private void addAction() {
        String name = txfName.getText().trim();
        if (name.length() > 0 && rdbBoy.isSelected()) {
            namesBoys.add(name);
            lvwNames.getItems().setAll(namesBoys);
            txfName.clear();
        } else if (name.length() > 0 && !rdbBoy.isSelected()){
            lvwNames.getItems().clear();
            namesGirls.add(name);
            lvwNames.getItems().setAll(namesGirls);
            txfName.clear();
        }
    }
}

