package application;


import javafx.application.Application;
//import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
import javafx.scene.layout.*;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AllLayouts extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // create a BorderPane
        BorderPane borderPane = new BorderPane();

        // create a HBox
        HBox hbox = new HBox();
        
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll( new Button("hi"));

        // create a VBox
        VBox vbox = new VBox();
        
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(new Label("name:"), new TextField(), hbox);

        // create a StackPane
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll( new Button("click"));

        // create a GridPane
        GridPane gridPane = new GridPane();
       
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(new Label("name:"), 0, 0);
//        gridPane.add(new TextField(), 1, 0);
//        gridPane.add(new Label("Password:"), 0, 1);
//        gridPane.add(new TextField(), 1, 1);
//        gridPane.add(new Button("Login"), 1, 2);

        // add the layouts to the BorderPane
        borderPane.setTop(new Label("Top"));
        
       borderPane.setLeft(vbox);
        borderPane.setCenter(stackPane);
        //borderPane.setRight(new Label("BorderPane Right"));
        borderPane.setBottom(gridPane);

        // create the scene and set the BorderPane as the scene's root
        Scene scene = new Scene(borderPane, 600, 400);

        // set the scene and show the stage
        stage.setScene(scene);
        stage.setTitle("Layout");
        stage.show();
    }
}
