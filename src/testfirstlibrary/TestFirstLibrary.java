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
        User user = db.getUserBy("svinjcica");
        assertEquals(null, user);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
