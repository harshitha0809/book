package book_application.service;

import java.util.Map;

import book_application.model.book;

public interface book_api_service {
	int add_book(book book);

	book update_book(book book);

	void delete_book(int isbn);

	book get_book(int isbn);

	Map<Integer, book> getAllBook();

}
