package E04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import javax.swing.plaf.ColorUIResource;

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
        circle.setStrokeWidth(40);

        Circle circle1 = new Circle(200,200,75);
        pane.getChildren().add(circle1);
        circle1.setFill(Color.TRANSPARENT);
        circle1.setStroke(Color.BLACK);
        circle1.setStrokeWidth(40);

        Circle circle2 = new Circle(200,200,35);
        pane.getChildren().add(circle2);
        circle2.setFill(Color.BLACK);
        circle2.setStroke(Color.BLACK);

    }

}
