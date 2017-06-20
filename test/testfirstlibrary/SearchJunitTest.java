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
public class SearchJunitTest {

    /**
     * @param args the command line arguments
     */
    @Test
    public void testSearchAll(){
        DataBase db = new DataBase();
        String book = "Na Drini cuprija";
        String author = "Ivo Andric";
        String publisher = "Zavod za udzbenike";
        int brStr = 375;
        int godIzd = 2012;
        
        db.addBook("Na Drini cuprija", "Ivo Andric", "Zavod za udzbenike", 375, 2012);
        db.addBook("Dervis i smrt", "Mesa Selimovic", "Stubovi kulture", 380, 2014);
        db.addBook("Enciklopedija mrtvih", "Mesa Selimovic", "Stubovi kulture", 250, 2010);
        
        ArrayList<Book> books = db.searchBook(book, author, publisher);
        
        assertEquals(1, books.size());
        
        Book b = books.get(0);
        assertEquals(b.getAuthor(), author);
        assertEquals(b.getPublisher(), publisher);
        assertArrayEquals( b.getName(), book);
        
    }
    
    public SearchJunitTest(){
    }
}
