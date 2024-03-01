package com.chandan.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop {
	private int title;
	private List<Book> books = new ArrayList<>();

	public int getTitle() {
		return title;
	}

	public void setTitle(int title) {
		this.title = title;
	}

	public void addBooks() {
		for (int i = 0; i < 10; i++) {
			Book book = new Book();
			book.setId(i);
			book.setName("Book " + i);
		}
	}

	@Override
	public String toString() {
		return "BookShop [title=" + title + ", books=" + books + "]";
	}

}
