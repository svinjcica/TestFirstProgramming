/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfirstlibrary;

/**
 *
 * @author MAJA
 */
public class TestFirstLibrary {

    /**
     * @param args the command line arguments
     */
    
    public void testUserDontExist(){
        DataBase db = new DataBase();
        User user = db.getUserByNickname("s");
        assertEquals(null, user);
        
    }
    
    public void testPutUser(){
        
        DataBase db = new DataBase();
        
        String nickname = "svinjcica";
        String pass = "123";
        String name = "Maja";
        String surname = "Zivkovic";
        int birthYear = 1993;
        
        db.createUser(nickname,pass, name, surname,  birthYear);
        
        User user = db.getUserByNickname(nickname);
        assertNotNull(user);
        assertEquals(nickname, user.getNickname());
        assertEquals(pass, user.getPass());
        assertEquals(name, user.getName());
        assertEquals(surname, user.getSurname());
        assertEquals(birthYear, user.getBirthYear());
        
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
