/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfirstlibrary;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import gui.*;
import static org.junit.Assert.*;

/**
 *
 * @author MAJA
 */
public class PanelLoginJUnitTest {
    
    public PanelLoginJUnitTest() {
    }
    
     @Test
     public void testPanelLogin() {
     MyPanel panel = new MyPanel();
     assertNotNull(panel.getTextLabel());
     assertNotNull(panel.getNameLabel()); 
     assertNotNull(panel.getNameField()); 
     assertNotNull(panel.getPassLabel()); 
     assertNotNull(panel.getPassField()); 
     assertNotNull(panel.getLoginButton()); 
     
     assertEquals("username:", panel.getNameLabel().getText());
     assertEquals("password:", panel.getPassLabel().getText());
     assertEquals("login", panel.getLoginButton().getText());
     assertEquals("", panel.getPassField().getText());
     assertEquals("", panel.getNameField().getText());
     assertEquals("INSERT", panel.getTextLabel().getText());
     }
     
     
}
