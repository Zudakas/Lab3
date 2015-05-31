package com.company;

import java.util.Date;

/**
 * Created by Brad Myers on 5/29/2015.
 */
public class Book {

    private String authorFirstName, authorLastName, bookTitle;
    private Date publicationDate;
    private int ISBNnumber, numPages;

    public void Book(int isbn, String title, int pages, String aFirstName, String aLastName, Date pDate){
        this.ISBNnumber = isbn;
        this.bookTitle = title;
        this.numPages = pages;
        this.authorFirstName = aFirstName;
        this.authorLastName = aLastName;
        this.publicationDate = pDate;
    }
    public void Book(){
        this.ISBNnumber = 0;
        this.bookTitle = "";
        this.numPages = 0;
        this.authorFirstName = "";
        this.authorLastName = "";
        this.publicationDate = new Date();
    }
    // Setters
    public void setISBNnumber(int in){
        this.ISBNnumber = in;
    }
    public void setBookTitle(String in){
        bookTitle = in;
    }
    public void setNumPages(int in){
        this.numPages = in;
    }
    public void setAuthorFirstName(String in){
        this.authorFirstName = in;
    }
    public void setAuthorLastName(String in){
        this.authorLastName = in;
    }
    public void setPublicationDate(Date in){
        publicationDate = in;
    }
    // Getters
    public int getISBNnumber(){
        return this.ISBNnumber;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public int getNumPages() {
        return numPages;
    }
    public String getAuthorFirstName() {
        return authorFirstName;
    }
    public String getAuthorLastName() {
        return authorLastName;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }
}
