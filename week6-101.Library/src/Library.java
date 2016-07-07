
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Library {
    private ArrayList<Book> bookSet;

    public Library() {
        bookSet = new ArrayList<Book>();
    }
    public void addBook( Book newBook){
        bookSet.add(newBook);
    }
    public void printBooks(){
        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
    public ArrayList<Book> searchByTitle(String title){
        // iterate the list of books and add all the matching books to the list found
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : bookSet) {
            if ( StringUtils.included(book.title(), title)) {
                found.add(book);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByPublisher( String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : bookSet) {
            if ( StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByYear( int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : bookSet) {
            if ( book.year() == year ) {
                found.add(book);
            }
        }
        return found;
    }
}
