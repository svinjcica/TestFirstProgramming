/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author MAJA
 */
public class DataBase {
    private static DataBase db = null;
    HashMap<String, User> users = new HashMap<String, User>();
    HashMap<Integer, Book> books = new HashMap<Integer, Book>();
    HashMap<Integer, Purchase> purchases = new HashMap<Integer, Purchase>();
    
    private DataBase(){}
    
    public static DataBase getDB(){
        if(db == null) db = new DataBase();
        return db;
    }
    public User getUserByNickname(String nickname) {
        return users.get(nickname);
    }

    public String createUser(String nickname, String name, String surname, int birthYear) {
        if(nickname.equals("") || name.equals("")|| surname.equals("")) return "Wrong data";
        if(users.get(nickname) != null) return "User already exists"; 
        users.put(nickname,new User(nickname, name, surname, birthYear));
        return "Done";
    }

    public ArrayList<Book> searchBook(String name, String author, String publisher) {
        ArrayList<Book> list = new ArrayList<Book>(books.values());
        ArrayList<Book> mybooks = new ArrayList<Book>();
        
        boolean emptyName = name.equals("");
        boolean emptyAuthor = author.equals("");
        boolean emptyPublisher = publisher.equals("");
        
        if(emptyPublisher && emptyAuthor && emptyName) 
            return list;
        
        for(Book b: list){
            if(!emptyName){
                if(!b.getName().equals(name))
                    continue;
                if(!emptyAuthor){
                    if(!b.getAuthor().equals(author)) continue;
                }
                if(!emptyPublisher){
                    if(!b.getPublisher().equals(publisher))
                        continue;
                    
                }
                mybooks.add(b);
                continue;
            }
            else if(!emptyAuthor){
                    if(!b.getAuthor().equals(author)) 
                        continue;
                    if(!emptyPublisher){
                        if(!b.getPublisher().equals(publisher))
                            continue;
                    }
                    mybooks.add(b);
                    continue;
            }
            else if(!emptyPublisher){
                    if(!b.getPublisher().equals(publisher))
                        continue;
            }
            mybooks.add(b);
        }
        
        return mybooks.size() > 0? mybooks:null;
    }

    public void addBook(String name, String author, String publisher, int cost, int year) {
        if(name.equals("") ||author.equals("") || publisher.equals("") || cost< 0 || year < 0 ) return;
        Book b = new Book(name, author, publisher, cost, year);
        books.put(b.getID(), b);
    }

    public Purchase addPurchase(String username, Book b) {
        User u = getUserByNickname(username);
        if(u == null) return null;
        Purchase p = new Purchase(username, b);
        purchases.put(p.getID(), p);
        return p;
    }
}
