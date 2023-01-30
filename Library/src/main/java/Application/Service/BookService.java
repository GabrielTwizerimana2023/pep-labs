package Application.Service;

import Application.DAO.BookDAO;
import Application.Model.Book;
import Application.Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.h2.command.ddl.PrepareProcedure;

/**
 * The purpose of a Service class is to contain "business logic" that sits between the web layer (controller) and
 * persistence layer (DAO). That means that the Service class performs tasks that aren't done through the web or
 * SQL: programming tasks like checking that the input is valid, conducting additional security checks, or saving the
 * actions undertaken by the API to a logging file.
 *
 * It's perfectly normal to have Service methods that only contain a single line that calls a DAO method. An
 * application that follows best practices will often have unnecessary code, but this makes the code more
 * readable and maintainable in the long run!
 */
public class BookService {
    public BookDAO bookDAO;

    /**
     * No-args constructor for bookService which creates a BookDAO.
     * There is no need to change this constructor.
     */
    public BookService(){
        bookDAO = new BookDAO();
    }
    /**
     * Constructor for a BookService when a BookDAO is provided.
     * This is used for when a mock BookDAO that exhibits mock behavior is used in the test cases.
     * This would allow the testing of BookService independently of BookDAO.
     * There is no need to modify this constructor.
     * @param bookDAO
     */
    public BookService(BookDAO bookDAO){
        this.bookDAO = bookDAO;
    }
    /**
     * TODO: Use the bookDAO to retrieve all books.
     * @return all books.
     */
    public List<Book> getAllBooks() {
        Connection conn=ConnectionUtil.getConnection();
        List<Book> books=new ArrayList<>();
        try {
            String sql="SELECT * FROM book;";
            PreparedStatement preps=conn.prepareStatement(sql);
            ResultSet rs=preps.executeQuery();
            while(rs.next()){
             Book book=new Book(rs.getInt("isbn"),rs.getInt("author_id"),
             rs.getString("title"),rs.getInt("copies_available"));
             books.add(book);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return books;
    }
    /**
     * TODO: Use the bookDAO to persist a book to the database.
     * An ISBN will be provided in Book. Method should check if the book ISBN already exists before it attempts to
     * persist it.
     * @param book a book object.
     * @return book if it was successfully persisted, null if it was not successfully persisted (eg if the book primary
     * key was already in use.)
     */
    public Book addBook(Book book) {
        Connection conn=ConnectionUtil.getConnection();
    try {
        String sql="INSERT INTO book (isbn,author_id,title,copies_available) VALUES (?,?,?,?)";
        PreparedStatement preps=conn.prepareStatement(sql);
        preps.setInt(1,book.getIsbn());
        preps.setInt(2,book.getAuthor_id());
        preps.setString(3, book.getTitle());
        preps.setInt(4, book.getCopies_available());
        preps.executeUpdate();
        return book;
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
        return null;
    }
    /**
     * TODO: Use the bookDAO to retrieve a list of all books that have a bookCount above 0.
     * @return all available books (bookCount over zero)
     */
    public List<Book> getAllAvailableBooks() {
        List<Book> books=new ArrayList<>();
        Connection conn=ConnectionUtil.getConnection();
        try {
            String sql="SELECT * FROM book WHERE copies_available>?;";
            PreparedStatement preps=conn.prepareStatement(sql);
            ResultSet rs=preps.executeQuery();
            while(rs.next()){
            Book book=new Book(rs.getInt("isbn"),rs.getInt("author_id"),
            rs.getString("title"),rs.getInt("copies_available"));
            books.add(book);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return books;
    }

}
