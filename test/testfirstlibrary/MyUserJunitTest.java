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
public class MyUserJunitTest {

    @Test
    public void testUserDontExist(){
        DataBase db = DataBase.getDB();
        User user = db.getUserByNickname("s");
        assertEquals(null, user);
        
    }
    
    @Test
    public void testWrongInput(){
        DataBase db = DataBase.getDB();
        
        String nickname = "izmislicemo";
        String name = "Maja";
        String surname = "Zivkovic";
        int birthYear = 1993;
        
        String s = db.createUser("", name, surname,  birthYear);
        assertEquals(s, "Wrong data");
        
        User user = db.getUserByNickname("");
        assertNull(user);
       
        s = db.createUser(nickname, "", surname,  birthYear);
        assertEquals(s, "Wrong data");
        
        user = db.getUserByNickname(nickname);
        assertNull(user);
        
        s = db.createUser(nickname, name, "",  birthYear);
        assertEquals(s, "Wrong data");
        
        user = db.getUserByNickname(nickname);
        assertNull(user);
        
        s = db.createUser("nebo", name, surname,  0);
        assertEquals(s, "Done");
        user = db.getUserByNickname("nebo");
        assertNotNull(user);
        
    }
    
    @Test
    public void testPutUser(){
     
        DataBase db = DataBase.getDB();
        
        String nickname = "nn";
        String name = "Maja";
        String surname = "Zivkovic";
        int birthYear = 1993;
        
        String s = db.createUser(nickname, name, surname,  birthYear);
        
        assertEquals(s, "Done");
        
        User user = db.getUserByNickname(nickname);
        assertNotNull(user);
        assertEquals(nickname, user.getNickname());
        assertEquals(name, user.getName());
        assertEquals(surname, user.getSurname());
        assertEquals(birthYear, user.getBirthYear());
        
        
    }
    
  
    @Test
    public void testPutExistingUser(){
     
        DataBase db = DataBase.getDB();
        
        String nickname = "svinjcica";
        String name = "Maja";
        String surname = "Zivkovic";
        int birthYear = 1993;
        
        String s = db.createUser(nickname, name, surname,  birthYear);
        assertEquals(s, "Done");
        
        User user = db.getUserByNickname(nickname);
        assertNotNull(user);
        assertEquals(nickname, user.getNickname());
        assertEquals(name, user.getName());
        assertEquals(surname, user.getSurname());
        assertEquals(birthYear, user.getBirthYear());
        
        s = db.createUser(nickname, name, surname,  birthYear);
        assertEquals(s, "User already exists");
        
    }
    public MyUserJunitTest(){
    }
}
