/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3b_antony;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;

/**
 *
 * @author 04238295218
 */
public abstract class MenuPrincipalController_1 implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    

/**
 * FXML Controller class
 *
 * @author 01543386210
 */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        }
    }
