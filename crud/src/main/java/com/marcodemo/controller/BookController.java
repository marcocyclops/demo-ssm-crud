package com.marcodemo.controller;

import com.marcodemo.pojo.Book;
import com.marcodemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    // controller call service
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;


    // addbook
    @GetMapping("/add")
    public String addbook() {
        return "addbook";
    }

    // store
    @PostMapping("/add")
    public String store(Book book) {
        bookService.addBook(book);
        return "redirect:/books/";
    }

    // list
    @GetMapping("/")
    public String list(Model model) {
        List<Book> list = bookService.queryAllBooks();
        model.addAttribute("list", list);
        return "list";
    }

    @GetMapping("/{id}")
    public String book(@PathVariable("id") int id, Model model) {
        Book book = bookService.queryBookById(id);
        model.addAttribute(book);
        return "book";
    }

    // edit
    @GetMapping("/update/{id}")
    public String edit(@PathVariable("id") int id, Model model) {
        Book book = bookService.queryBookById(id);
        model.addAttribute(book);
        return "edit";
    }

    @PutMapping("/update/{id}")  // need to config HiddenHttpMethodFilter in web.xml
    public String update(Book book) {
        bookService.updateBook(book);
        return "redirect:/books/";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        bookService.deleteBookById(id);
        return "redirect:/books/";
    }

}
