package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;


/**
 * Created by Андрей on 06.04.2017.
 */
public class Main extends Application {
    boolean flag = false;
    private int i = 0;
    ArrayList<UserCircle> circlesList = new ArrayList<UserCircle>();
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My test JavaFX");
        primaryStage.setWidth(800   );
        primaryStage.setHeight(500);

        Pane root = new Pane();

        Rectangle field = new Rectangle(10,10,410,410);
        field.setFill(Color.LIGHTGRAY);
        field.setStroke(Color.BLACK);

        field.setOnMouseClicked(event ->{
            UserCircle circle = new UserCircle(root, event.getX(),event.getY(),15, i++);
            circlesList.add(circle);
        });

        root.getChildren().addAll(field);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
