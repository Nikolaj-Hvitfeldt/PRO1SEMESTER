package E03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        Circle circle = new Circle(200, 200, 150);
        pane.getChildren().add(circle);
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.BLACK);

        Circle eye1 = new Circle(150,150,20);
        pane.getChildren().add(eye1);
        eye1.setFill(Color.TRANSPARENT);
        eye1.setStroke(Color.BLACK);

        Circle eye2 = new Circle(250,150,20);
        pane.getChildren().add(eye2);
        eye2.setStroke(Color.BLACK);
        eye2.setFill(Color.TRANSPARENT);

        Line line = new Line(100,250,300,250);
        pane.getChildren().add(line);


    }

}
