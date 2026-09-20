package mate.academy;

import mate.academy.dao.BookDao;
import mate.academy.dao.impl.BookDaoImpl;
import mate.academy.lib.Injector;
import mate.academy.model.Book;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");

        BookDao bookDao = (BookDao) injector.getInstance(BookDao.class);

        Book book = new Book()
                .setTitle("Harry Potter")
                .setPrice(new BigDecimal("25.50"));

        bookDao.create(book);

        System.out.println(bookDao.findById(20L));


    }
}
