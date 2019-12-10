package main.apiendpoint;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin
@RestController
public class HelloController {
  @Autowired

  BookRepository books;

  @RequestMapping("/")
  public String index() {
    return "Fuck you";
  }

  @RequestMapping("/books")
  public Iterable<Book> books() {
    return books.getAllBooks();
  }

  @RequestMapping("/book/search")
  public Iterable<Book> books(@RequestParam String author) {
    return books.searchByAuthor(author);
  }

}