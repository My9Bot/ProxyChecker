package co.proxychecker.ProxyChecker.gui;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.fxml.FXMLLoader;
import javafx.stage.StageStyle;


/**
 * Creates a Window
 */
public class Window {

    /**
     * Displays a Window
     * @param title - Title of the Window
     * @param fxmlLoader - FXMLLoader content
     */
    public static void show(String title, FXMLLoader fxmlLoader) {
        try {
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle(title);
            stage.getIcons().add(
                    new Image(Window.class.getResourceAsStream("/co/proxychecker/ProxyChecker/assets/icon.png"))
            );
            stage.setResizable(false);
            stage.setScene(new Scene(fxmlLoader.load()));
            stage.show();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
