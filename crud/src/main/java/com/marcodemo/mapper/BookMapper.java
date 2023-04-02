package com.marcodemo.mapper;

import com.marcodemo.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    // create a book
    int addBook(Book book);

    // read a book
    Book queryBookById(@Param("bookID") int id);

    // read a book list
    List<Book> queryAllBooks();

    // update a book
    int updateBook(Book book);

    // delete a book
    int deleteBookById(@Param("bookID") int id);
}
