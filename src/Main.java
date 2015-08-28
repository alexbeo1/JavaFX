import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * Александр Козлов
 * 28.08.2015.
 */
public class Main extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Главное окно");

        button = new Button();
        button.setText("Старт");

        StackPane layot = new StackPane();
        layot.getChildren().add(button);

        Scene scene = new Scene(layot, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
