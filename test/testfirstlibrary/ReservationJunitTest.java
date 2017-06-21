/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfirstlibrary;


import db.Book;
import db.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author MAJA
 */
public class ReservationJunitTest {

    /**
     * @param args the command line arguments
     */
    
    @BeforeClass
    public static void set(){
        DataBase db = DataBase.getDB();
        db.addBook("Na Drini cuprija", "Ivo Andric", "Zavod za udzbenike", 375, 2012);
        db.addBook("Dervis i smrt", "Mesa Selimovic", "Stubovi kulture", 380, 2014);
        db.addBook("Enciklopedija mrtvih", "Danilo Kis", "Stubovi kulture", 250, 2010);
        db.addBook("Enciklopedija mrtvih 2", "Danilo Kis", "Stubovi kulture", 250, 2010);
        
        db.createUser("maja123", "Maja", "Zivkovic",1993 );
        db.createUser("sanjaz", "Sanja", "Zivkovic",1991 );
        db.createUser("milena1", "Milena", "Milovanovic",1992 );
        db.createUser("neko", "Pera", "Peric",1993 );
    }
    
    @Test
    public void testMakeReservation(){
        DataBase db = DataBase.getDB();
        String username = "maja123";
        Book b = db.searchBook("Na Drini cuprija" , "Ivo Andric", "Zavod za udzbenike").get(0);
        Purchase myPurchase = db.addPurchase(username, b);

        assertEquals(username, myPurchase.getUsername());
        assertEquals(b, myPurchase.getBook());
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        
        assertEquals(year, myPurchase.getYear());
        assertEquals(month, myPurchase.getMonth());
        
    }
    
    
    @Test
    public void makeBadReservaion(){
        DataBase db = DataBase.getDB();
        String username = "nepostoji";
        Book b = db.searchBook("Na Drini cuprija" , "Ivo Andric", "Zavod za udzbenike").get(0);
        Purchase myPurchase = db.addPurchase(username, b);
        
        assertNull(myPurchase);
        
    }
    
    
    public ReservationJunitTest(){
    }
}
