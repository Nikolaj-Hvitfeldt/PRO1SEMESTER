package E05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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
        Circle circle = new Circle(70, 70, 40);
        pane.getChildren().add(circle);
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.BLUE);
        circle.setStrokeWidth(5);

        Circle circle1 = new Circle(150,70,40);
        pane.getChildren().add(circle1);
        circle1.setFill(Color.TRANSPARENT);
        circle1.setStroke(Color.BLACK);
        circle1.setStrokeWidth(5);

        Circle circle2 = new Circle(110,110,40);
        pane.getChildren().add(circle2);
        circle2.setFill(Color.TRANSPARENT);
        circle2.setStrokeWidth(5);
        circle2.setStroke(Color.YELLOW);

        Circle  circle3 = new Circle(190,110,40);
        pane.getChildren().add(circle3);
        circle3.setFill(Color.TRANSPARENT);
        circle3.setStroke(Color.GREEN);
        circle3.setStrokeWidth(5);

        Circle circle4 = new Circle(230,70,40);
        circle4.setFill(Color.TRANSPARENT);
        circle4.setStroke(Color.RED);
        circle4.setStrokeWidth(5);
        pane.getChildren().add(circle4);
    }

}
