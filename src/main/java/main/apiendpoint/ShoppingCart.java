package main.apiendpoint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class ShoppingCart {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer cartId;
  private String cartName;
  private Integer customerId;
  private String createdDate;
  private String lastUpdatedDate;

  public Integer getCartId() {
    return this.cartId;
  }

  public void cartId(Integer cartId) {
    this.cartId = cartId;
  }

  public String getCartName() {
    return this.cartName;
  }

  public void setCartName(String cartName) {
    this.cartName = cartName;
  }

  public Integer getCustomerId() {
    return this.customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public String getCreatedDate() {
    return this.createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public String getLastUpdatedDate() {
    return this.lastUpdatedDate;
  }

  public void setLastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }
}