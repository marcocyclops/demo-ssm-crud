package com.marcodemo.controller;

import com.marcodemo.pojo.Book;
import com.marcodemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    // controller call service
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    // list
    @RequestMapping("/allbooks")
    public String list(Model model) {
        List<Book> list = bookService.queryAllBooks();
        model.addAttribute("list", list);
        return "allBook";
    }

}
