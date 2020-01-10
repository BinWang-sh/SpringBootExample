package com.springboot.aop.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.aop.test.bean.Book;
import com.springboot.aop.test.inface.BookService;

@RestController
@RequestMapping("/book")
public class BookAOPController {
	@Autowired
	private BookService bookService = null;

	@ResponseBody
	@GetMapping("/showbookinfo")
	public Book showBookInfo(@RequestParam String bookID, @RequestParam String bookName, @RequestParam String author) {
		Book book = null;

		if (bookID != null) {
			book = new Book();
			book.setID(bookID);
			book.setName(bookName);
			book.setAuthor(author);
		}
		bookService.showBookInfo(book);

		return book;
	}
}