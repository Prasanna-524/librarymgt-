package ui;
import entities.Author;
import entities.Book;
import service.LibraryServiceImpl;
import service.LibraryService;
import java.util.*;

public class LibraryMain {
    private LibraryService service =new LibraryServiceImpl();
    public static void main(String args[])
    {
        LibraryMain librarydemo =new LibraryMain();
        librarydemo.run();
    }
    private void run() {
        Author author1 = new Author("101", "chinni");
        Author author2 = new Author("201", "ammu");
        Author author3 = new Author("301", "chinna");
        Book book1 = new Book("JR1","java",250 ,author1);
        Book book2 = new Book("JR2","c",350 ,author2);
        Book book3 = new Book("JR3","python",200 ,author3);
        service.addBook(book1);
        service.addBook(book2);
        service.addBook(book3);
        showAll();
    }
    private void  showAll() {
        List<Book> list=service.displayAll();
        for(Book books:list)
        {
            booksdisplay(books);
        }
    }
    private void booksdisplay(Book book) {
        System.out.println("books display");
        Author authorname=book.getAuthor();
        System.out.println(" author "+authorname.getName()+" book name "+authorname.getName()+ "book price "+book.getCost());
    }
}