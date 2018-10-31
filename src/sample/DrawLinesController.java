package sample;

// Rysunek 4.27. DrawLinesController.java
// Użycie strokeLine do połączenia rogów kanwy
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class DrawLinesController {
    @FXML private Canvas canvas; // Służy do pobrania GraphicsContext

    // Gdy użytkownik kliknie przycisk, Rysuj linie, narysuj na kanwie dwie linie
    @FXML
    void drawLinesButtonPressed(ActionEvent event) {
        // Pobierz GraphicsContext, który posłuży do rysowania na Canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Narysuj linię z lewego górnego rogu do prawego dolnego rogu
        gc.strokeLine(0, 0, canvas.getWidth(), canvas.getHeight());

        // Narysuj linię z prawego górnego do lewego dolnego rogu
        gc.strokeLine(canvas.getWidth(), 0, 0, canvas.getHeight());
    }
}

