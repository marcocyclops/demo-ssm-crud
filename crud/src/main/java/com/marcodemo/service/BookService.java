package com.marcodemo.service;

import com.marcodemo.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    // create a book
    int addBook(Book book);

    // read a book
    Book queryBookById(int id);

    // read a book list
    List<Book> queryAllBooks();

    // update a book
    int updateBook(Book book);

    // delete a book
    int deleteBookById(int id);
}
