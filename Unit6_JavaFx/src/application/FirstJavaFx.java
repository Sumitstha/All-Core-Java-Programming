package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FirstJavaFx extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		Button btn = new Button("Exit Button");
		btn.setOnAction(e->System.exit(0));
		btn.setStyle("-fx-background-color:green");//internal CSS
		
		Button btn2 = new Button("Open Button");
		btn2.setOnAction(e->new FileChooser().showOpenDialog(stage));
		
		
		FlowPane root=new FlowPane();//Default left align
		root.getChildren().addAll(btn,btn2);
		Scene scene=new Scene(root,300,300);//size of scene
		stage.setScene(scene);
		stage.show();
		
		
		
		
	}

}
