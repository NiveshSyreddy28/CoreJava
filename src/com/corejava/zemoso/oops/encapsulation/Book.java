package com.corejava.zemoso.oops.encapsulation;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int numPages;

    public Book(String title, String author, String genre, int numPages){
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumPages() {
        return numPages;
    }

    public void printBook(){
        System.out.println("Title of book: "+this.title+" Author: "+this.author+" Genre of book: "
                +this.genre+" number of pages: "+this.numPages);
    }
}
