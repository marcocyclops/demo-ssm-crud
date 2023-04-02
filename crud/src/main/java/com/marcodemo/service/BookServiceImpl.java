package com.marcodemo.service;

import com.marcodemo.mapper.BookMapper;
import com.marcodemo.pojo.Book;

import java.util.List;

public class BookServiceImpl implements BookService{

    // service call dao
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Book book) {
            return bookMapper.addBook(book);
    }

    @Override
    public Book queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Book> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }
}
