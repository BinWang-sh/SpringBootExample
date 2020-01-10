package com.springboot.aop.test.service;

import org.springframework.stereotype.Service;

import com.springboot.aop.test.bean.Book;
import com.springboot.aop.test.inface.BookService;


@Service
public class BookServiceImpl implements BookService {

	@Override
	public void showBookInfo(Book book) {
		// TODO Auto-generated method stub
		
		if (book == null) {
			throw new RuntimeException("null object");
		}
		System.out.print("Bookid:"+ book.getID());
		System.out.print("\t BookName:" + book.getName());
		System.out.println("\t Author:" + book.getAuthor());
	}

}
