package mate.academy.dao;

import mate.academy.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookDao {
    //crud
    //create
    Book create(Book book);

    //read
    Book get(Long id);
    Optional<Book> findById(Long id);

    //update
    Book update(Book book);

    //delete
    boolean deleteById(Long id);

    //finally, we can add a method to find all books
    List<Book> findAll();
/*
- Book create(Book book); k
- Optional<Book> findById(Long id); k
- List<Book> findAll();
- Book update(Book book);
- boolean deleteById(Long id);
 */
}
