package com.springboot.aop.test.validator;

import com.springboot.aop.test.bean.Book;
import com.springboot.aop.test.inface.BookInfoValidator;

public class BookInfoValidatorImpl implements BookInfoValidator{

	@Override
	public boolean validate(Book book) {
		
		System.out.println("Introduction:"+BookInfoValidator.class.getSimpleName());
		
		if ((book.getID()!=null)&&(book.getID().trim().length()>0)&&
			(book.getName()!=null)&&(book.getName().trim().length()>0)&&
			(book.getAuthor()!=null)&&(book.getAuthor().trim().length()>0)) {
			return true;
		}
		return false;
	}

}
