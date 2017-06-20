/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author MAJA
 */
public class Book {
    private static int PosID = 0;
    private int ID = ++PosID;
    private String name, author, publisher; 
    private int cost, year;

    public Book(String name, String author, String publisher, int brStr, int godIzd) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.cost = brStr;
        this.year = godIzd;
    }

    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String book) {
        this.name = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int brStr) {
        this.cost = brStr;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int godIzd) {
        this.year = godIzd;
    }

    public int getID() {
        return ID;
    }
    
    
    
    
}
