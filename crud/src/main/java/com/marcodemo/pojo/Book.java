package com.marcodemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // lombok generate getter, setter, toString etc at compile time
@AllArgsConstructor  // lombok generate all args constructor at compile time
@NoArgsConstructor  // lombok generate no args constructor at compile time
public class Book {

    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
