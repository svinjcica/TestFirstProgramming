/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import db.DataBase;
import db.User;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author MAJA
 */
public class SecWin extends JFrame{
    String username;
    private Panel panel;
    //private Label txt = new Label("INSERT");
    private Label autor = new Label("autor:");
    private TextField autorField = new TextField();
    private Label ime = new Label("ime:");
    private Label imeField = new Label("iadavac:");
    private TextField izdavac = new TextField();
    private Label izdavacField = new Label("iadavac:");
    private JButton search = new JButton("search");
    private TextArea txt = new TextArea();
    

    public Panel platePanel(){
        
        return panel;
    }
    
    public SecWin(){
        super("login");
        setBounds(250,50,200,250);
	setResizable(false);
     //   add(platePanel(),BorderLayout.CENTER);
    }
    
   

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Panel getPanel() {
        return panel;
    }

    public void setPanel(Panel panel) {
        this.panel = panel;
    }

    public Label getAutor() {
        return autor;
    }

    public void setAutor(Label autor) {
        this.autor = autor;
    }

    public TextField getAutorField() {
        return autorField;
    }

    public void setAutorField(TextField autorField) {
        this.autorField = autorField;
    }

    public Label getIme() {
        return ime;
    }

    public void setIme(Label ime) {
        this.ime = ime;
    }

    public TextField getIzdavac() {
        return izdavac;
    }

    public void setIzdavac(TextField izdavac) {
        this.izdavac = izdavac;
    }

    public Label getIzdavacField() {
        return izdavacField;
    }

    public void setIzdavacField(Label izdavacField) {
        this.izdavacField = izdavacField;
    }

    public JButton getSearch() {
        return search;
    }

    public void setSearch(JButton search) {
        this.search = search;
    }

    public TextArea getTxt() {
        return txt;
    }

    public void setTxt(TextArea txt) {
        this.txt = txt;
    }

    public Label getImeField() {
        return imeField;
    }

    public void setImeField(Label imeField) {
        this.imeField = imeField;
    }
    
    
}
