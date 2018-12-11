/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1008.pkgfinal.exam;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Priyesh Hingrajia == 200397594
 */
public class FXMLDocumentController implements Initializable {
    
   @FXML
    private TextField lblBookName;

    @FXML
    private TextField lblPrice;

    @FXML
    private TextField lblQuantity;

    @FXML
    private ComboBox<String> comboAuthor;

    @FXML
    private Label errMsg;

     @FXML
    void buttonPressed(ActionEvent event) {
        try{
            
            if(lblBookName.getText() == null) 
                errMsg.setText("Book Title Can not be empty !!");

            else if(comboAuthor.getUserData() == null) 
                errMsg.setText("You must select an author !!");

            else if(lblPrice.getText() == null) 
                errMsg.setText("Price must contains numbers only !!");

            else if(lblQuantity.getText() == null)    
                errMsg.setText("the quantity must be a whole number !");

           
        }
        catch(IllegalArgumentException e)
        {
            errMsg.setText(e.getMessage());
        }
    }
    
    /**
     * Initializes the controller class.
     */
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        errMsg.setText("");
        
        comboAuthor.getItems().add("Jaret");
        comboAuthor.getItems().addAll("Priyesh" , "Jeel" , "Seetaram");
        comboAuthor.setValue("Select Author");
    } 

}

    
      
    

