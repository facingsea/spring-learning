package com.facingsea.springexercise.e_related_bean.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student implements ApplicationContextAware {
	
	private String bookId;
	private ApplicationContext ac;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ac = applicationContext;
	}

	public void readBook() {
		Book book = (Book) ac.getBean(bookId);
		System.out.println("read the book: " + book.getName());
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

}
