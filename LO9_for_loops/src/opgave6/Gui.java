package opgave6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {

	@Override
	public void start(Stage stage) {
		GridPane root = this.initContent();
		Scene scene = new Scene(root);

		stage.setTitle("Loops");
		stage.setScene(scene);
		stage.show();
	}

	private GridPane initContent() {
		GridPane pane = new GridPane();
		Canvas canvas = new Canvas(200, 200);
		pane.add(canvas, 0, 0);
		this.drawShapes(canvas.getGraphicsContext2D());
		return pane;
	}

	// ------------------------------------------------------------------------

	private void drawShapes(GraphicsContext gc) {
		// Replace the statement here with your code.
//		gc.strokeLine(10, 10, 150, 80);

		//Example:
//	int y1 = 30;
//	int y2 = 60;
//	for(int i = 0; i < 20; i++){
//		int x = 10 + i * 8;
//		gc.strokeLine(x,y1,x,y2);
//		}
//	}
//	gc.strokeLine(0,170,180,170);
//	gc.strokeLine(165,160,180,170);
//	gc.strokeLine(165,180,180,170);
//
//	int y = 165;
//	int y1 = 175;
//	for(int i = 0; i<11;i++){
//	int x = 10 + i * 15;
//	gc.strokeLine(x,y,x,y1);
//
//	if(i%5==0){
//		gc.strokeLine(x,y-5,x,y1+5);
//		gc.strokeText(i+"",x,185);
//	}
//	}
//	String s = "Datamatiker";
//	int x = 20;
//	int y = 10;
//	for(int o = 0; o<=11; o++){
//		gc.fillText(s.substring(0,o),x,y);
//		y+=15;
//	}
//		 Exercise 8
//	int x = 16;
//	int y = 80;
//	int y1 = 160;
//	for( int i=0; i<=10; i++){
//		gc.strokeLine(x,y,x,y1);
//		x+=16;
//		y-=4;
//		y1-=12;
//	}
		// Exercise 9
		double x = 180;
		while (x > 5) {
			double y = 100 - x / 5;
			double y1 = 100 + x / 2;
			gc.strokeLine(x, y, x, y1);
			x *= 0.75;
		}
	}
}