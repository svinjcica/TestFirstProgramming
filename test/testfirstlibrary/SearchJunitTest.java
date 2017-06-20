/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfirstlibrary;


import db.Book;
import db.*;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author MAJA
 */
public class SearchJunitTest {

    /**
     * @param args the command line arguments
     */
    
    @BeforeClass
    public static void set(){
        DataBase db = DataBase.getDB();
        db.addBook("Na Drini cuprija", "Ivo Andric", "Zavod za udzbenike", 375, 2012);
        db.addBook("Dervis i smrt", "Mesa Selimovic", "Stubovi kulture", 380, 2014);
        db.addBook("Enciklopedija mrtvih", "Mesa Selimovic", "Stubovi kulture", 250, 2010);
    }
    
    @Test
    public void testSearchAll(){
        DataBase db = DataBase.getDB();
        String book = "Na Drini cuprija";
        String author = "Ivo Andric";
        String publisher = "Zavod za udzbenike";
        
        ArrayList<Book> books = db.searchBook(book, author, publisher);
        
        assertEquals(1, books.size());
        
        Book b = books.get(0);
        assertEquals(b.getAuthor(), author);
        assertEquals(b.getPublisher(), publisher);
        assertEquals(b.getName(), book);
        
    }
    
    @Test
    public void testSearchTwo(){
        DataBase db = DataBase.getDB();
        String book = "Na Drini cuprija";
        String author = "Ivo Andric";
        String publisher = "Zavod za udzbenike";
        
        ArrayList<Book> books = db.searchBook(book, author, "");
        
        assertEquals(1, books.size());
        Book first = books.get(0);
        
        books = db.searchBook("", author, publisher);
        assertEquals(1, books.size());
        Book second = books.get(0);
        assertEquals(first, second);
        
        books = db.searchBook(book, "", publisher);
        assertEquals(1, books.size());
        Book thrid = books.get(0);
        assertEquals(first, thrid);
        assertEquals(second,thrid);
        
        
    }
    
    
    public SearchJunitTest(){
    }
}
