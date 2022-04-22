package opgave1;

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

//		exercise 1:
//		int x = 100;
//		int y = 75;
//		int arrowlenght = 20;
//		int arrowheight = 8;
//		gc.strokeLine(x, y, x + arrowlenght, y - arrowheight);
//		gc.strokeLine(x, y, x + arrowlenght, y + arrowheight);
//
//		x = 100;
//		y = 125;
//		gc.strokeLine(x, y, x + arrowlenght, y - arrowheight);
//		gc.strokeLine(x, y, x + arrowlenght, y + arrowheight);
//
//		x = 20;
//		y = 50;
//		gc.strokeLine(x, y, x + arrowlenght, y - arrowheight);
//		gc.strokeLine(x, y, x + arrowlenght, y + arrowheight);
//
//		int x1 = 100; // start point x1,y1
//		int y1 = 100;
//		int x2 = 20; // endpoint x2, y2
//		int y2 = 10;
//		while (x2<=180){
//		gc.strokeLine(x1,y1,x2,y2);
//		x2 = x2 +20;
//		}
//		exercise 3:

//		example
//		int x1 = 20;
//		int y1 = 190;
//		int x2 = 180;
//		int y2 = 10;
//		while (x1<=180){
//			gc.strokeLine(x1,y1,x2,y2);
//			x1 = x1 + 40;
//			x2 = x2 - 40;
//		}
//		Figure 1:
//		int x = 20;
//		int y1 = 10;
//		int y2 = 190;
//		while (x<=200){
//			gc.strokeLine(x,y1,x,y2);
//			x=x+40;
//		}
//		Figure 2:
//		int x1 = 20;
//		int y = 10;
//		int x2 = 190;
//		while (y<=200){
//			gc.strokeLine(x1,y,x2,y);
//			y=y+40;
//	}
//		Figure 3:
//		int x1 = 95;
//		int x2 = 105;
//		int y = 20;
//		int lineheight = 20;
//		int linelenght = 40;
//		while(y<=180 && x1<=180){
//			gc.strokeLine(x1,y,x2,y);
//			x1= x1 + lineheight;
//			x2 = x2 - lineheight;
//			y = y + linelenght;
//		}
		// exercise 4:
//		String s = "Datamatiker";
//		int x =20;
//		int y = 10;
//		int o = 1;
//		while(s.length()>=o){
//			gc.fillText(s.substring(0,o), x,y);
//			y+=15;
//			o+=1;
		}
	}

