package main.apiendpoint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class ShoppingCartItem {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer cartItemId;
  private Integer quantity;
  private Integer isbn;
  private Integer cartId;

  public Integer getCartItemId() {
    return this.cartItemId;
  }

  public void setCartItemId(Integer cartItemId) {
    this.cartItemId = cartItemId;
  }

  public Integer getQuantity() {
    return this.quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Integer getIsbn() {
    return this.isbn;
  }

  public void setIsbn(Integer isbn) {
    this.isbn = isbn;
  }

  public Integer getCartId() {
    return this.cartId;
  }

  public void cartItemId(Integer cartItemId) {
    this.cartItemId = cartItemId;
  }
}