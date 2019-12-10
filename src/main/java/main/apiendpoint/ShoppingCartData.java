package main.apiendpoint;

import java.util.List;

class ShoppingCartData {
  ShoppingCart cart;
  List<ShoppingCartItem> items;
  List<Book> books;

  public ShoppingCart getCart() {
    return cart;
  }

  public void setShoppingCart(ShoppingCart cart) {
    this.cart = cart;
  }

  public List<ShoppingCartItem> getItems() {
    return items;
  }

  public void setItems(List<ShoppingCartItem> items) {
    this.items = items;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }
}
