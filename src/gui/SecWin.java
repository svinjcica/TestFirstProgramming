/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import db.Book;
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
import java.util.ArrayList;
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
    private TextField autorField = new TextField("");
    private Label ime = new Label("ime:");
    private TextField imeField = new TextField("");
    private TextField izdavacField = new TextField("");
    private Label izdavac = new Label("izadavac:");
    private JButton search = new JButton("search");
    private TextArea txt = new TextArea("");
    

    public Panel platePanel(){
        panel = new Panel(new GridLayout(2, 1));
        Panel upP = new Panel(new GridLayout(4,2));
        Panel p1 =  new Panel(new GridLayout(1,2));
        p1.add(ime); p1.add(imeField);
        Panel p2 =  new Panel(new GridLayout(1,2));
        p2.add(autor); p2.add(autorField);
        Panel p3 =  new Panel(new GridLayout(1,2));
        p3.add(izdavac); p3.add(izdavacField);
        upP.add(p1); upP.add(p2); upP.add(p3);
        upP.add(search);
        panel.add(upP);
        panel.add(txt, BorderLayout.SOUTH);
        
        search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                            DataBase db = DataBase.getDB();
                           ArrayList<Book> books = db.searchBook(imeField.getSelectedText(), autorField.getText(), izdavacField.getText());
                            if(books.size() == 0)
                                txt.setText("No result");
                            String s = "";
                            for(Book b: books){
                                s+=b.toString();
                            }
                            txt.setText(s);
                        }});
        return panel;
    }
    
    public SecWin(){
        super("login");
        setBounds(250,50,500,500);
	setResizable(false);
        add(platePanel(),BorderLayout.CENTER);
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

    public TextField getImeField() {
        return imeField;
    }

    public void setImeField(TextField imeField) {
        this.imeField = imeField;
    }

    public TextField getIzdavacField() {
        return izdavacField;
    }

    public void setIzdavacField(TextField izdavacField) {
        this.izdavacField = izdavacField;
    }

    public Label getIzdavac() {
        return izdavac;
    }

    public void setIzdavac(Label izdavac) {
        this.izdavac = izdavac;
    }

    
    
    
}
