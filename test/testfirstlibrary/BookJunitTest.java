/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfirstlibrary;


import db.*;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MAJA
 */
public class BookJunitTest {

    /**
     * @param args the command line arguments
     */
    @Test
    public void testBookInsert(){
        DataBase db = DataBase.getDB();
        int idLast = Book.PosID;
        String name = "Na Drini cuprija";
        String author = "Ivo Andric";
        String publisher = "Zavod za udzbenike";
        db.addBook(name,author ,publisher , 375, 2012);
        
        ArrayList<Book> book = db.searchBook(name, author, publisher);
        assertEquals(1, book.size());
        assertEquals(idLast+1, book.get(0).getID());
        assertEquals(name, book.get(0).getName());
        assertEquals(author, book.get(0).getAuthor());
        assertEquals(publisher, book.get(0).getPublisher());
        
    }
    
    @Test
    public void testWrongData(){
        DataBase db = DataBase.getDB();
        int idLast = Book.PosID;
        db.addBook("","Ivo Andric" ,"Zavod za udzbenike" , 375, 2012);
        assertEquals(idLast, Book.PosID);
        
        db.addBook("Neko ime","Ivo Andric" ,"Zavod za udzbenike" , -375, 2012);
        assertEquals(idLast, Book.PosID);
        
        db.addBook("Neko ime","" ,"Zavod za udzbenike" , 375, 2012);
        assertEquals(idLast, Book.PosID);
        
        db.addBook("Neko ime","Ivo Andric" ,"" , 375, 2012);
        assertEquals(idLast, Book.PosID);
        
        db.addBook("Neko ime","Ivo Andric" ,"Zavod za udzbenike" , 375, -2012);
        assertEquals(idLast, Book.PosID);
        
        db.addBook("Postoji ime sve super","Ivo Andric" ,"Zavod za udzbenike" , 375, 2012);
        assertEquals(idLast+1, Book.PosID);
        
    }
    
  
    
    public BookJunitTest(){
    }
}
