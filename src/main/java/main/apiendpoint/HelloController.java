package main.apiendpoint;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin
@RestController
public class HelloController {
  @Autowired
  BookRepository booksController;

  @Autowired
  ShoppingCartRepository cartController;

  @Autowired
  ShoppingCartItemRepository cartItems;

  @RequestMapping("/")
  public String index() {
    return "Hello World";
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

  @RequestMapping("/carts")
  public List<ShoppingCart> getAllCarts() {
    return cartController.getAllCarts();
  }

  @RequestMapping("/cart")
  public ShoppingCart getCart(@RequestParam Integer id) {
    return cartController.getCartById(id);
  }

  @RequestMapping("/user/carts")
  public ShoppingCart getCartsByUserId(@RequestParam Integer id) {
    return cartController.getCartById(id);
  }

  @RequestMapping("/cart/items")
  public Iterable<ShoppingCartItem> getCartItems(@RequestParam Integer id) {
    return cartItems.getCartItemsByCartId(id);
  }

  @RequestMapping("/cart/all-items")
  public Iterable<ShoppingCartItem> getCartAllItems() {
    return cartItems.getAllCartItems();
  }

  @RequestMapping("/cart/data")
  public ShoppingCartData getShoppingCartData(@RequestParam Integer id) {
    ShoppingCartData data = new ShoppingCartData();

    ShoppingCart cart = cartController.getCartById(id);
    System.out.println(cart);
    data.setShoppingCart(cart);

    List<ShoppingCartItem> items = cartItems.getCartItemsByCartId(id);
    System.out.println(items);
    data.setItems(items);

    List<Book> books = new ArrayList<>();
    for (ShoppingCartItem item : items) {
      System.out.println(item);
      books.add(booksController.getBook(item.getIsbn()));
    }
    data.setBooks(books);

    return data;
  }

  @PutMapping("/cart")
  public ShoppingCart createShoppingCart(@RequestBody ShoppingCart cart) {
    Date createData = new Date(1);
    cartController.createShoppingCart(cart.getCartId(), cart.getCartName(), cart.getCustomerId(), createData);
    return cartController.getCartById(cart.getCartId());
  }

  @PutMapping("/cart/item")
  public String addCartItem(@RequestBody ShoppingCartItem item) {
    cartItems.addItemToCart(item.getCartItemId(), item.getQuantity(), item.getIsbn(), item.getCartId());

    return "Added item";
  }

  @PostMapping("/cart/merge")
  public ShoppingCartData mergeShoppingCarts(@RequestBody MergeShoppingCartRequest req) {
    cartController.mergeShoppingCarts(req.cartId1, req.cartId2);
    return getShoppingCartData(req.cartId1);
  }
}

class MergeShoppingCartRequest {
  public Integer cartId1;
  public Integer cartId2;
}