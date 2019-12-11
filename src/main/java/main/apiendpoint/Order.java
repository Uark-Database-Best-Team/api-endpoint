package main.apiendpoint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer orderId;
  private String creationDate;
  private String orderStatus;
  private Integer shippingAddressId;
  private float price;
  private Integer billingAddressId;
  private Integer creditCardId;
  private Integer customerId;
  private Integer employeeId;



  // Primary key, orderId in this case.
  public Integer getId() {
    return orderId;
  }

  public void setId(Integer id) {
    this.orderId = id;
  }

  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String cd) {
    this.creationDate= cd;
  }

  public Integer getShippingAddressId() {
    return shippingAddressId;
  }

  public void setShippingAddressId(Integer sa) {
    this.shippingAddressId = sa;
  }

  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String os) {
    this.orderStatus= os;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public Integer getCreditCardId() {
    return creditCardId;
  }

  public void setCreditCardId(Integer cc) {
    this.creditCardId = cc;
  }

  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer ci) {
    this.customerId = ci;
  }

  public Integer getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Integer ei) {
    this.employeeId= ei;
  }

  public Integer getBillingAddressId() {
    return billingAddressId;
  }

  public void setBillingAddressId(Integer ba) {
    this.billingAddressId = ba;
  }



}