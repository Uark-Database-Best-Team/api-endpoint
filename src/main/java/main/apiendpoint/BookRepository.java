package main.apiendpoint;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
  @Query(value = "SELECT * FROM books", nativeQuery = true)
  List<Book> getAllBooks();

  @Query(value = "SELECT * FROM books WHERE authors = ?1", nativeQuery = true)
  List<Book> searchByAuthor(String title);
}