package org.bgctub.booklibrary;

public class Book {
    private int isbn;
    private String authors[];
    private String title;
    private String publicationDate;
    private String summary;
    private Student st; 

    public Book(){
        System.out.println("BOOK CLASS: ");
    }

    public Book(int _isbn, String _authors[], String _title, String _publicationDate, String _summary){
        this.isbn=_isbn;
        this.authors=_authors;
        this.title=_title;
        this.publicationDate=_publicationDate;
        this.summary=_summary;
    }

    public int getIsbn(){
        return this.isbn;
    }

    public void borrow(Student st){        
        this.st=st;
        
    }

    public Student isBorrowed(){
        return this.st;
    }

    
}