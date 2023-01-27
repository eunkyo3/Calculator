package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
			System.setProperty("prism.lcdtext", "false");
			Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
			Scene scene = new Scene(root,400,550);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Calculator");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
/* 계산결과 -> label -> id :: lblResult
 * 계산과정 -> label -> id :: lblP
 * 0 - 9 -> button -> id :: btn0 -btn9
 * + -> button id :: btnAdd
 * - -> button id :: btnMinus
 * / -> button id :: btnDiv
 * * -> button id :: btnMul
 * C -> button id :: btnClear
 * = -> button id :: btnEnter
 * 파일명 calculator.fxml
 */