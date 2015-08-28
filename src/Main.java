import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * Александр Козлов
 * 28.08.2015.
 */
public class Main extends Application implements EventHandler<ActionEvent> {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }
/*Переопределяем метод start класса Application*/
    @Override
    public void start(Stage primaryStage) throws Exception {

        /*Задаем заголовок главного окна в подмостках сцены*/
        primaryStage.setTitle("Главное окно");
        /*Создаем экземляр класса Button и присваиваем переменной button*/
        button = new Button();
        /*Устанавливаем название кнопки*/
        button.setText("Старт");
        button.setOnAction(this);

        /*Создаем  экземпляр класса StackPane который служит для создания стэка элементов  */
        StackPane layot = new StackPane();
        /*Добавляем элемент button в стэк layot*/
        layot.getChildren().add(button);

        /*Создаем новую сцену и вставляем в нее кнопку, а также задаем размеры окна*/
        Scene scene = new Scene(layot, 300, 250);
        /*Размещаем сцену в наших подмостках primaryStage*/
        primaryStage.setScene(scene);
        /*Выводим созданное творение на экран*/
        primaryStage.show();
    }

    /*Монитор событий сцены переписываем метод интерфейса EventHandler */
    @Override
    public void handle(ActionEvent event) {

        /*Проверяем, если событие пришло от кнопки выводим на консоль сообщение*/
        if (event.getSource() == button){
            System.out.println("Нажата кнопка Старт");
        }

    }
}
