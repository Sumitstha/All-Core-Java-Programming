package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
//import javafx.scene.control.Menu;
//import javafx.scene.control.MenuBar;
//import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // create the menu bar
        MenuBar menuBar = new MenuBar();

        // create the file menu
        Menu fileMenu = new Menu("File");

        // create the menu items
        MenuItem openMenuItem = new MenuItem("Open");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem exitMenuItem = new MenuItem("Exit");

        // add the menu items to the file menu
        fileMenu.getItems().addAll(openMenuItem, saveMenuItem, exitMenuItem);

        // add the file menu to the menu bar
        menuBar.getMenus().add(fileMenu);

        // create the root layout and add the menu bar to it
        BorderPane rootLayout = new BorderPane();
        rootLayout.setTop(menuBar);

        // create the scene and set the root layout as the scene's root
        Scene scene = new Scene(rootLayout, 400, 300);

        // set the scene and show the stage
        stage.setScene(scene);
        stage.setTitle("Menu");
        stage.show();
    }
}
