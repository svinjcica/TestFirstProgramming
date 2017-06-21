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
    public static void setUpClass() {
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
      
     assertNotNull(s.getUsername());
     assertNotNull(s.getPanel()); 
     assertNotNull(s.getAutor()); 
     assertNotNull(s.getAutorField()); 
     assertNotNull(s.getIme());
     assertNotNull(s.getImeField());
     assertNotNull(s.getIzdavac()); 
     assertNotNull(s.getIzdavacField()); 
     assertNotNull(s.getSearch());
     assertNotNull(s.getTxt());
     }
     
    


   

  
}
