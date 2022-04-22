package Opgave3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
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
        Circle circle = new Circle(230, 70, 30);
        pane.getChildren().add(circle);
        circle.setFill(Color.YELLOW);
        circle.setStroke(Color.BLACK);

        Rectangle rectangle = new Rectangle(50, 200, 125,125 );
        pane.getChildren().add(rectangle);
        rectangle.setFill(Color.RED);
        rectangle.setStroke(Color.BLACK);

        Polygon polygon = new Polygon(25, 200, 200, 200, 100, 100);
        pane.getChildren().add(polygon);
        polygon.setFill(Color.GREEN);
        polygon.setStroke(Color.BLACK);

        Rectangle rectangle1 = new Rectangle(70, 230,50,50);
        pane.getChildren().add(rectangle1);
        rectangle1.setFill(Color.BLACK);
        rectangle1.setStroke(Color.BLACK);

    }

}
