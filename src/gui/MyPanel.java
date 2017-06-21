/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.*;

/**
 *
 * @author MAJA
 */
public class MyPanel extends JPanel{
    
    private JLabel txt = new JLabel("INSERT");
    private JLabel name = new JLabel("username:");
    private JTextField nameFiled = new JTextField();
    private JLabel pass = new JLabel("password:");
    private JButton loginButton = new JButton("login");
    private JTextField passFiled = new JTextField();
  
    
     public JButton getLoginButton(){
         return loginButton;
     }
     
     
     public JTextField getNameField(){
         return nameFiled;
     }
     
     public JTextField getPassField(){
         return passFiled;
     }
     
    public JLabel getTextLabel(){
        return txt;
    }
    
    public JLabel getPassLabel(){
        return pass;
    }
    
    public JLabel getNameLabel(){
        return name;
    }
    
}
