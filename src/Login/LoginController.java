/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import static javafx.stage.StageStyle.TRANSPARENT;

/**
 * FXML Controller class
 *
 * @author pacevil
 */
public class LoginController implements Initializable {
    @FXML
    private Pane pan;
     @FXML
    private AnchorPane root;
    private double initX;
    private double initY;
    
    
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
    private void klikregis(ActionEvent event) {

        try {
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent rocot = FXMLLoader.load(getClass().getResource("/SignUp/SignUp.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(rocot);
            scene.setFill(Color.TRANSPARENT);
            stage.initStyle(TRANSPARENT);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {

        }

    }
    @FXML
    private void kliklogin(ActionEvent event) {

        try {
           ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent rocot = FXMLLoader.load(getClass().getResource("/Navigator/Nav.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(rocot);
            scene.setFill(Color.TRANSPARENT);
            stage.initStyle(TRANSPARENT);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {

        }

    }
     @FXML
    private void klikforgot(MouseEvent event) {

        try {
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent rocot = FXMLLoader.load(getClass().getResource("/Forgot/Forgot.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(rocot);
            scene.setFill(Color.TRANSPARENT);
            stage.initStyle(TRANSPARENT);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {

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
