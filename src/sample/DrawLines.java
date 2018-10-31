package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DrawLines extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Wczytuje DrawLines.fxml i konfiguruje DrawLinesController
        Parent root =
                FXMLLoader.load(getClass().getResource("DrawLines.fxml"));

        Scene scene = new Scene(root); // Dołącz graf scenki do scenki
        stage.setTitle("Rysowanie linii"); // Wyświetlany na pasku tytułu
        stage.setScene(scene); // Dołącz scenkę do sceny
        stage.show(); // Wyświetl scenę
    }

    public static void main(String[] args) {
        launch(args); // Tworzy obiekt DrawLines i wywołuje jego metodę start
    }
}
