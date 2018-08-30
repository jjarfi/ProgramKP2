/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import static Navigator.NavController.rootp;
import com.jfoenix.controls.JFXDrawer;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author pacevil
 */
public class AdminController implements Initializable {
    private double initX;
    private double initY;
    @FXML
    private AnchorPane pan;
    @FXML
    private AnchorPane root;
    @FXML
    private JFXDrawer drawer;
    
    @FXML
    private void drag(MouseEvent event) {
        Stage stage = (Stage) pan.getScene().getWindow();
        stage.setX(event.getScreenX() - initX);
        stage.setY(event.getScreenY() - initY);
    }
    @FXML
    private void pres(MouseEvent event) {
        Stage stage = (Stage) pan.getScene().getWindow();
        initX = event.getScreenX() - stage.getX();
        initY = event.getScreenY() - stage.getY();
    }
     @FXML
    private void tutup(MouseEvent event) throws IOException {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.close();

    }

    @FXML
    private void sembunyi(MouseEvent event) throws IOException {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setIconified(true);
    }
    @FXML
    private void klik(MouseEvent event) {
        try {
            rootp = root;
            try {
                HBox box = FXMLLoader.load(getClass().getResource("/NavMenu/Menu.fxml"));
                drawer.setSidePane(box);
                FadeTransition ft = new FadeTransition(Duration.millis(1500));
                ft.setRate(-1);
                ft.setRate(ft.getRate() * -1);
                ft.play();
                if (drawer.isShown()) {
                    drawer.close();

                } else {
                    drawer.open();
                }
            } catch (IOException ex) {

            }

        } catch (Exception ex) {

        }

    }

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
