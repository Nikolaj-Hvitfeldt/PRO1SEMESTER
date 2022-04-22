package ex_6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex_6 extends Application {


    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 6");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final TextField txfName1 = new TextField();
    private final TextField txfName2 = new TextField();
    private final TextArea txaStudent = new TextArea();
    private final CheckBox cbxActive = new CheckBox();

    Student student;


    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(5);
        // set vertical gap between components
        pane.setVgap(5);

        Label lblStudentInfo = new Label("Student Info: ");
        pane.add(lblStudentInfo,0,0);

        pane.add(txaStudent,0,1);
        txaStudent.setPrefRowCount(10);
        txaStudent.setPrefWidth(300);
        txaStudent.setEditable(false);

        Label lblName = new Label("Name:");
        pane.add(lblName,0,2);
        pane.add(txfName1,1, 2);
        GridPane.setMargin(txfName1, new Insets(0, 0,0 ,-250 ));
        txfName1.setPrefWidth(150);
        txfName1.setMaxWidth(150);

        Label lblAge = new Label("Age:");
        pane.add(lblAge,0,3);
        pane.add(txfName2,1,3);
        GridPane.setMargin(txfName2, new Insets(0, 0,0 ,-250 ));
        txfName2.setPrefWidth(80);
        txfName2.setMaxWidth(80);

        Button btnInc = new Button("Inc");
        pane.add(btnInc,1,3);
        GridPane.setMargin(btnInc, new Insets(0, 0,0 ,-160 ));

        Button btnReset = new Button("Reset");
        pane.add(btnReset,1,3);
        GridPane.setMargin(btnReset, new Insets(0, 0,0 ,-110 ));

        Label lblActive = new Label("Active:");
        pane.add(lblActive,0,4);

        pane.add(cbxActive,1,4);
        GridPane.setMargin(cbxActive, new Insets(0, 0,0 ,-260 ));

        Button btnCreate = new Button("Create");
        pane.add(btnCreate,0,5);
        GridPane.setMargin(btnCreate, new Insets(0, 0,0 ,40 ));
        btnCreate.setOnAction(event -> createAction());

        Button btnUpdate = new Button("Update");
        pane.add(btnUpdate,1,5);
        GridPane.setMargin(btnUpdate, new Insets(0, 0,0 ,-180 ));

        Button btnDelete = new Button("Delete");
        pane.add(btnDelete,2,5);
        GridPane.setMargin(btnDelete, new Insets(0, 0,0 ,-100 ));
    }


        private void createAction(){
            String studentInfo = "Name: " + txfName1.getText() + " \n" + "Age: " + Integer.parseInt(txfName2.getText());
            txaStudent.setText(studentInfo);
    }

}
