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
public class Main extends Application{

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }
/*Переопределяем метод start класса Application*/
    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        Label label1 = new Label("Добро пожаловать в первую сцену!");
        Button button1 = new Button("Переход на сцену 2");
        button1.setOnAction(event -> window.setScene(scene2));

        /*Создаем стэк выходной слой 1*/
        VBox layout1 = new VBox(20);
        /*Помещаем в него все элементы*/
        layout1.getChildren().addAll(label1, button1);

        /*Создаем сцену и размещаем в нее слой с элементами и устанавливаем размер*/
        scene1 = new Scene(layout1, 200, 200);

        /*Создаем еще одну кнопку с монитором управления событиями*/
        Button button2 = new Button("Возврат на сцену 1");
        button2.setOnAction(event -> window.setScene(scene1));

        /*Создаем второй слой*/
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2,600,300);

        window.setScene(scene1);
        window.setTitle("Окно программы");
        window.show();






    }

}
