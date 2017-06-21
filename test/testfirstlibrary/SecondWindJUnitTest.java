/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfirstlibrary;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MAJA
 */

import db.*;
import gui.*;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JButton;


public class SecondWindJUnitTest {
    
    public SecondWindJUnitTest() {
    }
    
        @BeforeClass
    public static void set(){
        DataBase db = DataBase.getDB();
        db.addBook("Na Drini cuprija", "Ivo Andric", "Zavod za udzbenike", 375, 2012);
        db.addBook("Dervis i smrt", "Mesa Selimovic", "Stubovi kulture", 380, 2014);
        db.addBook("Enciklopedija mrtvih", "Danilo Kis", "Stubovi kulture", 250, 2010);
        db.addBook("Enciklopedija mrtvih 2", "Danilo Kis", "Stubovi kulture", 250, 2010);
        
        String s = db.createUser("maja123", "Maja", "Zivkovic",1993 );
        s = db.createUser("sanjaz", "Sanja", "Zivkovic",1991 );
        s = db.createUser("milena1", "Milena", "Milovanovic",1992 );
        s = db.createUser("neko", "Pera", "Peric",1993 );
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testSecWind() {
      SecWin s = new SecWin();
      
//     assertNotNull(s.getPanel()); 
     assertNotNull(s.getAutor()); 
     assertNotNull(s.getAutorField()); 
     assertNotNull(s.getIme());
     assertNotNull(s.getImeField());
     assertNotNull(s.getIzdavac()); 
     assertNotNull(s.getIzdavacField()); 
     assertNotNull(s.getSearch());
     assertNotNull(s.getTxt());
     }
     
    
     @Test
     public void testFileds() {
      SecWin s = new SecWin();
       
      String name = "neko ime";
      String author = " Ibrahim";
      String publisher = "SomeSome";
      
      s.getAutorField().setText(author);
      assertEquals(author, s.getAutorField().getText());
      s.getImeField().setText(name);
      assertEquals(name, s.getImeField().getText());
      s.getIzdavacField().setText(publisher);
      assertEquals(publisher, s.getIzdavacField().getText());
     }

     @Test
     public void testTextArea(){
         SecWin s = new SecWin();
         assertEquals("", s.getTxt().getText());
         
         s.getImeField().setText("Ivo Andric");
         assertEquals("Ivo Andric", s.getImeField().getText());
         s.getAutorField().setText("");
         assertEquals("",  s.getIzdavacField().getText());
         s.getIzdavacField().setText("");
         assertEquals("", s.getAutorField().getText());
         s.getSearch().doClick();
         
         assertNotEquals("",s.getTxt().getText());
         
     }
   

  
}
