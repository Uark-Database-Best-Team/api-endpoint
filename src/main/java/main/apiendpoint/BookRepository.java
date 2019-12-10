package main.apiendpoint;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
  @Query(value = "SELECT * FROM books", nativeQuery = true)
  List<Book> getAllBooks();

  @Query(value = "SELECT * FROM books WHERE authors = ?1", nativeQuery = true)
  List<Book> searchByAuthor(String title);

  @Query(value = "INSERT INTO books (isbn, title, category, edition, price, publisher, authors, year) VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8);", nativeQuery = true)
  void insertBook(Integer isbn, String title, String category, Integer edition, Integer price, String publisher,
      String authors, Integer year);
}