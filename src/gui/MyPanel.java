/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author MAJA
 */
public class MyPanel extends Panel{
    
    private Label txt = new Label("INSERT");
    private Label name = new Label("username:");
    private TextField nameFiled = new TextField();
    private Label pass = new Label("password:");
    private JButton loginButton = new JButton("login");
    private TextField passFiled = new TextField();

    public MyPanel() {
        Panel plate = new Panel( new GridLayout(2, 1));
        Panel plate1 = new Panel(new GridLayout(2,1));
        
        plate.add(name); plate.add(nameFiled);
        plate1.add(pass); plate.add(pass);
        
        add(plate);
        add(plate1);
    }
  
    
     public JButton getLoginButton(){
         return loginButton;
     }
     
     
     public TextField getNameField(){
         return nameFiled;
     }
     
     public TextField getPassField(){
         return passFiled;
     }
     
    public Label getTextLabel(){
        return txt;
    }
    
    public Label getPassLabel(){
        return pass;
    }
    
    public Label getNameLabel(){
        return name;
    }
    
}
