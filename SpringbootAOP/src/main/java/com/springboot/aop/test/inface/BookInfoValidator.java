package com.springboot.aop.test.inface;

import com.springboot.aop.test.bean.Book;

public interface BookInfoValidator {
	public boolean validate(Book book);
}
