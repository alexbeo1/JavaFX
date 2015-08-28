import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Александр Козлов
 * 28.08.2015.
 */
public class ConfirmBox {

    static boolean answer;

    public static boolean display(String title, String message) {

        Stage window = new Stage();
        /*Если данное окно активно другие недоступны*/
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);

//        Создаем две кнопки

        Button buttonYes = new Button("Да");
        buttonYes.setOnAction(event -> {
            answer = true;
            window.close();
        } );

        Button buttonNo = new Button("Нет");
        buttonNo.setOnAction(event -> {
            answer = false;
            window.close();
        });


        VBox layout = new VBox(20);
        layout.getChildren().addAll(label,buttonYes,buttonNo);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.showAndWait();

        return answer;


    }
}