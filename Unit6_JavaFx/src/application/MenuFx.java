package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuFx extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		MenuBar bar=new MenuBar();
		Menu fileMenu=new Menu("File");
		MenuItem open =new MenuItem("Open");
		MenuItem save =new MenuItem("Save");
		MenuItem exit =new MenuItem("Exit");
		BorderPane root=new BorderPane();
		
		root.setTop(bar);//Layout's north part
		fileMenu.getItems().addAll(open,save,exit);
		bar.getMenus().add(fileMenu);
		
		
		Scene scene=new Scene(root,300,300);
		stage.setScene(scene);
		stage.show();
		
	}
}
