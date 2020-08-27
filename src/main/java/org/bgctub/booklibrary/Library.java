package org.bgctub.booklibrary;

public class Library {
    //instance variables
    private Book[] books;
    private Student[] students;

    public Library(Book[] _books, Student[] _students){
        this.books=_books;
        this.students=_students;
    }


    public static void main(String[] args){
        //local variable
        String auth[]= {"Ali","abbas"};
        Book book1= new Book(432423434, auth, "Book", "12th July 1992", "GOOD BOOK");
        Book book2= new Book(432423435, auth, "Book", "12th July 1992", "GOOD BOOK");
        Book book3= new Book(432423436, auth, "Book", "12th July 1992", "GOOD BOOK");
        Book book4= new Book(432423437, auth, "Book", "12th July 1992", "GOOD BOOK");
        Student student1 = new Student(1903330);
        Student student2 = new Student(1903331);

        book1.borrow(student2);
        
        Student[] _students={student1,student2};
        Book[] _books={book1,book2,book3,book4};
        Library lib = new Library(_books,_students);
        for(Book bk:lib.books){
            if(bk.isBorrowed()!=null)System.out.println(bk.getIsbn()+" : "+bk.isBorrowed().getRollNo());
            else System.out.println(bk.getIsbn()+" is available for borrow");
        }
        
        
    }
}