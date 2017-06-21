/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfirstlibrary;


import db.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MAJA
 */
public class LibraryJunitTest {

    /**
     * @param args the command line arguments
     */
    @Test
    public void testUserDontExist(){
        DataBase db = DataBase.getDB();
        User user = db.getUserByNickname("s");
        assertEquals(null, user);
        
    }
    
    @Test
    public void testPutUser(){
     
        DataBase db = DataBase.getDB();
        
        String nickname = "svinjcica";
        String name = "Maja";
        String surname = "Zivkovic";
        int birthYear = 1993;
        
        db.createUser(nickname, name, surname,  birthYear);
        
        User user = db.getUserByNickname(nickname);
        assertNotNull(user);
        assertEquals(nickname, user.getNickname());
        assertEquals(name, user.getName());
        assertEquals(surname, user.getSurname());
        assertEquals(birthYear, user.getBirthYear());
        
        
    }
    
  
    
    public LibraryJunitTest(){
    }
}
