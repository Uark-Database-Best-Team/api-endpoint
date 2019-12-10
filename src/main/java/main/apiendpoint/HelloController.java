package main.apiendpoint;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin
@RestController
public class HelloController {
  @Autowired

  BookRepository booksController;
  ShoppingCartRepository cartController;
  ShoppingCartItemRepository cartItems;

  @RequestMapping("/")
  public String index() {
    return "Fuck you";
  }

  @RequestMapping("/books")
  public Iterable<Book> books() {
    return booksController.getAllBooks();
  }

  @RequestMapping("/book")
  public Book getBookById(@RequestParam Integer id) {
    return booksController.getBook(id);
  }

  @PutMapping("/book")
  public String addBook(@RequestBody Book book) {
    booksController.insertBook(book.getIsbn(), book.getTitle(), book.getCategory(), book.getEdition(), book.getPrice(),
        book.getPublisher(), book.getAuthors(), book.getYear());
    return "okay";
  }

  @RequestMapping("/book/search")
  public Iterable<Book> books(@RequestParam String author) {
    return booksController.searchByAuthor(author);
  }

  @RequestMapping("/cart")
  public ShoppingCart getCart(@RequestParam Integer id) {
    System.out.println(id);
    return cartController.getCartById(id);
  }

  @RequestMapping("/cart/items")
  public Iterable<ShoppingCartItem> getCartItems(@RequestParam Integer id) {
    return cartItems.getCartItemsByCartId(id);
  }

  @RequestMapping("/cart/data")
  public ShoppingCartData getShoppingCartData(@RequestParam Integer id) {
    ShoppingCartData data = new ShoppingCartData();

    // System.out.println(id);

    // ShoppingCart cart = cartController.getCart(id);
    // System.out.println(cart);
    // data.setShoppingCart(cart);

    // System.out.println(cart);

    // List<ShoppingCartItem> items = cartItems.getCartItemsByCartId(id);
    // data.setItems(items);

    // List<Book> books = new ArrayList<>();
    // for (ShoppingCartItem item : items) {
    // books.add(booksController.getBook(item.getIsbn()));
    // }
    // data.setBooks(books);

    return data;
  }

  @PutMapping("/cart/item")
  public String addCartItem(@RequestBody ShoppingCartItem item) {
    cartItems.addItemToCart(item.getCartItemId(), item.getQuantity(), item.getQuantity(), item.getCartId())
    return "goooooooooooooooood morning Hong Kong!";
  }

}