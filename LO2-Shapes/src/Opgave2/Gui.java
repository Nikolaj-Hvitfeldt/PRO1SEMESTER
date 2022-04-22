package Opgave2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
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
        int dx = 100;

        Circle circle = new Circle(100 +dx, 100, 30);
        pane.getChildren().add(circle);
        circle.setFill(Color.YELLOW);
        circle.setStroke(Color.YELLOW);

        Rectangle rectangle = new Rectangle(200 + dx,100, 75, 25);
        pane.getChildren().add(rectangle);
        rectangle.setStroke(Color.YELLOW);
        rectangle.setFill(Color.GREENYELLOW);

        Line line = new Line(300 +dx,100,300 +dx,100);
        pane.getChildren().add(line);
    }

}
