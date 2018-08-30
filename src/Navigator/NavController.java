/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Navigator;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXToolbar;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author pacevil
 */
public class NavController implements Initializable {

    public static AnchorPane rootp;
    private double initX;
    private double initY;
    @FXML
    private JFXToolbar tool;
    AnchorPane dashboard;
    @FXML
    private JFXDrawer drawer;
    @FXML
    private AnchorPane root;
    @FXML
    private AnchorPane rooot;

    @FXML
    private void drag(MouseEvent event) {
        Stage stage = (Stage) tool.getScene().getWindow();
        stage.setX(event.getScreenX() - initX);
        stage.setY(event.getScreenY() - initY);
    }

    @FXML
    private void pres(MouseEvent event) {
        Stage stage = (Stage) tool.getScene().getWindow();
        initX = event.getScreenX() - stage.getX();
        initY = event.getScreenY() - stage.getY();
    }

  
    private void setNode(Node node) {
       // rooot.getChildren().setAll(dashboard);
        //rooot.getChildren().add(node);
        FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {

            dashboard = FXMLLoader.load(getClass().getResource("/Dashboard/Dash.fxml"));

        } catch (IOException ex) {

        }
        setNode(dashboard);
    }
}
