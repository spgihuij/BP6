package bp6;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application{

    private ContainerView containerView;

    public void start(Stage primaryStage){
        Pane mainPane = new Pane();
        ContainerView containerView = new ContainerView();
        mainPane.getChildren().add(containerView);
        Scene scene = new Scene(mainPane, 800, 800);

        primaryStage.setScene(scene);
        primaryStage.setTitle("BP6");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
