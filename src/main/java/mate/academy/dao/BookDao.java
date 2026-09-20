package mate.academy.dao;

import mate.academy.model.Book;

import java.util.Optional;

public interface Dao {
    //crud
    //create
    void create(Book book);

    //read
    Book get(Long id);
    Optional<Book> getById(Long id);

    //update
    void update(Book book);

    //delete
    void delete(Long id);



}
