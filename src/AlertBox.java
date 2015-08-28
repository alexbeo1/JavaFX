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
public class AlertBox {

    public static void display(String title, String message) {

        Stage window = new Stage();
        /*Если данное окно активно другие недоступны*/
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);

        Button closeButton = new Button("Закрыть окно");
        closeButton.setOnAction(event -> window.close());

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label,closeButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.showAndWait();



    }
}

