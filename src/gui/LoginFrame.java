/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import db.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author MAJA
 */
public class LoginFrame extends JFrame{
    private Panel panel;
    private Label txt = new Label("INSERT");
    private Label name = new Label("username:");
    private TextField nameFiled = new TextField();
    private Label pass = new Label("password:");
    private JButton loginButton = new JButton("login");
    private TextField passFiled = new TextField();
    private SecWin secWind = new SecWin();

    
    public Panel platePanel(){
        panel = new Panel(new GridLayout(3, 1));
        Panel plate = new Panel( new GridLayout(1, 2));
        Panel plate1 = new Panel(new GridLayout(1,2));
        
        plate.add(name); plate.add(nameFiled);
        plate1.add(pass); plate1.add(passFiled); 
        
        panel.add(plate);
        panel.add(plate1);
        panel.add(loginButton);
        loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                            DataBase db = DataBase.getDB();
                            String name = nameFiled.getText(), passw = passFiled.getText();
                            if(!name.equals("") && !passw.equals("")){
                                User u = db.getUserByNickname(name);
                                if(u.getNickname().equals(name)){
                                secWind.setUsername(name);
                                secWind.setVisible(true);
				dispose();
                                }
                            }
                        }});
        return panel;
    }
    
    public LoginFrame() {
        super("login");
        setBounds(250,50,200,250);
	setResizable(false);
        add(platePanel(),BorderLayout.CENTER);
    }

    public Panel getPanel() {
        return panel;
    }

    public void setPanel(Panel panel) {
        this.panel = panel;
    }

    public Label getTextLabel() {
        return txt;
    }

    public void setTxt(Label txt) {
        this.txt = txt;
    }

    public Label getNameLabel() {
        return name;
    }

    public void setName(Label name) {
        this.name = name;
    }

    public TextField getNameField() {
        return nameFiled;
    }

    public void setNameFiled(TextField nameFiled) {
        this.nameFiled = nameFiled;
    }

    public Label getPassLabel() {
        return pass;
    }

    public void setPass(Label pass) {
        this.pass = pass;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public TextField getPassField() {
        return passFiled;
    }

    public void setPassFiled(TextField passFiled) {
        this.passFiled = passFiled;
    }

    public SecWin getSecWind() {
        return secWind;
    }

    public void setSecWind(SecWin secWind) {
        this.secWind = secWind;
    }
    
    
    
    
}
