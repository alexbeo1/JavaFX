import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * Александр Козлов
 * 28.08.2015.
 */
public class Main extends Application{

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }
/*Переопределяем метод start класса Application*/
    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        button = new Button("Нажми меня");
        button.setOnAction(e -> AlertBox.display("Внимание", "Возникла ошибка"));


        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene1 = new Scene(layout, 300, 250);

        window.setScene(scene1);
        window.setTitle("Окно программы");
        window.show();






    }

}
