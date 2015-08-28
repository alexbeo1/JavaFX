import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * Александр Козлов
 * 28.08.2015.
 */
public class Main extends Application {

    Stage window;
    Scene scene1, scene2;


    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        Label label1 = new Label("Добро пожаловать в первую сцену");
        Button button1 = new Button("Идем в сцену 2");
        button1.setOnAction(event -> window.setScene(scene2));

        VBox layot1 = new VBox(20);
        layot1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layot1,200,200);

        Button button2 = new Button("Идем в сцену 1");
        button2.setOnAction(event -> window.setScene(scene1));

        StackPane layot2 = new StackPane();
        layot2.getChildren().add(button2);
        scene2 = new Scene(layot2, 600, 300);

        window.setScene(scene1);
        window.setTitle("Главное окно");
        window.show();


/*
        primaryStage.setTitle("Заголовок моего первого окна");
        button = new Button();
        button.setText("Click Me!");
        button.setOnAction(event -> System.out.println("Прикольььнооооооо!!!"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
*/


    }


}
